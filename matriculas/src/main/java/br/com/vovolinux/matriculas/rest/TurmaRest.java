package br.com.vovolinux.matriculas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.vovolinux.matriculas.dao.TurmaDao;
import br.com.vovolinux.matriculas.entidade.Turma;
import java.util.List;

@RestController
public class TurmaRest {

	@Autowired
	private TurmaDao turmaDao;

	@GetMapping
	public List<Turma> get() {
		return turmaDao.findAll();
	}

	@PostMapping
	public void post(@RequestBody Turma turma) {
		turmaDao.save(turma);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		turmaDao.deleteById(id);
	}
}
