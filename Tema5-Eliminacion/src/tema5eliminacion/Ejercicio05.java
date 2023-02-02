package tema5eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int favNum[] = new int[1];
		
		int num1, num2;
		int pos1 = 0;
		int	pos2 = 0;
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
			
			while (pos1 == pos2) {
				
				pos1 = (int)(Math.random()*favNum.length);
				pos2 = (int)(Math.random()*favNum.length);
				
			}
			
			num1 = favNum[pos1];
			num2 = favNum[pos2];
			
			favNum[pos1] = (num1 + num2) / 2;
			
			System.arraycopy(favNum, pos2 + 1, favNum, pos2, favNum.length - (1 + pos2));
			
			favNum = Arrays.copyOf(favNum, favNum.length - 1);
			
			pos1 = 0;
			pos2 = 0;
			
		}
		
		System.out.println("Su número de la suerte es: " + favNum[0]);
		
		sc.close();

	}

}
