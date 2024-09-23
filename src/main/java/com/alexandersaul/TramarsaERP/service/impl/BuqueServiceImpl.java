package com.alexandersaul.TramarsaERP.service.impl;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.buque.ResponseBuqueDTO;
import com.alexandersaul.TramarsaERP.entity.Buque;
import com.alexandersaul.TramarsaERP.exception.ResourceNotFoundException;
import com.alexandersaul.TramarsaERP.mapper.BuqueMapper;
import com.alexandersaul.TramarsaERP.repository.BuqueRepository;
import com.alexandersaul.TramarsaERP.service.IBuqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuqueServiceImpl implements IBuqueService{

    @Autowired
    private BuqueRepository buqueRepository;
    @Autowired
    private BuqueMapper buqueMapper;

    @Override
    public void createBuque(CreateBuqueDTO createBuqueDTO) {
        Buque buque = buqueMapper.toEntity(createBuqueDTO);
        buqueRepository.save(buque);
    }

    @Override
    public List<ResponseBuqueDTO> getAllBuques() {
        List<Buque> buqueList = (List<Buque>) buqueRepository.findAll();
        return buqueMapper.toListDto(buqueList);
    }

    @Override
    public ResponseBuqueDTO findByImo(String imo) {
        Buque buque = buqueRepository.findById(imo).orElseThrow(
                () -> new ResourceNotFoundException("Buque" , "imo" , imo)
        );
        return buqueMapper.toDto(buque);
    }

}
