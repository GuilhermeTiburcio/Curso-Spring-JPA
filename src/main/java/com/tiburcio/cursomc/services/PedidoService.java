package com.tiburcio.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.cursomc.domain.Pedido;
import com.tiburcio.cursomc.repositories.PedidoRepository;
import com.tiburcio.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public List<Pedido> buscaTodos() {
		return repo.findAll();
	}

	public Pedido buscar(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> Pedido = repo.findById(id);
		return Pedido.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
