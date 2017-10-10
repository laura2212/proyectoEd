package electrodomesticos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
	  	

//     Electrodomestico mio=new Electrodomestico();
//   System.out.println(mio.mostrarAtributos());  
//   mio.setColor("gris");
//  mio.setConsumoEnergetico('W');
//  mio.setPeso(-1);
//  mio.setBase(-1);
//   System.out.println(mio.mostrarAtributos());  
//System.out.println(mio.getPrecioFinal());
//Electrodomestico especial=new Electrodomestico(100,"Negro",'C', 80);
//System.out.println(especial.getPrecioFinal());
//
//System.out.println(especial.mostrarAtributos());  
//especial.setConsumoEnergetico('A');;
//System.out.println(especial.mostrarAtributos()); 
//System.out.println(especial.getPrecioFinal());
//for (int i = 0; i <=8; i++) {
//char resp=(char) Math.floor(Math.random()*(13-6)+65);
//System.out.println(resp); 
//
//	//especial.setConsumoEnergetico(resp); 
//	}
//	//System.out.println(numero);
//
//	System.out.println(especial.mostrarAtributos()); 
//	//System.out.println(resp); 

	ArrayList<Electrodomestico>coleccion=new ArrayList<Electrodomestico>();
//	int carga=30;
//	//coleccion.add(new Electrodomestico(10,"gris",'D',10));
//	Lavarropa lava=new Lavarropa();
//System.out.println(lava.getCarga());
//	coleccion.add(lava);
	//System.out.println(coleccion.toString());
	//mostrar(coleccion);
//	}
//	
//public static void mostrar(ArrayList<Electrodomestico> elect) {
//	for(Electrodomestico n:elect){
//		System.out.println(n.mostrarAtributos());
//		n.getClass();
//	
//         
//	}
//}



		coleccion.add(new Lavarropa());
		coleccion.add(new Lavarropa(10, "negro", 'F', 15, 15));
		
	
		for(Electrodomestico j: coleccion){
			
			j.mostrarAtributos();
			System.out.println(j.mostrarAtributos());
			System.out.println(j.getPrecioFinal());
			
		}	
		ejecutar(coleccion);
		//System.out.println(precioFinal);
}
	
	public static void ejecutar(ArrayList<Electrodomestico>coleccion) {
		  String []colores=new String[] {"Blanco","Negro","Rojo","Azul","Gris","blanco","gris","negro","rojo","azul"};
			int numero =1; //(int)Math.floor(Math.random()*(1-4)+4); 
			int elejirColor = (int)Math.floor(Math.random()*(1-10)+9); 
			double carga = Math.floor(Math.random() *(8-20)+5);
			
        switch (numero) {
		case 1:{
			coleccion.add(new Lavarropa());
			for(Electrodomestico j: coleccion){
				
				j.mostrarAtributos();
				System.out.println(j.mostrarAtributos());
				System.out.println(j.getPrecioFinal());

			break;}}
        case 2:
			
			break;
        case 3:
			
			break;	
		default:
			break;
		}
	}

}

