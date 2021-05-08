
/**
 * Esta clase hereda de Alojamiento, para crear un Bungalow.
 * @author Enrique, V�ctor T., V�ctor N.
 *
 */
public class Bungalow extends Alojamiento{

	private int superficiePorche;
		
	
	/**
	 * Constructor de Bungalow
	 * @param codigo. Este par�metro te permitir� identificar el c�digo del alojamiento.
	 * @param numPlazas. Este par�metro indicar� el n�mero de plazas del alojamiento.
	 * @param suplemento. Este par�metro indicar� el suplemento del Bungalow.
	 * @param superficiePorche. Este par�metro indicar� la superficie del Bungalow.
	 */
	public Bungalow(String codigo, int numPlazas, int suplemento, int superficiePorche) {
		super(codigo, numPlazas, suplemento);
		this.superficiePorche = superficiePorche;
	}
	
	// En los bungalows se suma el suplemento multiplicado por el n�mero de plazas independientemente de los d�as que se hayan alquilado
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas();
	}
	/**
	 * Escribe los datos del Bungalow, con sus datos de alojamiento en la consola.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Superficie del porche:", superficiePorche);
	}
}
