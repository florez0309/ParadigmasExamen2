package co.edu.poli.Examen3.servicios;

import java.util.ArrayList;
import java.util.List;
import co.edu.poli.Examen3.model.Examenmedico;

public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {

	private Examenmedico[] arreglo;
	
	 public String guardar(Examenmedico Examenmedico) {
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] == null) {
	                arreglo[i] = Examenmedico;
	                return "ExamenMedico creado en posicion " + i;
	            }
	        }
	        return "Error: arreglo lleno, no se puede agregar el ExamenMedico.";
	    }
	 public Examenmedico leer(int indic) {
	        if (indic >= 0 && indic < arreglo.length) {
	            return arreglo[indic];
	        }
	        return null;
	 }
	        public Examenmedico[] leertodo() {
	            return arreglo;
	        }
	        
	        public List<Examenmedico> listar() {
	            List<Examenmedico> listaValida = new ArrayList<>();
	            
	            for (int i = 0; i < arreglo.length; i++) {
	                if (arreglo[i] != null) {
	                    listaValida.add(arreglo[i]);
	                }
	            }
	            
	            return listaValida;
	        }

	    
	 public String serializar() {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] != null) {
	                sb.append("[").append(i).append("] ").append(arreglo[i].mostrarInfo()).append("\n");
	            }
	        }
	        return sb.length() > 0 ? sb.toString() : "No hay Examenes para serializar.";
	    }

	 
	    public Examenmedico[] deserealizar() {
	        return arreglo;
	    }

	   
	    public Examenmedico[] getArreglo() {
	        return arreglo;
	    }
		public Object getCantidad() {
			
			return null;
		}
		public void setArreglo(Examenmedico[] datosCargados) {
			
			
		}
		@Override
		public String serializar(Examenmedico[] Examenmedico, String path, String name) throws Exception {
			
			return null;
		}
		@Override
		public Examenmedico[] deserializar(String path, String name) throws Exception {
			
			return null;
		}
	}

