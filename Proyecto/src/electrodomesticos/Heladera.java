package electrodomesticos;

public class Heladera extends Electrodomestico {
	    //Atributos
		private String Tiporefrigerador;
		private double Capacidad;
		
	    //Constructor con valores por defecto:
		public Heladera(){
			super();
			this.Tiporefrigerador = "Congelador";
			this.Capacidad = 40;
		}
		
	    //Constructor especifico

		public Heladera(int base,String color,char consumoEnergetico,double peso,String tiporefrigerador, double capacidad){
			super(base,color,consumoEnergetico,peso);
			this.Tiporefrigerador = tiporefrigerador;
			this.Capacidad = capacidad;
		}
		
		//getters y setters para atributos de heladera.

		public String getTiporefrigerador() {
			return Tiporefrigerador;
		}
		
		public void setTiporefrigerador(String tiporefrigerador) {
			Tiporefrigerador = tiporefrigerador;
		}

		public Double getCapacidad() {
			return Capacidad;
		}

		public void setCapacidad(double capacidad) {
			Capacidad = capacidad;
		}
		
		
		 public double getPrecioFinal(){
			 double precio=super.getPrecioFinal();
	         if (this.Capacidad > 50)
	         {
	             switch (this.Tiporefrigerador)
	             {
	                 case "Congelador":
	                     precio = precio + 100; 
	                     break;
	                 case "Frigorifico":
	                     precio = precio + 60;
	                     break;
	             }
	         }
	         return precio;
	     }
		 
		 
		 public String mostrarAtributos()
	     {
	         String result = "Atributos de Heladera:"+"     "+
	                         super.mostrarAtributos()+"     "+
	                         "Tipo: "+Tiporefrigerador+"     "+
	                         "Capacidad:  "+ Capacidad+"lts        "+
	                         "Precio Final: $"+getPrecioFinal();
	         return result;
	     }
}
