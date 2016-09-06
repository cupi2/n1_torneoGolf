package uniandes.cupi2.torneoGolf.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelOpciones extends _PanelOpciones
{
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Opci&oacute;n 1.</p>
	
	*/
	public final static String OPCION_1 = "Opción 1";
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Reiniciar.</p>
	
	*/
	public final static String REINICIAR = "Reiniciar";
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Opci&oacute;n 2.</p>
	
	*/
	public final static String OPCION_2 = "Opción 2";
	

	/**
	* <p>Bot&oacute;n para la opci&oacute;n 2.</p>
	
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnOpcion2;
	
	/**
	* <p>Bot&oacute;n para reiniciar.</p>
	
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnReiniciar;
	
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Opci&oacute;n 1.</p>
	
	*/
	private String OPCION_1="Opción 1"; 	
	
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Reiniciar.</p>
	
	*/
	private String REINICIAR="Reiniciar"; 	
	
	/**
	* <p>Bot&oacute;n para la opci&oacute;n 1.</p>
	
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnOpcion1;
	
	/**
	* <p>Comando para ejecutar la acci&oacute;n del bot&oacute;n Opci&oacute;n 2.</p>
	
	*/
	private String OPCION_2="Opción 2"; 	
	
	

	
	

} 
