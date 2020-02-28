
package ProyectoGrupal;

import java.util.Scanner;

public class Huevo {
	public static Scanner data = new Scanner(System.in);

	Integer iPuntaje;
	Integer iFila;
	Integer iColumna;

	public Huevo() {
		super();
	}

	public Huevo(Integer iFila, Integer iColumna) {
		super();
		calcularPuntaje(iFila, iColumna);
		this.iFila = iFila;
		this.iColumna = iColumna;
	}

	public Huevo(Integer iPuntaje, Integer iFila, Integer iColumna) {
		super();
		this.iPuntaje = iPuntaje;
		this.iFila = iFila;
		this.iColumna = iColumna;
	}

	public Integer getiPuntaje() {
		return iPuntaje;
	}

	public void setiPuntaje(Integer iPuntaje) {
		this.iPuntaje = iPuntaje;
	}

	public Integer getiFila() {
		return iFila;
	}

	public void setiFila(Integer iFila) {
		this.iFila = iFila;
	}

	public Integer getiColumna() {
		return iColumna;
	}

	public void setiColumna(Integer iColumna) {
		this.iColumna = iColumna;
	}

	private void calcularPuntaje(Integer iFila, Integer iColumna) {
		for (int i = 0; i < iFila; i++) {
			for (int j = 0; j < iColumna; j++) {
				// System.out.println("Ingrese valor a matriz["+i+"]["+j+"] =" );
				// matriz [i][j] = scan.nextInt();
				// matriz [i][j] = (int) Math.floor(Math.random()*6+1);
			}
		}
	}

}