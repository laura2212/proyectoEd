package electrodomesticos;

public class Cocina extends Electrodomestico {
	
	//listas de atributos.
	private long Alto;
	private long Ancho;
	private long Profundidad;
	private String Alimentacion;
	
	//contructor por defecto.
	public Cocina(){
		super();
		this.Alto=85;
		this.Ancho=65;
		this.Profundidad=65;
		this.Alimentacion="Gas";
		
	}

	
	//constructor especializado con medidas alto,ancho y profundidad.
	public Cocina (int base,String color,char consumoEnergetico,double peso,long Alto,long Ancho,long Profundidad){
		super(base,color,consumoEnergetico,peso);
		this.Alto=validarAlto(Alto);
		this.Ancho=validarAncho(Ancho);
	  	this.Profundidad=validarprofundidad(Profundidad);	    
	  	this.Alimentacion="Gas";
		}
	//constructor con todos los atributos.
	public Cocina (int base,String color,char consumoEnergetico,double peso,long Alto,long Ancho,long Profundidad,String alimentacion){
		super(base,color,consumoEnergetico,peso);
		this.Alto=validarAlto(Alto);
		this.Ancho=validarAncho(Ancho);
	  	this.Profundidad=validarprofundidad(Profundidad);	    
	  	this.Alimentacion=validarAlimentacion(alimentacion);
		}
	
	//Metodos.
	//Getters.
	public long getAlto(){
	  	return this.Alto;
	}
	
	public long getAncho(){
		return this.Ancho;
	}
	
	public long getProfundidad(){
		return this.Profundidad;
	}
	public String getAlimentacion(){
		return this.Alimentacion;
	}
	
	
	//setters.
	
	public void setAlimentacion (String Alimentacion){
	  	  this.Alimentacion=validarAlimentacion(Alimentacion);
	}
	
	public String mostrarAtributos(){
	  	 String mostrar="";
	  	 mostrar=("Atributos de Cocina:  "+"     "+         
	  			   super.mostrarAtributos()+"     "+
	  	          "Altura:  "+getAlto()+"cm       "+ 
	  	          "Anchura:  "+getAncho()+"cm       "+ 
	  	          "Profundidad:  "+getProfundidad()+"cm       "+
	  	          "Alimentacion:  "+getAlimentacion()+"     "+
	  	          "Precio Final: $"+getPrecioFinal());
	       return mostrar;
	}
	
	//validacion de datos.
	
	private long validarAlto(long Alto){
		long defecto=85l;
		if (Alto>=80 & Alto<=95) {
			return Alto;
		}
		return defecto;
		}
	
	
	private long validarAncho(long Ancho){
		long defecto=65l;
		if (Ancho >=50& Ancho<=120){
			return Ancho;
		}
		return defecto;
		}
	
	private long validarprofundidad(long Profundidad){
		long defecto=65l;	
		if (Profundidad >=60&Profundidad<=70){
			return Profundidad;
		}
	
		return defecto;
		}
	
	private String validarAlimentacion(String Alimentacion){
		String defecto="Gas";
			if(Alimentacion=="Electrica"){
				return Alimentacion;
			}
		
		return defecto;
	}
	
	
	public double getPrecioFinal() {
		double precio=super.getPrecioFinal();
		if (this.Ancho>=60&this.Ancho<=79) {
			precio+=(0.15*precio);
		}
		
		if (this.Ancho>=80&this.Ancho<=99) {
			precio+=(0.2*precio);
		}
		if (this.Ancho>=100) {
			precio+=(0.3*precio);
		}
		return precio;
	}
}
