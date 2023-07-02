package com.anderson.exercicios;

import java.util.Scanner;

public class dadosPessoas {
	int sizeOfVetorPersons = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public dadosPessoas(){
		this.printAnyThing("Quantas pessoas serão digitadas?");
		this.sizeOfVetorPersons = sc.nextInt();
		
		Pessoa[] personsVetor = new Pessoa[this.sizeOfVetorPersons];
		
		this.populatePessoasVetor(personsVetor);
		this.verifyDataInPersonsVetor(personsVetor);
		
	}
	
	private void verifyDataInPersonsVetor(Pessoa[] pesssoasVetorParameter){
		double biggestHeight = 0;
		double lowestHeight = pesssoasVetorParameter[0].getAltura();
		double averageHeight = 0;
		int mansNumber = 0;
		int womansNumber = 0;
		
		for(Pessoa personItem: pesssoasVetorParameter){
			
			//First verify biggest Person
			if(personItem.getGender().equals("F") | personItem.getGender().equals("f")){
				averageHeight = averageHeight + personItem.getAltura();
				
				if(personItem.getAltura() < lowestHeight){
					lowestHeight = personItem.getAltura();
				}
				
				if(personItem.getAltura() > biggestHeight) {
					biggestHeight = personItem.getAltura();
				}
				
				womansNumber = womansNumber+1;
			}
			else{
				mansNumber = mansNumber + 1;
			
			}
		}
		
		this.printAnyThing("Menor altura entre as mulheres é: " + lowestHeight);
		this.printAnyThing("Maior altura entre as mulheres é: " + biggestHeight);
		this.printAnyThing("Media das alturas da mulheres é: " + averageHeight / womansNumber);
		this.printAnyThing("Número de homens: " + mansNumber);
	}
	
	private void populatePessoasVetor(Pessoa[] pessoaVetorParameter){
		for(int i = 0; i < pessoaVetorParameter.length; i++){
			pessoaVetorParameter[i] = this.createPessoa();
		}
	}
	
 	private Pessoa createPessoa(){
 		String temporaryGender = "";
 		double temporaryHeight = 0;
		
		this.makeAnQuestion("Digite genero da pessoa");
		temporaryGender = sc.next();
		
		this.makeAnQuestion("Digite a altura da pessoa");
		temporaryHeight = sc.nextDouble();
		
		return new Pessoa(temporaryHeight, temporaryGender);
	}
 	
	private void makeAnQuestion(String question){
		System.out.println(question);
	}
	
	private void printAnyThing(Object message){
		System.out.println(message);
	}
}
