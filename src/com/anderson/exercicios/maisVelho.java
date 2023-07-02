package com.anderson.exercicios;

import java.util.Scanner;

public class maisVelho {
	
	int numbersToVetorSize;
	
	Scanner sc = new Scanner(System.in);
	
	public maisVelho(){
		System.out.println("Quantos pessoas voce vai digitar?");
		this.numbersToVetorSize = sc.nextInt();
		Pessoa[] vetorOfPersons = new Pessoa[this.numbersToVetorSize];
		this.populateVetorWithPersons(vetorOfPersons);
		this.discoverOlderPerson(vetorOfPersons);
		
	}
	
	private int DiscoverBiggestPosition(int[] integerVetorParameter){
		int biggestPositionInVetor = integerVetorParameter[0];
		
		for(int valueItem: integerVetorParameter){
			if(valueItem > biggestPositionInVetor){
				biggestPositionInVetor = valueItem;
			}
		}
		
		return biggestPositionInVetor;
	}
	
	private void discoverOlderPerson(Pessoa[] personsVetorParameter){
		int[] vetorOfPersonsAge = new int[personsVetorParameter.length];
		int pointerControl = 0;
		int biggestAgeInVetor = 0;
		
		for(Pessoa pessoaItem: personsVetorParameter){
			vetorOfPersonsAge[pointerControl] = pessoaItem.getIdade();
		}
		
		biggestAgeInVetor = this.DiscoverBiggestPosition(vetorOfPersonsAge);
		
		for(Pessoa pessoaItem: personsVetorParameter){
			if(pessoaItem.getIdade() == biggestAgeInVetor){
				this.printAnyThing("PESSOA MAIS VELHA É: " + pessoaItem.getName());
			}
		}
	}
	
	private void populateVetorWithPersons(Pessoa[] vetorOfPersonsParameter){
		for(int j = 0; j < vetorOfPersonsParameter.length; j++) {
			vetorOfPersonsParameter[j] = this.createPessoa();
		}
	}
	
	private Pessoa createPessoa(){
		String nomePessoa = "";
		int idadePessoa = 0;
		
		this.printAnyThing("Digite o nome da pessoa:");
		nomePessoa = sc.next();
		
		this.printAnyThing("Digite a idade da pessoa:");
		idadePessoa = sc.nextInt();
		
		return new Pessoa(nomePessoa, idadePessoa);
	}
	
	private void printTypeNumber(){
		System.out.println("Digite um numero: ");
	}
	
	private void printAnyThing(Object messageParameter){
		System.out.println(messageParameter);
	}

}
