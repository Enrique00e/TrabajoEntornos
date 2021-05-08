
/**
 * Esta clase hereda de Alojamiento, para crear un Bungalow.
 * @author Enrique, Víctor T., Víctor N.
 *
 */
public class Bungalow extends Alojamiento{

	private int superficiePorche;
		
	
	/**
	 * Constructor de Bungalow
	 * @param codigo. Este parámetro te permitirá identificar el código del alojamiento.
	 * @param numPlazas. Este parámetro indicará el número de plazas del alojamiento.
	 * @param suplemento. Este parámetro indicará el suplemento del Bungalow.
	 * @param superficiePorche. Este parámetro indicará la superficie del Bungalow.
	 */
	public Bungalow(String codigo, int numPlazas, int suplemento, int superficiePorche) {
		super(codigo, numPlazas, suplemento);
		this.superficiePorche = superficiePorche;
	}
	
	// En los bungalows se suma el suplemento multiplicado por el número de plazas independientemente de los días que se hayan alquilado
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
