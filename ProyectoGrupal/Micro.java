package ProyectoGrupal;

import java.util.Date;
import java.util.Scanner;

public class Micro extends Carro {
	public static Scanner data = new Scanner(System.in);

	protected Integer iAnioFabricacion;
	protected String sMarca;

	public Micro() {
		super();
		agregarAnioFabricacion();
		agregarMarca();
	}

	public Micro(Integer iAnioFabricacion, String sMarca) {
		super();
		this.iAnioFabricacion = iAnioFabricacion;
		this.sMarca = sMarca;
	}

	public Micro(Integer iCantidadOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantidadOcupantes, iFila, iColumna, dFechaIngreso);
		// TODO Auto-generated constructor stub
		agregarAnioFabricacion();
		agregarMarca();
	}

	public Integer getiAnioFabricacion() {
		return iAnioFabricacion;
	}

	public void setiAnioFabricacion(Integer iAnioFabricacion) {
		this.iAnioFabricacion = iAnioFabricacion;
	}

	public String getsMarca() {
		return sMarca;
	}

	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}

	public void agregarAnioFabricacion() {
		System.out.println("Ingrese año fabricación de la micro");
		this.iAnioFabricacion = data.nextInt();
	}

	public void agregarMarca() {
		System.out.println("Ingrese marca de la micro");
		this.sMarca = data.nextLine();
	}
}
