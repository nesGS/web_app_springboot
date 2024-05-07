package com.nestor.web.mvc.service;

import java.util.List;

import com.nestor.web.mvc.entity.Alumnos;


public interface AlumnosService {
	
	
	public List<Alumnos> listarAlumnos();
	
	public Alumnos guardarAlumno(Alumnos alumno);
	
	public Alumnos obtenerAlumnoPorId(Long id);
	
	public void eliminarAlumno(Long id);


}
