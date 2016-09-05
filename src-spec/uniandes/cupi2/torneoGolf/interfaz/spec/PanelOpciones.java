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
	* Comando para ejecutar la acción del botón Opción 2.
	*/
	public final static String OPCION_2 = "Opción 2";
	/**
	* Comando para ejecutar la acción del botón Reiniciar.
	*/
	public final static String REINICIAR = "Reiniciar";
	/**
	* Comando para ejecutar la acción del botón Opción 1.
	*/
	public final static String OPCION_1 = "Opción 1";
	

	/**
	* Comando para ejecutar la acción del botón Opción 2.
	*/
	private String OPCION_2="Opción 2"; 	
	
	/**
	* Comando para ejecutar la acción del botón Reiniciar.
	*/
	private String REINICIAR="Reiniciar"; 	
	
	/**
	* Botón para reiniciar.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnReiniciar;
	
	/**
	* Botón para la opción 2.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnOpcion2;
	
	/**
	* Comando para ejecutar la acción del botón Opción 1.
	*/
	private String OPCION_1="Opción 1"; 	
	
	/**
	* Botón para la opción 1.
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnOpcion1;
	
	

	
	

} 
