package DosSalaDeCine;

import java.util.Scanner;

public class ProgramaSaladeCine {

	public static void main(String[] args) {

		boolean indicador;
		int comprarFila;
		int comprarColumna;
		Scanner scanner = new Scanner(System.in);

		String menu = "------Seleccione una opción------\n " + "\n1. Ver Sala.\n" + "2. Ocupar Asiento.\n"
				+ "3. Desocupar asiento.\n" + "4. Salir.";

		System.out.println("\n---¡Bienvenido!---");
		System.out
				.println("\nLa sala se creara con las dimensiones deseadas, por favor ingrese los siguientes datos:\n");
		System.out.println("Número de filas");
		int filas = scanner.nextInt();
		System.out.println("Número de columnas");
		int columnas = scanner.nextInt();

		Sala sala = new Sala(filas, columnas);
		sala.LlenarSala();

		// control de opciones
		int opcion;
		do {
			System.out.println(menu);
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				sala.verSala();
				break;
			case 2:
				do {
					System.out.println("Ingresar  número de fila");
					comprarFila = scanner.nextInt();
					System.out.println("Ingresar número de Columna");
					comprarColumna = scanner.nextInt();
					indicador = sala.validarAsiento(comprarFila, comprarColumna);
				} while (!indicador);
				break;
			case 3:
				do {
					System.out.println("Ingresar número de fila");
					comprarFila = scanner.nextInt();
					System.out.println("Ingresar un número de Columna");
					comprarColumna = scanner.nextInt();
					indicador = sala.ValAsientoOcupado(comprarFila, comprarColumna);
				} while (!indicador);
				break;
			case 4:
				break;
			default:
				System.out.println("opción no valida");
				break;
			}
		} while (opcion != 4);

	}

}
