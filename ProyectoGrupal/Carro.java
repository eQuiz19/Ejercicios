package ProyectoGrupal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Carro {
	public static Scanner data = new Scanner(System.in);

	Integer iCantidadOcupantes = 0;
	Integer iFila;
	Integer iColumna;
	Date dFechaIngreso;

	public Carro() {
		ingresoDatos();
	}

	public Carro(Integer iCantidadOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super();
		this.iCantidadOcupantes = iCantidadOcupantes;
		this.iFila = iFila;
		this.iColumna = iColumna;
		this.dFechaIngreso = dFechaIngreso;
	}

	public Integer getiCantidadOcupantes() {
		return iCantidadOcupantes;
	}

	public void setiCantidadOcupantes(Integer iCantidadOcupantes) {
		this.iCantidadOcupantes = iCantidadOcupantes;
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

	public Date getdFechaIngreso() {
		return dFechaIngreso;
	}

	public void setdFechaIngreso(Date dFechaIngreso) {
		this.dFechaIngreso = dFechaIngreso;
	}

	public void ingresoDatos() {
		System.out.println("***********************");
		System.out.println("\nIngrese cantidad de ocupantes del carro");
		this.iCantidadOcupantes = data.nextInt();

		try {
			System.out.println("Ingrese fecha de ingreso, DD/MM/YYYY");
			String sFecha = data.next();

			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sFecha);
		} catch (ParseException e) {
			System.out.println("Error en el ingreso de fecha");
			System.out.println();
		}

		System.out.println();
	}

}
