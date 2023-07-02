package com.anderson.vetores;
import java.util.*;

public class Program {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		//Podemos substituir o posicionamento do n por um vect.length;
		
		for(int i = 0; i<n; i++){
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		
		for(int i = 0; i < n; i++){
			sum = sum + vect[i].getPrice();
		}
		
		double avg =  sum /n;
		
		System.out.print(avg);
		
		sc.close();
	}
}
