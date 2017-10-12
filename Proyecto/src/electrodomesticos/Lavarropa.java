package electrodomesticos;

public class Lavarropa extends Electrodomestico{
	
	private int cargaKg;
	//constructor por defecto.
	public Lavarropa(){
		super();
		this.cargaKg=10;
	}
    //constructor especializado.
	public Lavarropa(int base,String color,char consumoEnergetico,double peso,int carga){
		super( base,color, consumoEnergetico,peso);
		this.cargaKg=validarCarga(carga);
	}
	//getters y setters para atributo carga.
	public void setCarga(int carga) {
		this.cargaKg=validarCarga(carga);
	}
	
	public int  getCarga() {
		return this.cargaKg;	
	}
	
	
	public double getPrecioFinal() {
         double precio=super.getPrecioFinal();
         if (cargaKg>10) {
 			precio=precio+(cargaKg/3);
 		}
		return precio;
	}
	
	private int validarCarga(int carga) {
        int defecto=10;
		
		if (carga<0) {
			return defecto;
		}
		return carga; 
		
	}
	
	public String mostrarAtributos(){
	  	 String mostrar="";
	  	mostrar="Atributos de Lavarropa:"+"     "+
	  	         super.mostrarAtributos()+"     "+
	  			"Carga:  "+this.cargaKg+"kg       "+
	  			"Precio Final: $"+getPrecioFinal();
	  	return mostrar;
	    }
	    
}
