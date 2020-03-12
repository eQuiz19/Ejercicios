package evaluacion;

public class Television extends Electrodomestico{
	  
 
	private final static int resolucionDefinida=20;
  
	private int resolucion;
	private boolean sintonizadorTDT;
  

	   public Television(){
	        this(precioBaseDefinido, pesoDefinido, cEnergeticoDefinido, colorDefinido, resolucionDefinida, false);
	    }
	  
	    public Television(double precioBase, double peso){
	        this(precioBase, peso, cEnergeticoDefinido, colorDefinido, resolucionDefinida, false);
	    }
	  
	    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
	        super(precioBase, peso, consumoEnergetico, color);
	        this.resolucion=resolucion;
	        this.sintonizadorTDT=sintonizadorTDT;
	    }
    
    public double precioFinal(){
    	Electrodomestico electro = new Electrodomestico();
        double agregado=electro.PrecioAgregado();
  
        if (resolucion>40){
            agregado+=precioBaseDefinido*0.3;
        }
        if (sintonizadorTDT){
        	agregado+=50;
        }
  
        return agregado;
    }
  
   
   
}