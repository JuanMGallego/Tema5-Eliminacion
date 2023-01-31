package tema5eliminacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int list[] = new int[10];
		
		int value;
		int count = 0;
		int listLength = 0;
		
		String select = "x";
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < list.length ; i++) {
			
			list[i] = (int) (Math.random()*100 + 1);
			
		}
		
		System.out.println("-- La lista ha sido creada correctamente --");
		
		while (!select.equals("c")) {
			
			listLength = list.length;
			
			System.out.println();
			System.out.println("Menú (Introduzca la letra por teclado)");
			System.out.println("a. Mostrar valores");
			System.out.println("b. Eliminar valores");
			System.out.println("c. Salir");
			System.out.println();
			
			select = sc.next();
			
			switch (select) {
				
				case "a":
			
					System.out.println(Arrays.toString(list));
					System.out.println();
					
					break;
				
				case "b":
					
					System.out.println();
					System.out.print("Introduzca un valor para sacar de la lista: ");
					
					value = sc.nextInt();
					
					System.out.println();
					
					while (count < list.length) {
						
						if (list[count] == value) {
							
							System.arraycopy(list, count + 1, list, count, list.length - (1 + count));
							
							list = Arrays.copyOf(list, list.length - 1);
							
						} else {
							
							count++;
							
						}
						
					}
					
					if (listLength == list.length) {
						
						System.out.println("ERROR: El valor no se encuentra dentro de la lista");
						
					}
					
					count = 0;
					
					break;
				
				case "c":
					
					System.out.println("-- Programa finalizado --");
					
					break;
				
				default:
					
					System.err.println("ERROR: No ha introducido una opción válida");
			}
			
		}
		
		sc.close();

	}

}
