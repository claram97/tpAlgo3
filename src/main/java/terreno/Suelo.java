package terreno;
import jugador.Posicion;

public class Suelo {
	private Bloque[][] bloques;
	private int alto;
	private int ancho;

	public Suelo(int alto, int ancho) {
		if(alto < 0 || ancho < 0) {
			return; //Excepcion.
		}
		this.alto = alto;
		this.ancho = ancho;
		this.bloques = FabricaDeSuelo.crear(alto, ancho);
	}
	
	//Devuelve el bloque de la posicion dada
	public Bloque getBloque(Posicion pos) {
		return(bloques[pos.getY()][pos.getX()]);
	}
	
	
	//Destruye el bloque de la posicion dada
	public void destruirBloque(Posicion pos) {
		bloques[pos.getY()][pos.getX()] = new Aire();
	}
	
	//Devuelve true si el casillero de la posicion dada está vacío y false en caso contrario.
	public boolean casilleroVacio(Posicion posicion) {
		if(posicion.getY() == this.alto - 1) {
			return false;
		}
		
		return(bloques[posicion.getY()][posicion.getX()] instanceof Aire);
	}

	public int getAlto() {
		return this.alto;
	}
}
