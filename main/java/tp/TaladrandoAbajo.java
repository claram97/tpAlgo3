package tp;

import java.util.ArrayList;

import jugador.Accion;
import jugador.Interacciones;
import jugador.Jugador;

public class TaladrandoAbajo implements Estado {
	private double ticks;

	public TaladrandoAbajo() {
		this.ticks = 0;
//		pj.setX((int)pj.getX());
//		pj.setY((int)pj.getY());
	}

	@Override
	public Estado update(ArrayList<Accion> acciones, Jugador pj, Interacciones interacciones) {
		pj.setY(pj.getY() + ((0.1 * 10) / Juego.MAX_TICKS));
		pj.setTipoAnimacion(1);
		
		ticks += 1;
		if(ticks > Juego.MAX_TICKS) {
				if(interacciones.chequearBloques()) {
					pj.setVelX(0);
					pj.setVelY(0);				
				}
				return new Inicial();
		}
		return null;
	}

}
