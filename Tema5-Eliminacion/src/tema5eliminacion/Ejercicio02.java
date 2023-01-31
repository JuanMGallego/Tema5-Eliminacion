package tema5eliminacion;

import java.util.Arrays;

public class Ejercicio02 {
	
	static boolean esPrimo(int n) {

		boolean esPrimo = true;
		
		if (n == 0 || n == 1) {
			
			esPrimo = false;
			
		} else {
			
			for (int i = 2; i < n; i++) {
				
				if (n % i == 0) {
					
					esPrimo = false;
					break;

				}

			}
			
		}

		return esPrimo;

	}

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
			
			if (!esPrimo(list[count])) {
				
				System.arraycopy(list, count + 1, list, count, list.length - (1 + count));
				
				list = Arrays.copyOf(list, list.length - 1);
				
			} else {
				
				count++;
				
			}
			
		}
		
		System.out.print("Misma lista mostrando solo los primos: ");
		System.out.println(Arrays.toString(list));
		
	}

}
