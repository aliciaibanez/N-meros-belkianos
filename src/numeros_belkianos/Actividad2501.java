package numeros_belkianos;

import java.util.ArrayList;

public class Actividad2501 {

	public boolean esNumeroBelkiano(int n) {
		
		String numeroStr = String.valueOf(n);
		ArrayList <Character> digitosStr = new ArrayList<>();
		ArrayList <Integer> digitosInt = new ArrayList<>();

		int digito = 0;
		
		
		for (int i= 0; i < numeroStr.length(); i++) {
			
			digitosStr.add(numeroStr.charAt(i));
		}
		
		for (int i = 0; i < digitosStr.size(); i++) {
			
			digitosInt.add(Character.getNumericValue(numeroStr.charAt(i)));
			
		}
		int sumaPow = 0;
		
		for (int i = 0; i < digitosInt.size(); i++) {
			sumaPow += Math.pow(digitosInt.get(i), digitosInt.size());
		}
		boolean resultado = false;
		resultado = (n == sumaPow) ? true : false;
		return resultado;

	}

}
