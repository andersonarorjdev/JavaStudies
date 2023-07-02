package com.anderson.exercicios;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private String gender;
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(double Altura, String gender){
		this.altura = Altura;
		this.gender = gender;
	}
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getName(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public String getGender(){
		return this.gender;
	}
}
