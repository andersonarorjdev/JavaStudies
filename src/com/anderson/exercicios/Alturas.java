package com.anderson.exercicios;

import java.util.*;

public class Alturas {
	
	int numberOfPersons;
	
	Scanner sc = new Scanner(System.in);
	
	public Alturas(){
		System.out.println("Quantas pessoas serão digitadas? ");
		this.numberOfPersons = sc.nextInt();
		Pessoa[] pessoasVetor = new Pessoa[this.numberOfPersons];
		
		this.populatePessoasVetor(pessoasVetor);
		this.returnAverageHeight(pessoasVetor);
		this.returnPeopleUnderSixteenYears(pessoasVetor);
	}
	
	private void returnPeopleUnderSixteenYears(Pessoa[] pessoaVetorParameter){
		int NumberOfPersonsUnderSixteen = 0;
		
		
		for(Pessoa pessoaItem: pessoaVetorParameter){
			if(pessoaItem.getIdade() < 16){
				this.makeAnQuestion(pessoaItem.getName());
				NumberOfPersonsUnderSixteen = NumberOfPersonsUnderSixteen+1;
			}
		}
		
		this.makeAnQuestion("Pessoa com menos de 16 anos: " + (pessoaVetorParameter.length*100/NumberOfPersonsUnderSixteen));
		
	}
	
	private void returnAverageHeight(Pessoa[] pessoaVetorParameter) {
		double sumOfPersonsHeight = 0;
		
		for(Pessoa pessoaItem: pessoaVetorParameter){
			sumOfPersonsHeight = sumOfPersonsHeight + pessoaItem.getAltura();
		}	
		this.makeAnQuestion("Altura média é: " + (sumOfPersonsHeight / pessoaVetorParameter.length));
	}
	
	private void populatePessoasVetor(Pessoa[] pessoaVetorParameter){
		for(int i = 0; i < pessoaVetorParameter.length; i++){
			pessoaVetorParameter[i] = this.createPessoa();
		}
	}
	
 	private Pessoa createPessoa(){
 		String temporaryName = "";
 		int temporaryAge = 0;
 		double temporaryHeight = 0;
		
		this.makeAnQuestion("Digite o nome da pessoa: ");
		temporaryName = sc.next();
		
		this.makeAnQuestion("Digite a idade da pessoa: ");
		temporaryAge = sc.nextInt();
		
		this.makeAnQuestion("Digite a altura da pessoa: ");
		temporaryHeight = sc.nextDouble();
		
		return new Pessoa(temporaryName, temporaryAge, temporaryHeight);
	}
	
	private void makeAnQuestion(String question){
		System.out.println(question);
	}
}

