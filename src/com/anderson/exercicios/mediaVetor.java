package com.anderson.exercicios;

import java.util.Scanner;

public class mediaVetor {
	int numbersToVetorSize = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public mediaVetor(){
		System.out.println("Quantos números voce vai digitar?");
		this.numbersToVetorSize = sc.nextInt();
		int[] vetorOfNumbers = new int[this.numbersToVetorSize];
		this.populateVetorWithNumbers(vetorOfNumbers);
		this.returnNumbersAverage(vetorOfNumbers);
	}
	
	private void printTypeNumber(){
		System.out.println("Digite um numero: ");
	}
	
	private int[] populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.printTypeNumber();
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
		
		return vetorOfNumbersParameter;
	}
	
	private void returnNumbersAverage(int[] vetorOfNumbersParameter){
		int sumOfElementsFromVetor = 0;
		String numbersFromVetor = "";
		
		System.out.println("Valores do vetor: ");
		
		for(int i = 0; i < vetorOfNumbersParameter.length; i++) {
			System.out.println(vetorOfNumbersParameter[i]);
			sumOfElementsFromVetor = sumOfElementsFromVetor + vetorOfNumbersParameter[i];
		}
		
		System.out.println("Soma total dos valores: " + sumOfElementsFromVetor);
		System.out.println("Media dos valores: " + (sumOfElementsFromVetor/vetorOfNumbersParameter.length));
	}
}