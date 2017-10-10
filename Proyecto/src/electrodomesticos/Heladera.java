package electrodomesticos;

public class Heladera {
	//Atributos
		private String Tiporefrigerador;
		private double Capacidad;
		protected double precioFinal;
		
	    //Constructor con valores por defecto:
		public Heladera(){
			this.Tiporefrigerador = "Cogelador";
			this.Capacidad = 40;
		}
		
	    //Constructor especifico

		public Heladera(double precio,String color,char consumo,double peso,String tiporefrigerador, double capacidad){
			this.Tiporefrigerador = tiporefrigerador;
			this.Capacidad = capacidad;
		}
		

		public String getTiporefrigerador() {
			return Tiporefrigerador;
		}
		public void setTiporefrigerador(String tiporefrigerador) {
			Tiporefrigerador = tiporefrigerador;
		}

		public Double getCapacidad() {
			return Capacidad;
		}

		public void setCapacidad(Double capacidad) {
			Capacidad = capacidad;
		}
		
		
		 public double precioFinal(){
			 double precio=0;
	         if (this.Capacidad > 50)
	         {
	             switch (this.Tiporefrigerador)
	             {
	                 case "Congelador":
	                     precio = precio + 100; 
	                     break;
	                 case "Frigorífico":
	                     precio = precio + 60;
	                     break;
	             }
	         }
	         return precio;
	     }
		 
		 public String toString()
	     {
	         String result = "";
	         result += "\n" + Tiporefrigerador ;
	         result += "\n" + Capacidad + "\n.";
	         return result;
	     }

		

}
