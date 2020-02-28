package ProyectoGrupal;

import java.util.*;

public class Tablero {

	Integer iTamCarro = 18;

	Carro arregloCarro[] = new Carro[iTamCarro];
	ArrayList<Carro> arrayCarros = new ArrayList<Carro>();

	Integer iPuntajeTotal = 0;

	int iFila = 15, iColumna = 15;
	String Matriz[][] = new String[iFila][iColumna];

	public void matrizTablero() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				Matriz[i][j] = "0";
			}
		}

		llenarMatrizMicros();
		llenarMatrizGuanaco();
		llenarMatrizPatrulla();
	}

	public void llenarMatrizMicros() {
		boolean bCondicion1 = true;
		int iContadorMicro = 0;
//		int iFilaRandomMicro = 0;
//		int iColumnaRandomMicro = 0;
		do {
			int iFilaRandomMicro = (int) (Math.random() * 12) + 0;
			int iColumnaRandomMicro = (int) (Math.random() * 14) + 0;
			if (iFilaRandomMicro >= 0 && iFilaRandomMicro <= 12) {
				if (iColumnaRandomMicro >= 0 && iColumnaRandomMicro <= 14) {
					if (iFilaRandomMicro >= 0 && iFilaRandomMicro <= 12) {
						if (iColumnaRandomMicro >= 0 && iColumnaRandomMicro <= 14) {
							String ocupada3 = Matriz[iFilaRandomMicro][iColumnaRandomMicro];
							String ocupada4 = Matriz[iFilaRandomMicro + 1][iColumnaRandomMicro];
							String ocupada5 = Matriz[iFilaRandomMicro + 3][iColumnaRandomMicro];
							if (ocupada3.equals("0") && ocupada4.equals("0") && ocupada5.equals("0")) {
								Matriz[iFilaRandomMicro][iColumnaRandomMicro] = "M";
								Matriz[iFilaRandomMicro + 1][iColumnaRandomMicro] = "M";
								Matriz[iFilaRandomMicro + 2][iColumnaRandomMicro] = "M";
								iContadorMicro = iContadorMicro + 1;
							} else {
								System.out.println();
							}
						}
					}
					if (iContadorMicro == 3) {
						bCondicion1 = false;
					}
				}
			}
		} while (bCondicion1);
	}

	public void llenarMatrizGuanaco() {
		boolean bCondicion2 = true;
		int iContadorGuanaco = 0;
		do {
			int iFilaRandomGuanaco = (int) (Math.random() * 14) + 0;
			int iColumnaRandomGuanaco = (int) (Math.random() * 13) + 0;

			if (iFilaRandomGuanaco >= 0 && iFilaRandomGuanaco <= 14) {
				if (iColumnaRandomGuanaco >= 0 && iColumnaRandomGuanaco <= 13) {
					String ocupada = Matriz[iFilaRandomGuanaco][iColumnaRandomGuanaco];
					String ocupada2 = Matriz[iFilaRandomGuanaco + 1][iColumnaRandomGuanaco];

					if (ocupada.equals("0") && ocupada2.equals("0")) {
						Matriz[iFilaRandomGuanaco][iColumnaRandomGuanaco] = "G";
						Matriz[iFilaRandomGuanaco][iColumnaRandomGuanaco + 1] = "G";
						iContadorGuanaco = iContadorGuanaco + 1;
					}
				}
			}
			if (iContadorGuanaco == 5) {
				bCondicion2 = false;
			}

		} while (bCondicion2);
	}

	public void llenarMatrizPatrulla() {
		boolean bCondicion3 = true;
		int iContadorPatrulla = 0;
		do {

			int iFilaRandomPatrulla = (int) (Math.random() * 14) + 0;
			int iColumnaRandomPatrulla = (int) (Math.random() * 14) + 0;

			if (iFilaRandomPatrulla >= 0 && iFilaRandomPatrulla <= 14) {
				if (iColumnaRandomPatrulla >= 0 && iColumnaRandomPatrulla <= 14) {

					String ocupadaPatrulla = Matriz[iFilaRandomPatrulla][iColumnaRandomPatrulla];

					if (ocupadaPatrulla.equals("0")) {
						Matriz[iFilaRandomPatrulla][iColumnaRandomPatrulla] = "P";
						iContadorPatrulla += 1;
					}
				}
			}
			if (iContadorPatrulla == 10) {
				bCondicion3 = false;
			}

		} while (bCondicion3);
	}

	public int obtenerImpactoMicros(int iFilaHuevo, int iColumnaHuevo) {

		int iRetorno = 0, iSumaAcierto = 0;
		switch (iFilaHuevo) {
		case 0:
			for (int i = 1; i <= 2; i++) {
				String sDato0 = Matriz[iFilaHuevo + i][iColumnaHuevo];
				if (!sDato0.equals("M")) {
					iSumaAcierto += 1;
				}

			}
			if (iSumaAcierto == 2) {
				return 10;
			}

			break;
		case 1:
			for (int i = -1; i <= 1; i++) {
				String sDato0 = Matriz[iFilaHuevo + i][iColumnaHuevo];
				if (!sDato0.equals("M")) {
					iSumaAcierto += 1;
				}
			}
			if (iSumaAcierto == 2) {
				return 10;
			}
			break;

		case 13:
			for (int i = -1; i <= 1; i++) {
				String sDato0 = Matriz[iFilaHuevo + i][iColumnaHuevo];
				if (!sDato0.equals("M")) {
					iSumaAcierto += 1;
				}
			}
			if (iSumaAcierto == 2) {
				return 10;
			}

			break;
		case 14:
			for (int i = -2; i <= 0; i++) {
				String sDato0 = Matriz[iFilaHuevo + i][iColumnaHuevo];
				if (!sDato0.equals("M")) {
					iSumaAcierto += 1;
				}
			}
			if (iSumaAcierto == 2) {
				return 10;
			}
			break;
		default:
			for (int i = -2; i <= 2; i++) {
				String sDato0 = Matriz[iFilaHuevo + i][iColumnaHuevo];
				if (sDato0.equals("M")) {
					iSumaAcierto += 1;
				}
			}
			if (iSumaAcierto == 1) {
				return 10;
			}
			break;
		}

		return iRetorno;
	}

	private Integer obtenerImpactoGuanaco(int iFilaHuevo, int iColumnaHuevo) {
		int iSumaAcierto = 0;
		switch (iColumnaHuevo) {
		case 0:
			for (int i = 0; i <= 1; i++) {
				String dato = Matriz[iFilaHuevo][iColumnaHuevo];
				if (dato.equals("G")) {
					iSumaAcierto = iSumaAcierto + 1;
				}
			}
			if (iSumaAcierto == 1) {
				return 7;
			}
			break;
		default:
			for (int i = -1; i <= 1; i++) {
				String dato = Matriz[iFilaHuevo][iColumnaHuevo + i];
				if (dato.equals("C")) {
					iSumaAcierto = iSumaAcierto + 1;
				}
			}
			if (iSumaAcierto == 1) {
				return 7;
			}

			break;
		}
		return 0;
	}

	public void calcularPuntaje(int iFilaHuevo, int iColumnaHuevo) {

		String dato = Matriz[iFilaHuevo][iColumnaHuevo];

		if (dato.equals("H")) {
			System.out.println("Esta posicion ya fue atacada con un huevo");
		} else if (!dato.equals("0") && !dato.equals("H")) {
			switch (dato) {
			case "M":
				iPuntajeTotal += 3;
				iPuntajeTotal = iPuntajeTotal + obtenerImpactoMicros(iFilaHuevo, iColumnaHuevo);
				break;
			case "G":
				iPuntajeTotal += 2;
				iPuntajeTotal = iPuntajeTotal + obtenerImpactoGuanaco(iFilaHuevo, iColumnaHuevo);
				break;
			case "P":
				iPuntajeTotal += 1;
				break;
			default:
				break;
			}
		}
		Matriz[iFilaHuevo][iColumnaHuevo] = "H";

//		for (int i = 0; i < 15; i++) {
//			for (int j = 0; j < 15; j++) {
//				System.out.print(Matriz[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println("El puntaje total es: " + iPuntajeTotal);
	}

}