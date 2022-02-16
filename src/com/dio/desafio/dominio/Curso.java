package com.dio.desafio.dominio;

public class Curso {
	
	//atributos
	private String titulo;
	private String descricao;
	private int cargaHoraria;	
	
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
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Titulo = " + titulo + "\nDescricao = " + descricao + "\nCarga Horaria = " + cargaHoraria;
	}	

}
