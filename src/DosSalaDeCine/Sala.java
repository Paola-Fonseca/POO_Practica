package DosSalaDeCine;

public class Sala {

	private int Filas;
	private int columnas;
	private String[][] sala;

	public int getFilas() {
		return Filas;
	}

	public void setFilas(int filas) {
		Filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	// Constructor
	public Sala(int filas, int columnas) {
		this.Filas = filas;
		this.columnas = columnas;
		this.sala = new String[filas + 1][columnas + 1]; // para evitar la posicion 0-0
	}

	// llenar la sala

	public void LlenarSala() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[0].length; j++) {
				if (i == 0 && j == 0)
					sala[i][j] = " "; // esto es el espacio en blanco
				else if (i == 0)
					sala[i][j] = String.valueOf(j); 
				else if (j == 0)
					sala[i][j] = String.valueOf(i);
				else
					sala[i][j] = "D";
			}

		}
	}

	public void verSala() {
		System.out.println("\n== Sala de Cine ==\n");
		for (String[] asientos : sala) {
			for (int j = 0; j < sala[0].length; j++) {
				System.out.print(asientos[j] + " ");
			}
			System.out.println("\n");
		}
	}

	// Ocupar Asiento

	public boolean validarAsiento(int comprarFila, int comprarColumna) {
		boolean verificar = comprarFila > Filas || comprarColumna > columnas || comprarFila == 0 || comprarColumna == 0;
		if (verificar) {
			System.out.println("\ninformación Incorrecta\n");
			return false;
		} else if (sala[comprarFila][comprarColumna].contains("X")) {
			System.out.println("\nAsiento no disponible\n");
			return false;
		} else {
			sala[comprarFila][comprarColumna] = "X";
			return true;
		}

	}

	// Desocupar Asiento

	public boolean ValAsientoOcupado(int comprarFila, int comprarColumna) {
		boolean verificar = comprarFila > Filas || comprarColumna > columnas || comprarFila == 0 || comprarColumna == 0;
		if (verificar) {
			System.out.println("\ninformación Incorrecta\n");
			return false;
		} else {
			sala[comprarFila][comprarColumna] = "D";
			System.out.println("\nEl Asiento ahora esta disponible\n");
			return true;
		}
	}
}
