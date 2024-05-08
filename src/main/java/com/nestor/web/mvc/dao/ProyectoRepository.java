package com.nestor.web.mvc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nestor.web.mvc.entity.Proyecto;

@Repository
public interface ProyectoRepository extends CrudRepository<Proyecto, Long> {

}
