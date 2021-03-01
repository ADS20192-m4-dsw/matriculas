package br.com.vovolinux.matriculas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.vovolinux.matriculas.dao.DisciplinaDao;
import br.com.vovolinux.matriculas.entidade.Disciplina;
import java.util.List;

@RestController
public class DisciplinaRest {

	@Autowired
	private DisciplinaDao disciplinaDao;

	@GetMapping
	public List<Disciplina> get() {
		return disciplinaDao.findAll();
	}

	@PostMapping
	public void post(@RequestBody Disciplina disciplina) {
		disciplinaDao.save(disciplina);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		disciplinaDao.deleteById(id);
	}
}
