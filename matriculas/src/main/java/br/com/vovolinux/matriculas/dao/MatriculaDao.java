package br.com.vovolinux.matriculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vovolinux.matriculas.entidade.Matricula;

@Repository
public interface MatriculaDao extends JpaRepository<Matricula, Long> {

}
