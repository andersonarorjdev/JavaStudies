package com.andersonarorj.javaSimpleCodes;

import java.util.Scanner;

public class MiniMeu {
	String name, altura;

	Scanner scan = new Scanner(System.in);
	
	public void lerDados(){
		System.out.println("Olá, diga seu nomezinhu ati:");
		this.name = scan.nextLine();
		System.out.println("Mo deusooo, ti nominhu tofinhu mo deuso");
		System.out.println("Agola diga seu tamanhinho:");
		this.altura = scan.nextLine();
		System.out.println("Seu nominho é :" + this.name + " e ice tem " + this.altura + " que tamainho tofinhuu❤");
	}

}
