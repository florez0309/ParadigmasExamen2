package co.edu.poli.Examen3.servicios;

import co.edu.poli.Examen3.model.Examenmedico;

public interface OperacionArchivo {

	
	    
	  String serializar(Examenmedico[] Examenmedico, String path, String name) throws Exception;

	
	  Examenmedico[] deserializar(String path, String name) throws Exception;
}
