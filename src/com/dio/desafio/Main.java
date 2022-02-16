package com.dio.desafio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
	 public static void main(String[] args) {
		 
		 Curso curso1 = new Curso();
		 curso1.setTitulo("Curso Poo");
		 curso1.setDescricao("Curso de programação orientada a objetos");
		 curso1.setCargaHoraria(5);
		 
		 Curso curso2 = new Curso();
		 curso2.setTitulo("Curso JS");
		 curso2.setDescricao("Curso Java Script");
		 curso2.setCargaHoraria(6);
		 
		 Mentoria mentoria = new Mentoria();
		 mentoria.setTitulo("Mentoria dio");
		 mentoria.setDescricao("Mentoria de Cami");
		 mentoria.setData(LocalDate.now());
		 
		 System.out.println(curso1);
		 System.out.println("----------------------");
		 System.out.println(curso2);
		 System.out.println("----------------------");
		 System.out.println(mentoria);
	}

}
