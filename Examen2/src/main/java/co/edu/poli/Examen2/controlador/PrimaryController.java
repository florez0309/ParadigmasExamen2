package co.edu.poli.Examen2.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

import co.edu.poli.Examen3.model.*;
import co.edu.poli.Examen3.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.Examen3.model.Examenmedico;
import co.edu.poli.Examen3.model.Examensangre;

@SuppressWarnings("unused")
public class PrimaryController {

	@FXML
	private TextField txtCodigoExamen;
	@FXML
	private TextField txtNombrePaciente;
	@FXML
	private TextField txtCosto;
	@FXML
	private ComboBox<String> cmbTipoSangre;
	@FXML
	private RadioButton rbPositivo;
	@FXML
	private RadioButton rbNegativo;
	@FXML
	private ToggleGroup tgFactorRH;
	@FXML
	private TextArea txtAreaResultados;
	private TextInputControl txtResultado;
	private ImplementacionOperacionCRUD servicio;

	@FXML
	public void initialize() {
	}

	@FXML
	 private void crear() {
        try {
            
  
         String codigoexamen = txtCodigoExamen.getText().trim();
         String nombrepaciente = txtNombrePaciente.getText().trim();
         String costo = txtCosto.getText().trim();
         String tipodesangre = (cmbTipoSangre.getValue() != null) ? cmbTipoSangre.getValue().toString().trim() : "";
         String Arearesultados = txtAreaResultados.getText().trim();
        	      
         if (codigoexamen.isEmpty() || nombrepaciente.isEmpty() || costo.isEmpty() || tipodesangre.isEmpty()) {
       txtResultado.setText("ERROR: Codigoexamen, nombrepaciente, costo y tipodesangre son obligatorios.");
          return; 
        	        }


       } catch (NumberFormatException e) {
         txtResultado.setText("ERROR: El costo debe ser un número válido.");
        }catch (Exception e) {
         txtResultado.setText("ERROR inesperado: " + e.getMessage());
        	    } 
        	} 

	@FXML
	private void handleLimpiar() {
	}

	
	@FXML
	  private void serializar() {
        try {
            servicio = null;
			String resultado = servicio.serializar();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("📦 Artículos Serializados");
            alert.setContentText(resultado.isEmpty() ? "No hay Examenesmedicos" : resultado);
            alert.getDialogPane().setPrefWidth(500);
            alert.showAndWait();
        } catch (Exception e) {
            mostrarMensaje("❌ Error: " + e.getMessage(), true);
        }
    }

	private void mostrarMensaje(String string, boolean b) {
	
		
	}

	@FXML
	private void handleDeserializar() {
	    try (java.io.ObjectInputStream ois = new java.io.ObjectInputStream(
	            new java.io.FileInputStream("datos_examenes.dat"))) {
	        
	        
	        Examenmedico[] datosCargados = (Examenmedico[]) ois.readObject();
	        
	       
			servicio.setArreglo(datosCargados); 
	        
	        txtResultado.setText("Datos recuperados correctamente del disco.");
	        

	        handleListar();
	        
	    } catch (java.io.FileNotFoundException e) {
	        txtResultado.setText("No se encontró ningún archivo de respaldo previo.");
	    } catch (Exception e) {
	        txtResultado.setText("Error al deserializar: " + e.getMessage());
	    }
	}


	@FXML
	private void handleListar() {
	   
	    List<Examenmedico> lista = servicio.listar(); 
	    
	    if (lista.isEmpty()) {
	        txtResultado.setText("No hay registros almacenados para mostrar.");
	        return;
	    }
	    
	   
	    StringBuilder sb = new StringBuilder();
	    sb.append(" REGISTROS ENCONTRADOS \n\n");
	    for (Examenmedico a : lista) {
	       
	        sb.append("Código: ").append(a.getcodigoexamen()).append(" | ")
	          .append("Paciente: ").append(a.getnombrepaciente()).append(" | ")
	          .append("Costo: $").append(a.getcosto()).append("\n");
	    }
	    
	   
	    txtResultado.setText(sb.toString());
	}

}
