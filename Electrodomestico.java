package evaluacion;


public class Electrodomestico {
   
 
	protected final static String colorDefinido="blanco";
	protected final static char cEnergeticoDefinido='F';
	protected final static double precioBaseDefinido=100;
	protected final static double pesoDefinido=5;
    
	private char consumoEnergetico; // CONSUMO ELECTRODOMESTICO GENERALES
    private String color; //COLOR ELECTRODOMESTICO GENERALES
    private double peso; // PESO ELECTRODOMESTICO GENERALES
	private double precioBase;

      
    public Electrodomestico(){
        this(precioBaseDefinido, pesoDefinido, cEnergeticoDefinido, colorDefinido);
    }
   
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, cEnergeticoDefinido, colorDefinido);
    }
   
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        validarConsumoEnergetico(consumoEnergetico);
        validarColor(color);
    }
    
    private void validarColor(String color){ 
    	
    
        String colores[]={"gris", "rojo", "negro", "azul", "blanco"};
        boolean colorEncontrado=false;
  
        for(int i=0;i<5 && !colorEncontrado;i++){
              
            if(colores[i].equals(color)){
                colorEncontrado=true;
            }
              
        }
          
        if(colorEncontrado){
            this.color=color;
        }else{
            this.color=colorDefinido;
        }
    }
          
          
    public void validarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=cEnergeticoDefinido;
        }
          
    }
   

    public double getPrecioBase() {
        return precioBase;
    }
 
    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double PrecioAgregado(){
        double agregado=0;
        switch(consumoEnergetico){
            case 'A':
                agregado+=100;
                break;
            case 'B':
            	agregado+=80;
                break;
            case 'C':
            	agregado+=60;
                break;
            case 'D':
            	agregado+=50;
                break;
            case 'E':
            	agregado+=30;
                break;
            case 'F':
            	agregado+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
        	agregado+=10;
        }
        if(peso>=20 && peso<49){
        	agregado+=50;
        }
        if(peso>=50 && peso<=79){
        	agregado+=80;
        }
        if(peso>=80){
        	agregado+=100;
        }
   
        return precioBase+agregado;
    }

   
}
