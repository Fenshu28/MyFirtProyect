package dev;

import java.util.Arrays;
import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		int MAXn = 5, i = 0;
		float Suma = 0;
		float[] Calif = new float[MAXn];
		Scanner Leer = new Scanner(System.in);
		
		System.out.println("-- Calculadora de media o promedio --");
		
		for(i = 0; i < MAXn; i++) {
			System.out.print("Escribe la calificación " + (i + 1) + ": ");
			Calif[i] = Leer.nextFloat();
			Suma += Calif[i];
		}
		
		
		System.out.println("El promedio de las calificaciones " + Arrays.toString(Calif) + " es: " + Suma/(MAXn));
	}
}
