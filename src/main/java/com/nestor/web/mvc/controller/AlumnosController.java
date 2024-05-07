package com.nestor.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nestor.web.mvc.entity.Alumnos;
import com.nestor.web.mvc.service.AlumnosService;


@Controller
public class AlumnosController {
 
	@Autowired
	private AlumnosService alumnosService;
	 
	
	@GetMapping({"/alumnos","/"})
	public String listarAlumnos(Model modelo) {
		modelo.addAttribute("lista_alumnos", alumnosService.listarAlumnos());
		return "alumnos";
	}
	
	@GetMapping("/alumnos/new")
	public String formularioAlumnos(Model modelo) {
		Alumnos alumnos = new Alumnos();
		modelo.addAttribute("alumnos",alumnos);
		return "crear_alumnos";
	}
	
	@PostMapping("/alumnos/new")
	public String guardarAlumno(@ModelAttribute("alumnos") Alumnos alumnos) {
		alumnosService.guardarAlumno(alumnos);
		
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumnos/edit/{id}")
	public String formularioEditarAlumno(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("alumnos", alumnosService.obtenerAlumnoPorId(id));
		
		return "editar_alumnos";
	}
	
	@PostMapping("/alumnos/edit/{id}")
	public String actualizarAlumno(@PathVariable Long id, @ModelAttribute ("alumnos") Alumnos alumnos) {
		Alumnos alumnoUpdate = alumnosService.obtenerAlumnoPorId(id);
		
		alumnoUpdate.setNombre(alumnos.getNombre());
		alumnoUpdate.setApellido(alumnos.getApellido());
		alumnoUpdate.setTelefono(alumnos.getTelefono());
		alumnoUpdate.setEmail(alumnos.getEmail());
		alumnoUpdate.setDni(alumnos.getDni());
		alumnoUpdate.setFecha_nac(alumnos.getFecha_nac());
		
		alumnosService.guardarAlumno(alumnoUpdate);
		return "redirect:/alumnos";
	}
	
	@GetMapping("/alumnos/delete/{id}")
	public String eliminarAlumno(@PathVariable Long id) {
		alumnosService.eliminarAlumno(id);
		return "redirect:/alumnos";
	}
	
	
	
	
	
	
}
