package electrodomesticos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
	  	ArrayList<Electrodomestico>coleccion=new ArrayList<Electrodomestico>();

		ejecutar(coleccion);
		mostrarColeccion(coleccion);
}
	
	
	public static void mostrarColeccion(ArrayList<Electrodomestico>coleccion) {
		double totalPrecio=0d;
		for(Electrodomestico j: coleccion){
			System.out.println(j.mostrarAtributos());
			totalPrecio+=j.getPrecioFinal();
		}
		System.out.println("Total precio: $"+formato(totalPrecio));

	}
	
	
	
	public static void ejecutar(ArrayList<Electrodomestico>coleccion) {
		  
		//Al arreglo de colores se le agrego el color rosa
		//el cual debe ser validado en la clase electrodomestico.
	    String []colores=new String[] {"Blanco","Negro","Rojo","Azul","Gris","blanco","gris","negro","rojo","azul","Rosa"};
        String[]tipos={"Congelador","Frigrorifico"};
        String[]alimentaciones={"Electrica","Gas"};

		int i=0;
		//j es la cantidad de electrodomesticos del arreglo.
		int j=(int)Math.floor(Math.random() *(7-12)+12);
		while(i<j){
			
		int numero =(int)Math.floor(Math.random()*(1-4)+4); 
		int base = (int)Math.floor(Math.random() *(4000-7000)+7000);
        String color = colores[(int)Math.floor(Math.random()*(1-11)+11)]; 
        
        //valores aleatorios de letras de la A a la G;
        //la ultima debe ser validada en la clase electrodomestico.
        
		char consumo =(char) Math.floor(Math.random()*(13-6)+65);
		double peso = Math.floor(Math.random() *(0-80)+81);

        switch (numero) {
		case 1:
		   {
			int carga = (int)Math.floor(Math.random() *(10-20)+21);
			coleccion.add(new Lavarropa(base,color,consumo,peso,carga));
			break;
			}
        case 2:
           {
            String tipo=tipos[(int)Math.floor(Math.random() *(0-2)+2)];
			double capacidad = Math.floor(Math.random() *(40-60)+60);
			coleccion.add(new Heladera(base,color,consumo,peso,tipo,capacidad));
			break;
			}
        case 3:{
        	long alto=0l;
        	long ancho=0l;
        	long profundidad=0l;

        	for (int k = 0; k<3; k++) {
    		 long valor = (long)Math.floor(Math.random() *(45-120)+120);
              switch (k) {
			case 0:
				alto=valor;
				break;
			case 1:
				ancho=valor;
				break;
			case 2:
				profundidad=valor;
				break;
			}
			}
             String alimentacion=alimentaciones[(int)Math.floor(Math.random() *(0-2)+2)];
            //el constructor usado es el que solo pide  medidas.
             Cocina cocina=new Cocina(base,color,consumo,peso,alto,ancho,profundidad,alimentacion);
             //aqui se agrega el atributo alimentacion y
             //se incorpora al arreglo de electrodomesticos la cosina.
             cocina.setAlimentacion(alimentacion);
			 coleccion.add(cocina);
    
			break;	
        }
		}
        ++i;
	}
	}

	public static double formato(double precio) {
		BigDecimal format=new BigDecimal(String.valueOf(precio));
		format=format.setScale(6,RoundingMode.HALF_UP);
		return format.doubleValue();
	}
}

