package com.anderson.exercicios;

import java.util.*;

public class somaVetors {
	
	Scanner sc = new Scanner(System.in);
	
	int sizeOfVetors;
	
	public somaVetors(){
		this.askSomething("Quantos valores terá cada vetor?");
		this.sizeOfVetors = sc.nextInt();
		
		int[] vetorA = new int[this.sizeOfVetors];
		int[] vetorB = new int[this.sizeOfVetors];
		
		this.populateVetorWithNumbers(vetorA);
		this.populateVetorWithNumbers(vetorB);
		this.sumTheNumbersOFVetors(vetorA, vetorB);
	}
	
	private void sumTheNumbersOFVetors(int[] vetor1, int[] vetor2) {
		
		int[] newVetorWithResults = new int[vetor1.length];
		
		for(int i = 0; i < vetor1.length; i++){
			for(int j = 0; j < vetor2.length; j++){
				newVetorWithResults[i] = vetor1[i] + vetor2[i]; 
			}
		}
		
		this.askSomething("Vetor resultante: ");
		for(int itemInVetorOfResults: newVetorWithResults){
			System.out.println(itemInVetorOfResults);
		}
	}
	
	private void populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.askSomething("Digite um numer");
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
	}
	
	
	private void askSomething(String message) {
		System.out.println(message);
	}
}
