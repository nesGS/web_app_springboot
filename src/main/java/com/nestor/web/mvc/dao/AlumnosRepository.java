package com.nestor.web.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestor.web.mvc.entity.Alumnos;


@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, Long>{

	
}
