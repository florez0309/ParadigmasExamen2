package co.edu.poli.Examen3.model;

public class Examensangre extends Examenmedico {
	
    private String rh;
    private String tipodesangre;
    
    public Examensangre() {}

    public Examensangre(String codigoexamen, String nombrepaciente, String fecharealizacion, double costo, String rh, String tipodesangre) {

    	super(codigoexamen, nombrepaciente, fecharealizacion, costo);
    	this.rh = rh;
        this.tipodesangre = tipodesangre;
    }
 
    public String mostrarInfo() {
        return super.mostrarInfo() + " | rh: " + rh +
               " | tipodesangre: " + tipodesangre;
        
    }
    
    public String getrh() { return rh; }

   
    public void setrh(String rh) { this.rh = rh; }

  
    public String gettipodesangre() { return tipodesangre; }

 void settipodesangre(String tipodesangre) { this.tipodesangre = tipodesangre; }

}
