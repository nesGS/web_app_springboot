package com.nestor.web.mvc.service;

import java.util.List;

import com.nestor.web.mvc.entity.Proyecto;

public interface ProyectoService {

	public List<Proyecto> buscarProyectos();
	
	public Proyecto buscarProyectoPorId(Long id);
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto borrarProyecto(Long id);
	
}
