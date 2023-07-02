package com.anderson.exercicios;

import java.util.Scanner;

public class mediaPares {

	
	int numbersToVetorSize = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public mediaPares(){
		System.out.println("Quantos números voce vai digitar?");
		this.numbersToVetorSize = sc.nextInt();
		int[] vetorOfNumbers = new int[this.numbersToVetorSize];
		this.populateVetorWithNumbers(vetorOfNumbers);
		this.calculateMediaPares(vetorOfNumbers);
	}
	
	private void calculateMediaPares(int[] vetorOfNumbersParameter){
		int quantityOfEvenNumbers = 0;
		int sumEvenNumbers = 0;
		
		for(int itemNumber: vetorOfNumbersParameter){
			if(itemNumber%2 == 0){
				sumEvenNumbers = sumEvenNumbers + itemNumber;
				quantityOfEvenNumbers = quantityOfEvenNumbers+1;
			}
		}
		
		this.printAnyThing("A media dos pares é " + sumEvenNumbers/quantityOfEvenNumbers);
	}
	
	private int[] populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.printTypeNumber();
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
		
		return vetorOfNumbersParameter;
	}
	
	private void printAnyThing(Object messageParameter){
		System.out.println(messageParameter);
	}
	
	private void printTypeNumber(){
		System.out.println("Digite um numero: ");
	}
}
