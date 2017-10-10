package electrodomesticos;

public class Cocina {
	
	//listas de atributos.
	private long Alto;
	private long Ancho;
	private long Profundidad;
	private String Alimentacion;
	private double preciofinal;
	
	//contructor por defecto.
	public Cocina(){
		this.Alto=85;
		this.Ancho=65;
		this.Profundidad=65;
		this.Alimentacion="Gas";
		
	}

	
	//constructor especializado
	public Cocina (long Alto,long Ancho, 
	long Profunidad,String Alimentacion){
		
		this.Alto=validarAlto(Alto);
		if (Alto ==0){
			System.out.print("vuelva a ingresar una medida");
			;
		   }
		this.Ancho=validarAncho(Ancho);
	  	if (Ancho ==0){
			System.out.print("vuelva a ingresar una medida");
			
			}
	  	this.Profundidad=validarprofundidad(Profundidad);
	  	if (Profundidad ==0){
			System.out.print("vuelva a ingresar una medida");
			
	  	    }
	  	this.Alimentacion=validarAlimentacion(Alimentacion);
	  	if (Alimentacion == "error"){
	  		System.out.print("vuelva a escribir el tipo de alimentacion");
	  		
	  	    }
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
	
	//setters.
	
	public void setAlientacion (String Alimentacion){
	  	  this.Alimentacion=validarAlimentacion(Alimentacion);
	}
	
	
	
	
	
	
	public String mostrarAtributos(){
	  	 String mostrar="";
	  	 mostrar=("Atributos:    "+         
	  			
	  	          "Altura :"+getAlto()+"     "+ 
	  	          "Anchura : "+getAncho()+"     "+ 
	  	          "Profundidad:   "+getProfundidad());
	       return mostrar;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//validacion de datos.
	
	private long validarAlto(long Alto){
		
		long[]Altos = new long []{80,85,90,95};
		for (int i=0;i<Altos.length;i++){		
		if (Alto == Altos[i]){
			return Alto;
		}
		}
		System.out.print("error no es una medida admitida");
		Alto=0;
		return Alto;
		}
	
	
	private long validarAncho(long Ancho){
		long[]Anchos = new long []{50,60,70,80,90,120};
		for (int i=0;i<Anchos.length;i++){		
		if (Ancho ==Anchos[i]){
			return Ancho;
		}
		}
		System.out.print("error no es una medida admitida");
		Ancho=0;
		return Ancho;
		}
	private long validarprofundidad(long Profundidad){
		long[]Pro = new long []{60,65,70};
		for (int i=0;i<Pro.length;i++){		
		if (Profundidad == Pro[i]){
			return Profundidad;
		}
		}
		System.out.print("error no es una medida admitida");
		Profundidad=0;
		return Profundidad;
		}
	
	private String validarAlimentacion(String Alimentacion){
		String[]Ac = new String[]{"Eléctrica", "Gas"};
		for (int i = 0;i< Ac.length;i++){
			if(Alimentacion==Ac[i]){
				return Alimentacion;
			}
		}
		System.out.print("error tipo de alimentacion noo admitida");
		Alimentacion= "error";
		return Alimentacion;
	}
}
