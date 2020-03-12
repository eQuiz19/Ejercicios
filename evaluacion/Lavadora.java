package evaluacion;

public class Lavadora extends Electrodomestico{
	  
    
	private final static int cargaDefinida=5;
	
    private int cargaLavadora;
 
    public Lavadora(){
        this(precioBaseDefinido, pesoDefinido, cEnergeticoDefinido, colorDefinido, cargaDefinida);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, cEnergeticoDefinido, colorDefinido, cargaDefinida);
    }
  
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.cargaLavadora=carga;
    }
    
    public int getCarga() {
        return cargaLavadora;
    }
  
    public double precioFinal(){
    Electrodomestico electro = new Electrodomestico();
    
        double agregado= electro.PrecioAgregado();
        if (cargaLavadora>30){
        	agregado+=50;
        }
  
        return agregado;
    }
  
}