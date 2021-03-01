package br.com.vovolinux.matriculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vovolinux.matriculas.entidade.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
