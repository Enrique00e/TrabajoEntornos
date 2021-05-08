
/**
 * Esta clase hereda de Alojamiento, para crear una Caravana.
 * @author Enrique, Víctor T., Víctor N.
 *
 */
public class Caravana extends Alojamiento{

	int pesoMaximo;

	
	/**
	 * Constructor de Caravanas.
	 * @param codigo. Este parámetro te permitirá identificar el código del alojamiento.
	 * @param numPlazas. Este parámetro indicará el número de plazas del alojamiento.
	 * @param suplemento. Este parámetro indicará el suplemento de la caravana.
	 * @param pesoMaximo. Este parámetro indicará el peso máximo permitido para una caravana.
	 */
	public Caravana(String codigo, int numPlazas, int suplemento, int pesoMaximo) {
		super(codigo, numPlazas, suplemento);
		this.pesoMaximo = pesoMaximo;
	}

	// A las caravanas se les suma el suplemento multiplicado por el número de plazas y los días de alquiler
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
