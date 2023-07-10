package practicaUno_Diptongo;

import java.util.ArrayList;

public class EvaluacionUno_Diptongo {

	public static void main(String[] args) {

		String[] palabras = { "palabras", "aire", "oso", "suave", "bonsai", "ruido", "diptongos", "determinar", "perro",
				"Asno", "viaje" };
		String[] condiciones = { "ai", "au", "ei", "au", "eu", "oi", "oi", "ou", "ia", "ie", "io", "ua", "ue", "uo",
				"ui", "iu" };

		ArrayList<String> Diptongos = new ArrayList();

		for (String palabra : palabras) {
			for (String condicion : condiciones) {
				if (palabra.contains(condicion)) {
					Diptongos.add(palabra);
				}
			}

		}
		System.out.println("Los Diptongos del arreglo son:\n" + Diptongos);

	}
}
