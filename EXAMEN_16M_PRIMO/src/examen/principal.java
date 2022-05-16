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
				System.out.println("El numero no es primo");
				primo = false;
				break;
			} else {
				primo = true;
				
			}
		}
		
		if(primo) {
			System.out.println("El numero es primo");
		}

	}

}
