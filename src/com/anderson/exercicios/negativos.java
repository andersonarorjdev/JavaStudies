package com.anderson.exercicios;

import java.util.*;

public class negativos {
	int numberOfNumbersInVetor = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public negativos() {
		System.out.println("Quantos números voce vai digitar? ");
		this.numberOfNumbersInVetor = sc.nextInt();
		int[] vetorOfNumbers = new int[this.numberOfNumbersInVetor];
		this.populateVetorWithNumbers(vetorOfNumbers);
		this.returnNegativeNumbersInVetor(vetorOfNumbers);
		System.out.println("Fim do programa");
	}
	
	private int[] populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.printTypeNumber();
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
		
		return vetorOfNumbersParameter;
	}
	
	private void returnNegativeNumbersInVetor(int[] vetorOfNumbersParameter){
		for(int i = 0; i < vetorOfNumbersParameter.length; i++){
			if(vetorOfNumbersParameter[i] < 0){
				System.out.println(vetorOfNumbersParameter[i]);
			}
		}
	}
	
	private void printTypeNumber(){
		System.out.println("Digite um numero: ");
	}
}
