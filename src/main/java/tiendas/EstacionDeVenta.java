package tiendas;

import jugador.Jugador;
import jugador.Posicion;
import terreno.Entidad;
import terreno.TipoEntidad;

public class EstacionDeVenta extends Entidad {
	public Posicion posicion;
	private static final char LETRA = '/';
	private static final TipoEntidad TIPO = TipoEntidad.TIENDA;

	public EstacionDeVenta(Posicion pos) {
		super(pos, TIPO, LETRA);
		this.posicion = pos;
	}
	
	//Permite que la Tienda interactúe con el Jugador dado.
	public void interactuar(Jugador jugador) {
		if(VistaTiendasConsola.venta()) {
			vender(jugador);
		}
	}
	
	//Devuelve la letra de la Tienda actual.
	public char getLetra() {
		return EstacionDeVenta.LETRA;
	}
		
	//Devuelve la posición de la Tienda.
	public Posicion getPosicion() {
		return this.posicion;
	}
	
	//Devuelve el tipo de entidad.
	public TipoEntidad getTipoEntidad() {
		return TipoEntidad.TIENDA;
	}

	//Permite vender los minerales al Jugador dado.
	public void vender(Jugador jugador) {
		jugador.venderMinerales();
	}
	
}
