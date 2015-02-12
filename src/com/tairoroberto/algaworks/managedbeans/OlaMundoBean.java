package com.tairoroberto.algaworks.managedbeans;

import javax.faces.bean.ManagedBean;

//@ManagedBean
public class OlaMundoBean {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/** Method to make string uppercase*/
	public void enviar() {
		setNome(getNome().toUpperCase());
	}
	
}
