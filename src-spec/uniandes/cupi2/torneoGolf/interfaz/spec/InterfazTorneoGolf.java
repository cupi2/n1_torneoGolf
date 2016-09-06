package uniandes.cupi2.torneoGolf.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.torneoGolf.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "TorneoGolf")
public class InterfazTorneoGolf extends _InterfazTorneoGolf
{

	/**
	* <p>Constante que representa el Jugador 4.</p>
	
	*/
	public final static int JUGADOR_4 = 4;
	/**
	* <p>Constante que representa el Jugador 3.</p>
	
	*/
	public final static int JUGADOR_3 = 3;
	/**
	* <p>Constante que representa el Jugador 1</p>
	
	*/
	public final static int JUGADOR_1 = 1;
	/**
	* <p>Constante que representa el Jugador&nbsp;2.</p>
	
	*/
	public final static int JUGADOR_2 = 2;
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 4.</span>
	*/
	public final static Integer JUGADOR_4 = 4;
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 2.</span>
	*/
	public final static Integer JUGADOR_2 = 2;
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 3.</span>
	*/
	public final static Integer JUGADOR_3 = 3;
	/**
	* Constante que representa el área 1.
	*/
	public final static Integer JUGADOR_1 = 1;
	

	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 4.</span>
	*/
	private Integer JUGADOR_4=4; 	
	
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 2.</span>
	*/
	private Integer JUGADOR_2=2; 	
	
	/**
	* <span style="font-size: 12.8px;">Constante que representa el área 3.</span>
	*/
	private Integer JUGADOR_3=3; 	
	
	/**
	* Constante que representa el área 1.
	*/
	private Integer JUGADOR_1=1; 	
	
	

	/**
	* 
	*/
	private TorneoGolf torneoGolf;
	
	/**
	* 
	*/
	private PanelJugador panelJugador2;
	
	/**
	* 
	*/
	private PanelImagen panelImagen;
	
	/**
	* 
	*/
	private PanelOpciones panelOpciones;
	
	/**
	* 
	*/
	private PanelJugador panelJugador1;
	
	/**
	* 
	*/
	private PanelJugador panelJugador4;
	
	/**
	* 
	*/
	private PanelInformacion panelInformacion;
	
	/**
	* 
	*/
	private PanelJugador panelJugador3;
	
	

	/**
	* 
	*/
	public InterfazTorneoGolf()
	 {

	 }


	/**
	* 
	*/
	public void registrarJugada(Integer pNumeroJugador, Integer pNumeroGolpes)
	{
	
	}
	
	/**
	* 
	*/
	public void reFuncOpcion1()
	{
	
	}
	
	
	/**
	* 
	*/
	public void reiniciar()
	{
	
	}
	
	/**
	* 
	*/
	public void reqFuncOpcion1() {
	
	}


	/**
	* 
	*/
	public void reqFuncOpcion2()
	{
	
	}
	
	/**
	* 
	*/
	public void actualizarPaneles()
	{
	
	}
	
	



    /**
	* 
	*/
	public void reqFuncOpcion2() {
	
	}


	/**
	* 
	*/
	public void registrarJugada(int pNumeroJugador, int pNumeroGolpes) {
	
	}


				// -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = torneoGolf.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = torneoGolf.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
    * Este método ejecuta la aplicación, creando una nueva interfaz.
    * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
    */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazTorneoGolf interfaz = new InterfazTorneoGolf( );
        interfaz.setVisible( true );
    }
}
