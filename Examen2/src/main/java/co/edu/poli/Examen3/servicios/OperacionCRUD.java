package co.edu.poli.Examen3.servicios;

import java.util.List;
import co.edu.poli.Examen3.model.Examenmedico;

public interface OperacionCRUD {
 
	String guardar (Examenmedico Examenmedico);
	
	Examenmedico leer(int indic);
	
	Examenmedico[] leertodo();
	
	public List<Examenmedico> listar();

}
