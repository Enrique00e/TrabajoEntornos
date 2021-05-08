
/**
 * Esta clase pretende construir un Alojamiento
 * @author Enrique, V�ctor T., V�ctor N.
 *
 */
public abstract class Alojamiento {
	private String codigo;
	private static final int PRECIO_POR_DIA = 50;
	private int numPlazas;
	private int suplemento;
	
	/**
	 * Constructor de alojamientos
	 * @param codigo. Este par�metro te permitir� identificar el c�digo del alojamiento.
	 * @param numPlazas. Este par�metro indicar� el n�mero de plazas del alojamiento.
	 * @param suplemento. Este par�metro indicar� el suplemento el alojamiento.
	 */
	
	public Alojamiento(String codigo, int numPlazas, int suplemento) {
		super();
		this.codigo = codigo;
		this.numPlazas = numPlazas;
		this.suplemento = suplemento;
	}
	/**
	 * 
	 * @param dias. Este par�metro indicar� el n�mero de d�as que estar� ocupado el alojamiento.
	 * @return. Devuelve el precio a pagar por el alojamiento
	 */
	public abstract double  precioAPagar(int dias);
	 
	/**
	 * 
	 * @return. Devuelve el c�digo del alojamiento
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @return. Devuelve el precio a pagar por d�a en el alojamiento.
	 */
	public static int getPrecioPorDia() {
		return PRECIO_POR_DIA;
	}
	
	/**
	 * 
	 * @return. Devuelve el n�mero de plazas del alojamiento.
	 */
	public int getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 * 
	 * @return. Devuelve el suplemento del alojamiento.
	 */
	public int getSuplemento() {
		return suplemento;
	}
	
	/**
	 * Escribe los datos del alojamiento en la consola.
	 */
	@Override
	public String toString() {
		return String.format("codigo: %-8s, precio por dia:%3d, plazas:%3d", codigo, PRECIO_POR_DIA, numPlazas);
	}
	
	
}
