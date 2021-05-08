import java.util.ArrayList;
/**
 * Esta clase gestiona los alojamientos y las clases que heredan de ella.
 * @author Enrique, V�ctor T., V�ctor N.
 *
 */
public class GestionAlojamientos {
	
	/**
	 * M�todo principal que gestiona los alojamientos.
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Alojamiento> alojamientos = new ArrayList<>();
		Alojamiento alojamiento;
		crearAlojamientos(alojamientos);

		mostrarAlojamientos(alojamientos);
		System.out.println();
		alojamiento = new Caravana("car01", 4, 2, 750);
		AltaAlojamiento(alojamientos, alojamiento);
		System.out.println();
		alojamiento = new Caravana("car05", 7, 2, 1250);
		AltaAlojamiento(alojamientos, alojamiento);
		mostrarAlojamientos(alojamientos);

		calculaPrecioAlquiler(alojamientos);
		mostrarPreciosDeTodos(alojamientos);
	}//main
	
	/**
	 * Este m�todo te permitir� crear los diferentes tipos de alojamientos.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 */
	public static void crearAlojamientos(ArrayList<Alojamiento> alojamientos) {
		alojamientos.add(new Caravana("car01", 4, 2, 750));		
		alojamientos.add(new Bungalow("bung01", 4, 3, 12));
		alojamientos.add(new Bungalow("bung02", 2, 3, 8));
		alojamientos.add(new Caravana("car02", 6, 2, 850));
		alojamientos.add(new Apartamento("apart01", 4, 130));
		alojamientos.add(new Apartamento("apart02", 6, 140));
		alojamientos.add(new Bungalow("bung03", 6, 3, 15));
		alojamientos.add(new Bungalow("bung04", 8, 3, 20));
		alojamientos.add(new Apartamento("apart03", 5, 135));
		alojamientos.add(new Apartamento("apart04", 8, 170));
		alojamientos.add(new Caravana("car03", 4, 2, 750));
		alojamientos.add(new Caravana("car04", 3, 2, 750));
	}//crearAlojamientos

	/**
	 * Este m�todo muestra los alojamientos introducidos en la colecci�n.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 */
	public static void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
		System.out.println("Listado de los datos de los alojamientos");
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i));
		}

	}//mostrarAlojamientos
	
	/**
	 * Este m�todo te pemitir� dar de alta los diferentes tipos de alojamientos.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 * @param alojamiento. Este par�metro recibe el valor del alojamiento para darlo de alta.
	 */
	public static void AltaAlojamiento(ArrayList<Alojamiento> alojamientos, Alojamiento alojamiento) {
		int posicion = buscar(alojamientos,alojamiento);

		if(posicion == -1) {
			alojamientos.add(alojamiento);
		}else {
			System.out.println("Alojamiento con c�digo repetido. No se puede a�adir");
		}


	}//AltaAlojamiento
	
	/**
	 * Este m�todo busca en la colecci�n dependiendo del c�digo de alojamiento.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 * @param alojamiento. Este par�metro recibe el valor del alojamiento a buscar.
	 * @return. Devuelve la posici�n en la colecci�n del alojamiento y si no se encuentra, devuelve -1 y finaliza.
	 */
	public static int buscar(ArrayList<Alojamiento> alojamientos,Alojamiento alojamiento) {
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(alojamiento.getCodigo())) {
				return i;
			}
		}
		return -1;
	}//buscar

	/**
	 * Este m�todo te permitir� calcular el precio del alquiler de los diferentes alojamientos de la colecci�n.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 */
	public static void calculaPrecioAlquiler(ArrayList<Alojamiento> alojamientos) {
		// Los datos de entrada ser�n el c�digo del alojamiento y
		// el n�mero de d�as que ha durado el alquiler
		String codigo;
		int dias, posAlojamiento;
		codigo = Leer.pedirCadena("Codigo del alojamiento:");
		posAlojamiento = -1;
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(codigo)) {
				posAlojamiento = i;
			}
		}
		if(posAlojamiento != -1) {
			do {
				dias = Leer.pedirEntero("Dias de alquiler:");
			}while(dias < 0);
			System.out.println(codigo + " --> " + alojamientos.get(posAlojamiento).precioAPagar(dias));
		}
	}//calculaPrecioAlquiler

	/**
	 * Este m�todo te permitir� mostrar el precio del alquiler de los diferentes alojamientos de la colecci�n.
	 * @param alojamientos. Este par�metro implementa la colecci�n de los alojamientos.
	 */
	public static void mostrarPreciosDeTodos(ArrayList<Alojamiento> alojamientos) {
//		 Se da como dato de entrada un n�mero de d�as de alquiler y 
//		 se obtiene un listado con los datos de cada alojamiento y lo que costar�a su alquiler 
//		 para el n�mero de d�as indicado
		int dias;
		do {
			dias = Leer.pedirEntero("Dias de alquiler:");
		}while(dias < 0);
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i).getCodigo() + " --> " + alojamientos.get(i).precioAPagar(dias));
		}
	}//mostrarPreciosDeTodos
}
