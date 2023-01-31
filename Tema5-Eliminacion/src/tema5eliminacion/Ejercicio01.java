package tema5eliminacion;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int list[] = new int[20];
		
		int count = 0;
		
		//Auto-fill list
		for (int i = 0; i < list.length; i++) {
			
			list[i] = (int) (Math.random() * 100 + 1);
			
		}
		
		//Visual check
		System.out.print("Lista aleatoria: ");
		System.out.println(Arrays.toString(list));
		
		//Search for odd numbers
		while (count < list.length) {
			
			if (list[count] % 2 != 0) {
				
				System.arraycopy(list, count + 1, list, count, list.length - (1 + count));
				
				list = Arrays.copyOf(list, list.length - 1);
				
			} else {
				
				count++;
				
			}
			
		}
		
		System.out.print("La misma lista mostrando solo los pares: ");
		System.out.println(Arrays.toString(list));
		
	}

}
