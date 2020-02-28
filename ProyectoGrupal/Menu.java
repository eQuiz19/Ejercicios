package ProyectoGrupal;

import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		Adds adds = new Adds ();
		boolean bCondicion = true;
		boolean bCondicion2 = true;
		Integer iColumnaHuevo = null;
		Integer iFilaHuevo = null;
		Tablero tablero = new Tablero();
		Integer opt;

		do {
			while (true) {
				try {
					System.out.println("Ingrese 1 para iniciar juego");
					System.out.print("Ingrese cualquier otro numero para salir \nIngresar: ");
					opt = data.nextInt();
					System.out.println("");
					break;
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un dato numérico");
					System.out.println("*******************************");
					System.out.println("");
					data.next();
					continue;
				}
			}

			if (opt == 1) {
				tablero.matrizTablero();
				do {
					while (true) {
						try {
							do {
								System.out.print("Ingrese fila (0-14)\nIngresar:");
								iFilaHuevo = data.nextInt();
								if (iFilaHuevo < 0 || iFilaHuevo > 14) {
									bCondicion = false;
								} else {
									bCondicion = true;
								}
							} while (!bCondicion);
							bCondicion = false;
							break;
						} catch (InputMismatchException e) {
							System.out.println("Debe ingresar un dato numérico");
							System.out.println("*******************************");
							System.out.println("");
							data.next();
							continue;
						}
					}

					do {
						while (true) {
							try {
								do {
									System.out.println();
									System.out.print("Ingrese Columna (0-14)\nIngresar:");
									iColumnaHuevo = data.nextInt();
									if (iColumnaHuevo < 0 || iColumnaHuevo > 14) {
										bCondicion = false;
									} else {
										bCondicion = true;
									}
								} while (!bCondicion);
								break;
							} catch (InputMismatchException e) {
								System.out.println("Debe ingresar un dato numérico");
								System.out.println("*******************************");
								System.out.println("");
								data.next();
								continue;
							}
						}
					} while (!bCondicion);

					tablero.calcularPuntaje(iFilaHuevo, iColumnaHuevo);

					while (true) {
						try {
							System.out.println("Desea continuar? (1) SI");
							System.out.println("Cualquier otro número para NO");
							int iOpcion = data.nextInt();
							if (iOpcion != 1) {
								bCondicion2 = false;
							}
							break;
						} catch (InputMismatchException e) {
							System.out.println("Debe ingresar un dato numérico");
							System.out.println("*******************************");
							System.out.println("");
							data.next();
							continue;
						}
					}
				} while (bCondicion2);

				System.out.println("Juego finalizado");
				System.out.println("");
				for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					System.out.print(tablero.Matriz[i][j] + " ");
				}
				System.out.println();
			}
	
			System.out.println("El puntaje total es: " + tablero.iPuntajeTotal);
			
			adds.addFinish();

			}

		} while (opt == 1);
			adds.addFinish();

	}
}