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
	* Comando para ejecutar la acción del botón Reiniciar.
	*/
	public final static String REGISTRAR_JUGADA = "Registrar Jugada";
	

	/**
	* 
	*/
	@UILabel(nombre = " HoyoActual ")
	private JLabel lblHoyoActual;
	
	/**
	* 
	*/
	@UILabel(nombre = " Imagen ")
	private JLabel lblImagen;
	
	/**
	* 
	*/
	@UIBoton( comando = " ", label = " ", metodo = I.)
	private JButton btnRegistrarJugada;
	
	/**
	* 
	*/
	private Integer numeroJugador; 	
	
	/**
	* 
	*/
	@UILabel(nombre = " Dinero ")
	private JLabel lblDinero;
	
	/**
	* 
	*/
	@UILabel(nombre = " NumeroGolpes ")
	private JLabel lblNumeroGolpes;
	
	/**
	* Comando para ejecutar la acción del botón Reiniciar.
	*/
	private String REGISTRAR_JUGADA="Registrar Jugada"; 	
	
	

	/**
	* 
	*/
	public void actualizar(Double pDinero, Integer pHoyoActual, Integer pNumeroGolpes)
	{
	
	}
	
	
	

} 
