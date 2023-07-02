package com.anderson.exercicios;

import java.util.*;

public class abaixoDaMedia {
	
	Scanner sc = new Scanner(System.in);
	
	int sizeOfVetorOfNumbers;
	
	public abaixoDaMedia(){
		this.makeAnQuestion("Quantos valores terá o vetor?");
		this.sizeOfVetorOfNumbers = sc.nextInt();
		int[] vetorOfNumbers = new int[this.sizeOfVetorOfNumbers];
		
		this.populateVetorWithNumbers(vetorOfNumbers);
		this.calcTheAverage(vetorOfNumbers);
	}
	
	private void calcTheAverage(int[] vetorParameter){
		int vetorAverage, vetorSumValues = 0;
		
		for(int i = 0; i < vetorParameter.length; i++){
			vetorSumValues = vetorSumValues + vetorParameter[i];
		}
		
		vetorAverage = vetorSumValues / vetorParameter.length;
		System.out.println("A media dos vetores é: " + vetorAverage);
		
		for(int i = 0; i < vetorParameter.length; i++) {
			if(vetorParameter[i] < vetorAverage){
				System.out.print(vetorParameter[i] + "\n");
			}
		}
	}
	
	
	private void makeAnQuestion(String question){
		System.out.println(question);
	}
	
	private void populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.makeAnQuestion("Digite um número");
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
	}
}
