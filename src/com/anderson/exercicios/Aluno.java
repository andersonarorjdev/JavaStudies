package com.anderson.exercicios;

public class Aluno {
	String name;
	int nota1;
	int nota2;
	
	public Aluno(String name, int nota1, int nota2){
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	protected String getName(){
		return this.name;
	};
	
	protected int getNota1(){
		return this.nota1;
	}
	
	protected int getNota2(){
		return this.nota2;
	}
}
