package com.alexandersaul.TramarsaERP.repository;

import com.alexandersaul.TramarsaERP.entity.Buque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuqueRepository extends CrudRepository<Buque , String> {
}
