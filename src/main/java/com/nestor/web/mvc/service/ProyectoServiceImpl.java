package com.nestor.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestor.web.mvc.dao.ProyectoRepository;
import com.nestor.web.mvc.entity.Proyecto;

import jakarta.transaction.Transactional;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	
	@Autowired
	ProyectoRepository proyectoRepository;

	@Override
	@Transactional
	public List<Proyecto> buscarProyectos() {
		return (List<Proyecto>) proyectoRepository.findAll();
	}

	@Override
	@Transactional
	public Proyecto buscarProyectoPorId(Long id) {
		return proyectoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
	}

	@Override
	@Transactional
	public Proyecto borrarProyecto(Long id) {
		Proyecto proyectoDelete = proyectoRepository.findById(id).orElse(null);
		proyectoRepository.deleteById(id);
		return proyectoDelete;
	}
	
}
