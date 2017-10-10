package electodomesticos;

public class Electrodomestico{

	
	//Atributos.
	private double base;
    private String color;
    private char consumoEnergetico;
    private double peso;
    protected double precioFinal;//Es protegido para poder usarlo en las clases derivadas
    
    //Constructor con valores por defecto:
    public Electrodomestico(){
    	
  	  this.base=0d;
  	  this.color="Blanco";
  	  this.consumoEnergetico='F';
  	  this.peso=5d;
    }
    //Constructor especializado :

    public Electrodomestico(double base,String color,char consumoEnergetico,double peso){
  	  this.base=validarBase(base);
  	  this.color=validarColor(color);
  	  this.consumoEnergetico=validarConsumo(consumoEnergetico);
  	  this.peso=validarPeso(peso);
    }
    
    //Metodos que permiten acceder a los campos:
    
    public void setBase(double base){
  	 this.base=validarBase(base); 
    }
    public double getBase(){
  	return this.base;  
    }
    
    public void setColor (String color){
  	  this.color=validarColor(color);
    }
    public String getColor(){
  	  return this.color;
    }
    
    public void setConsumoEnergetico(char consumo){
  	  this.consumoEnergetico=validarConsumo(consumo);
    }
    
    public char getConsumoEnergetico(){
  	  return consumoEnergetico;
    }
    public void setPeso(double peso){
  	  this.peso=validarPeso(peso);
  	  
    }
    public double getPeso(){
  	  return this.peso;
    }
    
    public String mostrarAtributos(){
  	 String mostrar="";
  	 mostrar=("Atributos:    "+         
  			
  	          "Pecio base :"+getBase()+"     "+ 
  	          "Color: "+getColor()+"     "+ 
  	          "Consumo energetico: "+getConsumoEnergetico()+"   "+
  	          "Peso:   "+getPeso());
       return mostrar;
    }
    
    private void saberPrecioFinal(){
  	 this.precioFinal=this.base;
  	 precioConsumo();
  	 precioPeso();
    }
    public double getPrecioFinal(){
  	  saberPrecioFinal();
  	  return this.precioFinal;
    } 
    
    //validacion de datos ingresados:
    //Son privados porque son propios de la clase.
    
    
    private String validarColor( String color){ 
  	  
  	  String []colores=new String[] {"Blanco","Negro","Rojo","Azul","Gris","blanco","gris","negro","rojo","azul"};
  	  String defecto="Blanco";
  	  
  	  for(int i=0;i<colores.length;++i){
  		  
  		 if(colores[i]==color){
  		 return color;	
    }
  	  }
  	return defecto;
    } 
    
    
    private char validarConsumo(char consumo){
    	
  	  char[]consumosPosibles=new char[] {'A','B','C','D','F'};
  	  char defecto='F';
  	  for (int i = 0; i < consumosPosibles.length; i++) {
  		  if (consumosPosibles[i]==consumo) {
  		      return consumo;
		} 
  		  }   return defecto;
    
  	  }
    
 
    private double validarPeso(double peso) {
		double defecto=5d;
		
		if (peso<0) {
			return defecto;
		}
		return peso; 
	}
    
    private double validarBase(double base) {
  		double defecto=0d;
  		
  		if (base<0) {
  			return defecto;
  		}
  		return base; 
  	}
    
    //Determinacion de precio segun atributos consumo y peso:
    
    private void precioConsumo() {
		switch (this.consumoEnergetico) {
		
		case 'A':
			this.precioFinal +=100d;
			break;
        case'B': 
        	this.precioFinal +=80d;
			break;
        case 'C':
        	this.precioFinal +=60d;
			break;
        case'D': 
        	this.precioFinal +=50d;
			break;
        case 'E':
        	this.precioFinal +=30d;
			break;
        case 'F':
        	this.precioFinal +=10d;
			break;
		}
				
	}
    
    private void precioPeso() {
    	
		if (this.peso<=19) {
			this.precioFinal+=10d;
		}
		if (this.peso>=20 & this.peso<=49) {
			this.precioFinal+=50d;
		}
		if (this.peso>=50 & this.peso<=79) {
			this.precioFinal+=50d;
		}
		if (this.peso>=80 ) {
			this.precioFinal+=100d;
		}
	}
 
}
