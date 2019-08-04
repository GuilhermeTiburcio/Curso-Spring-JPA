package com.tiburcio.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.cursomc.domain.Categoria;
import com.tiburcio.cursomc.repositories.CategoriaRepository;
import com.tiburcio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public List<Categoria> buscaTodos() {
		return repo.findAll();
	}

	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
