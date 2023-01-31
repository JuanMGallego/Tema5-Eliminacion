package tema5eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int list[] = new int[20];
		
		int value;
		int count = 0;
		
		//Auto-fill list
		for (int i = 0; i < list.length; i++) {
			
			list[i] = (int) (Math.random() * 10 + 1);
			
		}
		
		//Visual check
		System.out.print("Lista aleatoria: ");
		System.out.println(Arrays.toString(list));
		
		System.out.println();
		System.out.print("Introduzca un valor para sacar los mayores de la lista: ");
		
		value = sc.nextInt();
		
		System.out.println();
		
		//
		while (count < list.length) {
			
			if (list[count] > value) {
				
				System.arraycopy(list, count + 1, list, count, list.length - (1 + count));
				
				list = Arrays.copyOf(list, list.length - 1);
				
			} else {
				
				count++;
				
			}
			
		}
		
		System.out.print("Lista con los números menores al dado: ");
		System.out.println(Arrays.toString(list));
		
		sc.close();

	}

}
