package com.alexandersaul.TramarsaERP.service.impl;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.entity.Buque;
import com.alexandersaul.TramarsaERP.mapper.BuqueMapper;
import com.alexandersaul.TramarsaERP.repository.BuqueRepository;
import com.alexandersaul.TramarsaERP.service.IBuqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
