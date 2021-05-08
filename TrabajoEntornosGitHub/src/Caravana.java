
/**
 * Esta clase hereda de Alojamiento, para crear una Caravana.
 * @author Enrique, V�ctor T., V�ctor N.
 *
 */
public class Caravana extends Alojamiento{

	int pesoMaximo;

	
	/**
	 * Constructor de Caravanas.
	 * @param codigo. Este par�metro te permitir� identificar el c�digo del alojamiento.
	 * @param numPlazas. Este par�metro indicar� el n�mero de plazas del alojamiento.
	 * @param suplemento. Este par�metro indicar� el suplemento de la caravana.
	 * @param pesoMaximo. Este par�metro indicar� el peso m�ximo permitido para una caravana.
	 */
	public Caravana(String codigo, int numPlazas, int suplemento, int pesoMaximo) {
		super(codigo, numPlazas, suplemento);
		this.pesoMaximo = pesoMaximo;
	}

	// A las caravanas se les suma el suplemento multiplicado por el n�mero de plazas y los d�as de alquiler
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas()*dias;
	}
	/**
	 * Escribe los datos de las caravanass, con sus datos de alojamiento en la consola.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "PesoMaximo:",pesoMaximo);
	}
	
}
