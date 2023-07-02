package com.anderson.exercicios;

import java.util.*;

public class numerosPares {
	
	private int numbersToSizeOfVetor;
	
	Scanner sc = new Scanner(System.in);
	
	public numerosPares(){
		this.makeAnQuestionOrTalkSomething("Quantos números voce vai digitar?");
		this.numbersToSizeOfVetor = sc.nextInt();
		int[] vetorOfNumbers = new int[this.numbersToSizeOfVetor];
		
		this.populateVetorWithNumber(vetorOfNumbers);
		this.findEvenNumbers(vetorOfNumbers);
	}
	
	private int[] populateVetorWithNumber(int[] parameterVetor){
		for(int i = 0; i < parameterVetor.length; i++){
			this.makeAnQuestionOrTalkSomething("Digite um número");
			parameterVetor[i] = sc.nextInt();
		}
		
		return parameterVetor;
	}
	
	private void findEvenNumbers(int[] parameterVetor){
		
		int evenNumbers = 0;
		
		for(int numberItem: parameterVetor){
			if(numberItem%2 == 0){
				System.out.println(numberItem);
				evenNumbers = evenNumbers+1;
			}
			
		}
		System.out.println("Quantidade de numeros pares: " + evenNumbers);
	}
	
	private void makeAnQuestionOrTalkSomething(String messageInParameter){
		System.out.println(messageInParameter);
	}
}
