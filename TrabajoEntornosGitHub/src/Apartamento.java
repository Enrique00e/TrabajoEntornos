
/**
 * Esta clase hereda de Alojamiento, para crear un apartamento.
 * @author Enrique, Víctor T., Víctor N.
 *
 */
public class Apartamento extends Alojamiento{

	private int gastosComunidad;
	
	
	/**
	 * Constructor de apartamentos.
	 * @param codigo. Este parámetro te permitirá identificar el código del alojamiento.
	 * @param numPlazas. Este parámetro indicará el número de plazas del alojamiento.
	 * @param gastosComunidad. Este parámetro indicará los gastos de comunidad del apartamento.
	 */
	public Apartamento(String codigo, int numPlazas, int gastosComunidad) {
		super(codigo, numPlazas, 0);
		this.gastosComunidad = gastosComunidad;
	}
	
	// En los apartamentos se calcula el suplemento por día
	// dividiendo la cuota mensual de los gastos de comunidad por 30 y multiplicarla por el número de días que se han alquilado
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + (double)gastosComunidad*dias/30;
		
	}
	/**
	 * Escribe los datos del apartamento, con sus datos de alojamiento en la consola.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Gastos de comunidad:", gastosComunidad);
	}
}
