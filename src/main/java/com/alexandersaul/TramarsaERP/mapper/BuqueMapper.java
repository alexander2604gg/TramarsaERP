package com.alexandersaul.TramarsaERP.mapper;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.entity.Buque;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BuqueMapper {

    Buque toEntity (CreateBuqueDTO createBuqueDTO);

}
