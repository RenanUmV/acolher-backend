package org.generation.redesocial.conecteme.repository;

import java.util.List;

import org.generation.redesocial.conecteme.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
}
