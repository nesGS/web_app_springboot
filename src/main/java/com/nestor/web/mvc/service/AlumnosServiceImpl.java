package com.nestor.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestor.web.mvc.dao.AlumnosRepository;
import com.nestor.web.mvc.entity.Alumnos;


@Service
public class AlumnosServiceImpl implements AlumnosService{

	@Autowired
	private AlumnosRepository alumnosRepository;
	
	@Override
	public List<Alumnos> listarAlumnos() {
		return alumnosRepository.findAll();
	}

	@Override
	public Alumnos guardarAlumno(Alumnos alumno) {
		return alumnosRepository.save(alumno);
	}

	@Override
	public Alumnos obtenerAlumnoPorId(Long id) {
		return alumnosRepository.findById(id).get();
	}

	@Override
	public void eliminarAlumno(Long id) {
		alumnosRepository.deleteById(id);
	}

}
