package main.java;
//ramaA - añadido por Marta
public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        int suma32 = suma(3, 2);
	        System.out.println("Suma 3 + 2 = " + suma32 + " ¿Está bien? " + (suma32 == 5));

	        int resta75 = resta(7, 5);
	        System.out.println("Resta 7 - 5 = " + resta75 + " ¿Está bien? " + (resta75 == 2));

	        int multiplica43 = multiplica(4, 3);
	        System.out.println("Multiplica 4 * 3 = " + multiplica43 + " ¿Está bien? " + (multiplica43 == 12));

	        int divide84 = divide(8, 4);
	        System.out.println("Divide 8 / 4 = " + divide84 + " ¿Está bien? " + (divide84 == 2));

	        int modulo74 = modulo(7, 4);
	        System.out.println("Módulo 7 % 4 = " + modulo74 + " ¿Está bien? " + (modulo74 == 3));
}


	    // Métodos (A, B)
	    private static int suma(int a, int b) {
	        return a + b;
	    }

	    private static int resta(int a, int b) {
	        return a - b;
	    }

	    private static int multiplica(int a, int b) {
	        return a * b;
	    }

	    private static int divide(int a, int b) {
	        if (b == 0) {
	            System.out.println("Error: división por cero");
	            return 0;
	        }
	        return a / b;
	    }

	    private static int modulo(int a, int b) {
	        if (b == 0) {
	            System.out.println("Error: módulo por cero");
	            return 0;
	        }
	        return a % b;
	    }
	}
