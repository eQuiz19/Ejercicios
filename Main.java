package evaluacion;

	 
	public class Main {
		 
	    public static void main(String[] args) {
	   
	        Electrodomestico arregloElectrodomesticos[]=new Electrodomestico[10];
	        
	        // donde no hay valores, se asignan por defecto.
	        arregloElectrodomesticos[0]=new Lavadora(99, 21, 'Z', "blanco", 40);
	        arregloElectrodomesticos[1]=new Television(320, 115, 'A', "gris", 21, true);
	        arregloElectrodomesticos[2]=new Lavadora(854, 20, 'D', "negro", 1);
	        arregloElectrodomesticos[3]=new Lavadora(180, 80);
	        arregloElectrodomesticos[4]=new Electrodomestico(20, 10, 'H', "Rojo");
	        arregloElectrodomesticos[5]=new Electrodomestico(700, 12, 'B', "azul");
	        arregloElectrodomesticos[6]=new Electrodomestico(150, 72);
	        arregloElectrodomesticos[7]=new Television(100, 15);
	        arregloElectrodomesticos[8]=new Electrodomestico();
	        arregloElectrodomesticos[9]=new Television(120, 120, 'C', "naranja", 31, true);

	        
	        double sumaElectrodomesticos=0;
	        double sumaTelevisiones=0;
	        double sumaLavadoras=0;
	   
	      
	        for(int i=0;i<arregloElectrodomesticos.length;i++){
	         
	   
	            if(arregloElectrodomesticos[i] instanceof Electrodomestico){
	                sumaElectrodomesticos+=arregloElectrodomesticos[i].PrecioAgregado();
	            }
	            if(arregloElectrodomesticos[i] instanceof Lavadora){
	                sumaLavadoras+=arregloElectrodomesticos[i].PrecioAgregado();
	            }
	            if(arregloElectrodomesticos[i] instanceof Television){
	                sumaTelevisiones+=arregloElectrodomesticos[i].PrecioAgregado();
	            }
	        }
	  
	        System.out.println("Total precio de electrodomesticos :"+sumaElectrodomesticos);
	        System.out.println("Total precio lavadora :"+sumaLavadoras);
	        System.out.println("Total precio TV :"+sumaTelevisiones);
	        System.out.println("Total de todo el contenido :"+(sumaElectrodomesticos+sumaLavadoras+sumaTelevisiones));
	   
	    }
	   
	}