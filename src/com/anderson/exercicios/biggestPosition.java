package com.anderson.exercicios;

import java.util.*;

public class biggestPosition {
	int numberOfTheVetorSize;
	Scanner sc = new Scanner(System.in);
	
	public biggestPosition(){
		System.out.println("Quantos numeros voce vai digitar?");
		this.numberOfTheVetorSize = sc.nextInt();
		int[] vetorOfNumbers = new int[this.numberOfTheVetorSize];
		
		this.populateVetorWithNumbers(vetorOfNumbers);
		this.returnTheBiggestPosition(vetorOfNumbers);
	}
	
	public void returnTheBiggestPosition(int[] vetorOfNumbersInParameter){
		int biggestPositionInVetor = vetorOfNumbersInParameter[0];
		int biggestPosition = 0;
		
		for(int i = 0; i < vetorOfNumbersInParameter.length; i++) {
			if(vetorOfNumbersInParameter[i] > biggestPositionInVetor){
				biggestPositionInVetor = vetorOfNumbersInParameter[i];
				biggestPosition = biggestPosition+1;
			}
		}
		
		System.out.print("Valor da maior posicao: " + biggestPositionInVetor);
		System.out.print("Ordem da maior posicao: " + biggestPosition);
	}
	
	private void populateVetorWithNumbers(int[] vetorOfNumbersParameter){
		for(int j = 0; j < vetorOfNumbersParameter.length; j++) {
			this.printTypeNumber();
			vetorOfNumbersParameter[j] = sc.nextInt();
		}
	}
	
	private void printTypeNumber(){
		System.out.println("Digite um numero: ");
	}
}
