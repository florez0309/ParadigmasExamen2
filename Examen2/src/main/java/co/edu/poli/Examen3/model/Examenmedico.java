package co.edu.poli.Examen3.model;

public class Examenmedico {
	private String codigoexamen;
	private String nombrepaciente;
	private String fecharealizacion;
	private double costo;
	
    public Examenmedico() {}
    
    public Examenmedico(String codigoexamen, String nombrepaciente, String fecharealizacion, double costo) {
    	this.codigoexamen = codigoexamen;
        this.nombrepaciente = nombrepaciente;
        this.fecharealizacion = fecharealizacion;
        this.costo = costo;
    }
    
    public String mostrarInfo() {
        return "Codigoexamen: " + codigoexamen + " | nombrepaciente: " + nombrepaciente +
               " | fecharealizacion: " + fecharealizacion + " | costo: " + costo;
    }

    public double obtenercosto() {
        return costo;
    }
    
    public String getcodigoexamen() { return codigoexamen; }

  
    public void setcodigoexamen(String codigoexamen) { this.codigoexamen = codigoexamen; }

 
    public String getnombrepaciente() { return nombrepaciente; }

   
    public void setnombrepaciente(String nombrepaciente) { this.nombrepaciente = nombrepaciente; }

    public double getcosto() { return costo; }

 
    public void setcosto (double costo) { this.costo = costo; }

    public String getfecharealizacion() { return fecharealizacion; }

 
    public void setfecharealizacion(String fecharealizacion) { this.fecharealizacion = fecharealizacion; }
}
