package com.anderson.exercicios;

import java.util.Scanner;

public class Aprovados {
	int sizeOfStudentsVetor;

	Scanner sc =  new Scanner(System.in);
	
	public Aprovados(){
		this.printAnyThing("Quantos Alunos serão digitados?");
		this.sizeOfStudentsVetor = sc.nextInt();
		Aluno[] studentsVetor = new Aluno[this.sizeOfStudentsVetor];
		
		this.populateStudentsVetor(studentsVetor);
		this.verifyStudentsAverageScore(studentsVetor);
	}
	
	private void verifyStudentsAverageScore(Aluno[] studentsVetorParameter){
		String[] vetorOfStudentsHasPassed = new String[studentsVetorParameter.length];
		int pointerForControlTheVetor = 0;
		
		for(Aluno alunoItem: studentsVetorParameter){
			if((alunoItem.getNota1() + alunoItem.getNota2()/2) >= 6){
				vetorOfStudentsHasPassed[pointerForControlTheVetor] = alunoItem.getName();
				pointerForControlTheVetor = pointerForControlTheVetor+1;
			}
		}
		
		this.returnPassedStudents(vetorOfStudentsHasPassed);
	}
	
	private void returnPassedStudents(String[] studentsNameVetor) {
		for(String nameOfStudent: studentsNameVetor){
			this.printAnyThing(nameOfStudent);
		}
	}
	
	private void populateStudentsVetor(Aluno[] studentsVetorParameter){
		int pointerControl = 0;
	
		for(Aluno alunoItem: studentsVetorParameter){
			studentsVetorParameter[pointerControl] = this.createStudent();
			pointerControl = pointerControl+1;
		}
	}
	
	private Aluno createStudent(){
		String alunoNome = "";
		int AlunoNota1 = 0;
		int AlunoNota2 = 0;
		
		this.printAnyThing("Digite o nome do aluno: ");
		alunoNome = sc.next();
		
		this.printAnyThing("Digite a nota 1 do aluno " + alunoNome);
		AlunoNota1 = sc.nextInt();
		
		this.printAnyThing("Digite a nota 2 do aluno " + alunoNome);
		AlunoNota2 = sc.nextInt();
		
		return new Aluno(alunoNome, AlunoNota1, AlunoNota2);
	}
	
	private void printAnyThing(Object messageParameter){
		System.out.println(messageParameter);
	}
	
}
