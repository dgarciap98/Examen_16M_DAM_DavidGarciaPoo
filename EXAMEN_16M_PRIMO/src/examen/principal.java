package examen;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		boolean primo = false;
		
		System.out.println("Buenos días Ceinmark, soy David Garcia");
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		
		numero = Integer.parseInt(entrada.nextLine());
				
		for(int i = 1; i<numero; i++) {
			if(numero%i == 0 && i!=1 && i!=numero) {
				primo = false;
				System.out.println((numero/i) + " es divisor de " + numero);
			} else {
				primo = true;
				
			}
		}
		
		if(primo) {
			System.out.println("El numero es primo");
		}

	}

}
