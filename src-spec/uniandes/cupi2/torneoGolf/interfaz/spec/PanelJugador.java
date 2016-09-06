package uniandes.cupi2.torneoGolf.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import index.I;

/**
* 
*/
@UIPanel
public class PanelJugador extends _PanelJugador
{
	/**
	* <p>Comando para ejecutar la acci&oacute;n de Registrar Jugada</p>
	
	*/
	public final static String REGISTRAR_JUGADA = "Registrar Jugada";
	

	/**
	* <p>Etiqueta para mostrar la imagen asociada al jugador</p>
	
	*/
	@UILabel(nombre = " Imagen ")
	private JLabel lblImagen;
	
	/**
	* <p>Etiqueta para mostrar el hoyo en el que el jugador se encuentra actualmente</p>
	
	*/
	@UILabel(nombre = " HoyoActual ")
	private JLabel lblHoyoActual;
	
	/**
	* <p>Etiqueta para mostrar el dinero recudado por el jugador</p>
	
	*/
	@UILabel(nombre = " DineroRecaudado ")
	private JLabel lblDineroRecaudado;
	
	/**
	* <p>Comando para ejecutar la acci&oacute;n de Registrar Jugada</p>
	
	*/
	private String REGISTRAR_JUGADA="Registrar Jugada"; 	
	
	/**
	* <p>Etiqueta para mostrar el n&uacute;mero de golpes dados por el jugador</p>
	
	*/
	@UILabel(nombre = " NumeroGolpes ")
	private JLabel lblNumeroGolpes;
	
	/**
	* <p>Bot&oacute;n para registrar la jugada</p>
	
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRegistrarJugada;
	
	/**
	* <p>Atributo para saber cual es el&nbsp;jugador del cual se esta&nbsp;muestrando&nbsp;en el panel</p>
	
	*/
	private Integer numeroJugador; 	
	
	

	
	/**
	* 
	*/
	public void actualizar(double pDineroRecaudado, int pHoyoActual, int pNumeroGolpes)
	{
	
	}
	
	

} 
