
/**
 * Esta clase hereda de Alojamiento, para crear un apartamento.
 * @author Enrique, V�ctor T., V�ctor N.
 *
 */
public class Apartamento extends Alojamiento{

	private int gastosComunidad;
	
	
	/**
	 * Constructor de apartamentos.
	 * @param codigo. Este par�metro te permitir� identificar el c�digo del alojamiento.
	 * @param numPlazas. Este par�metro indicar� el n�mero de plazas del alojamiento.
	 * @param gastosComunidad. Este par�metro indicar� los gastos de comunidad del apartamento.
	 */
	public Apartamento(String codigo, int numPlazas, int gastosComunidad) {
		super(codigo, numPlazas, 0);
		this.gastosComunidad = gastosComunidad;
	}
	
	// En los apartamentos se calcula el suplemento por d�a
	// dividiendo la cuota mensual de los gastos de comunidad por 30 y multiplicarla por el n�mero de d�as que se han alquilado
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
