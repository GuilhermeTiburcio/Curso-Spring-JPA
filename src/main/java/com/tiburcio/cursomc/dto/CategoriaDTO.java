package com.tiburcio.cursomc.dto;

import java.io.Serializable;

import com.tiburcio.cursomc.domain.Categoria;

import lombok.Data;

@Data
public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}
	
	public CategoriaDTO() {}
	
	
	
}
