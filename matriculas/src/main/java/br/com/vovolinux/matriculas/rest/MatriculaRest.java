package br.com.vovolinux.matriculas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vovolinux.matriculas.dao.MatriculaDao;
import br.com.vovolinux.matriculas.entidade.Matricula;

@RestController
@RequestMapping("/matricula")
public class MatriculaRest {
	
	@Autowired
	private MatriculaDao matriculaDao;

	@GetMapping
	public List<Matricula> get(){
		return matriculaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Matricula matricula) {
		matriculaDao.save(matricula);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		matriculaDao.deleteById(id);
	}
	
}
