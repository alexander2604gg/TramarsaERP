package com.alexandersaul.TramarsaERP.mapper;

import com.alexandersaul.TramarsaERP.dto.buque.CreateBuqueDTO;
import com.alexandersaul.TramarsaERP.dto.buque.ResponseBuqueDTO;
import com.alexandersaul.TramarsaERP.entity.Buque;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuqueMapper {

    Buque toEntity (CreateBuqueDTO createBuqueDTO);
    List<ResponseBuqueDTO> toListDto (List<Buque> buqueList);
    ResponseBuqueDTO toDto (Buque buque);

}
