package org.generation.redesocial.conecteme.repository;

import java.util.List;

import org.generation.redesocial.conecteme.model.TemaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<TemaModel, Long> {
	
	public List<TemaModel> findAllByTemaContainingIgnoreCase(String tema);
	
	public List<TemaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
