package com.alexandersaul.TramarsaERP.service;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.buque.ResponseBuqueDTO;

import java.util.List;

public interface IBuqueService {

    void createBuque (CreateBuqueDTO createBuqueDTO);
    List<ResponseBuqueDTO> getAllBuques();

}
