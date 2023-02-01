package tema5eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int favNum[] = new int[1];
		
		int num1, num2;
		int count = 0;
		
		System.out.println("Introduzca sus números favoritos (negativo para terminar): ");
		
		while (favNum[count] >= 0) {
			
			favNum[count] = sc.nextInt();
			
			if (favNum[count] < 0) {
				
				favNum = Arrays.copyOf(favNum, favNum.length - 1);
				
				break;
				
			} else {
				
				count++;
				
				favNum = Arrays.copyOf(favNum, favNum.length + 1);
				
			}
			
		}
		
		while (favNum.length > 1) {
			
			num1 = favNum[(int)(Math.random()*favNum.length)];
			num2 = favNum[(int)(Math.random()*favNum.length)];
			
			favNum[num1] = (num1 + num2) / 2;
			
			System.arraycopy();
			
		}
		
		System.out.println("Su número de la suerte es: " + favNum[0]);
		
		sc.close();

	}

}
