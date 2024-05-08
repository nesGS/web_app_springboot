package com.nestor.web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.web.mvc.entity.Alumnos;
import com.nestor.web.mvc.entity.Proyecto;
import com.nestor.web.mvc.service.AlumnosService;
import com.nestor.web.mvc.service.ProyectoService;


@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private AlumnosService servicioAlumno;
	
	@Autowired
	private ProyectoService servicioProyecto;

	@GetMapping("/alumnos")
	public List<Alumnos> index(){
		return servicioAlumno.listarAlumnos();
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumnos show(@PathVariable Long id) {
		return servicioAlumno.obtenerAlumnoPorId(id);
	}
	@PostMapping("/alumnos")
	public Alumnos create(@RequestBody Alumnos alumnos) {
		return servicioAlumno.guardarAlumno(alumnos);
	}
	
	@PutMapping("/alumnos/{id}")
	public Alumnos update(@PathVariable Long id, @RequestBody Alumnos alumnos) {
		
		Alumnos alumnosUpdate = servicioAlumno.obtenerAlumnoPorId(id); 
		alumnosUpdate.setNombre(alumnos.getNombre());
		alumnosUpdate.setApellido(alumnos.getApellido());
		alumnosUpdate.setEmail(alumnos.getEmail());
		alumnosUpdate.setTelefono(alumnos.getTelefono());
		alumnosUpdate.setDni(alumnos.getDni());
		alumnosUpdate.setFecha_nac(alumnos.getFecha_nac());
		
		return servicioAlumno.guardarAlumno(alumnosUpdate);
	}
	
	@DeleteMapping("/alumnos/{id}")
	public void delete(@PathVariable Long id) {
		servicioAlumno.eliminarAlumno(id);
	}
	
	
	@GetMapping("/proyectos")
	public List<Proyecto> indexProyecto(){
		return servicioProyecto.buscarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto showProyecto(@PathVariable Long id) {
		return servicioProyecto.buscarProyectoPorId(id);
	}
	
	@PostMapping("/proyectos")
	public Proyecto createProyecto(@RequestBody Proyecto proyecto) {
		return servicioProyecto.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto updateProyecto(@PathVariable Long id,@RequestBody Proyecto newProyecto) {
		Proyecto proyectoUpdate = servicioProyecto.buscarProyectoPorId(id);
		proyectoUpdate.setNombre(newProyecto.getNombre());
		proyectoUpdate.setFecha_inicio(newProyecto.getFecha_inicio());
		proyectoUpdate.setDescripcion(newProyecto.getDescripcion());
		proyectoUpdate.setFecha_fin(newProyecto.getFecha_fin());
		proyectoUpdate.setActivo(newProyecto.isActivo());
		
		return servicioProyecto.guardarProyecto(proyectoUpdate);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public Proyecto deleteProyecto(@PathVariable Long id) {
		return servicioProyecto.borrarProyecto(id);
	}
	
}
