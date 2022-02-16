package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	
	//atributos
	private String titulo;
	private String descricao;
	private LocalDate data;
	
	//m�todos getters and setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Titulo = " + titulo + "\nDescricao = " + descricao + "\nData = " + data;
	}
	
}
