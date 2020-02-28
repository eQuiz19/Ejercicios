package ProyectoGrupal;

import java.util.Date;
import java.util.Scanner;

public class Patrulla extends Carro {
	public static Scanner data = new Scanner(System.in);

	String sNombre;
	Integer iArmadura; // entre 1 y 5

	public Patrulla() {
		super();
		ingreseNombre();
		ingreseNivelArmadura();
	}

	public Patrulla(String sNombre, Integer iArmadura) {
		super();
		this.sNombre = sNombre;
		this.iArmadura = iArmadura;
	}

	public Patrulla(Integer iCantidadOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantidadOcupantes, iFila, iColumna, dFechaIngreso);
		// TODO Auto-generated constructor stub
		ingreseNombre();
		ingreseNivelArmadura();
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public Integer getiArmadura() {
		return iArmadura;
	}

	public void setiArmadura(Integer iArmadura) {
		this.iArmadura = iArmadura;
	}

	public void ingreseNombre() {
		System.out.printf("\nIngrese nombre: ");
		sNombre = data.nextLine();

	}

	public void ingreseNivelArmadura() {

		boolean salir = false;
		do {
			System.out.printf("\nNivel de Armadura");
			iArmadura = data.nextInt();
			if (iArmadura > 0 && iArmadura < 6) {
				salir = true;
			} else {
				System.out.printf("\n\"El nivel de armadura tiene que estar entre 1 y 5\"");
				salir = false;
			}
		} while (salir);
	}

}
