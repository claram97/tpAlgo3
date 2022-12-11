package minerales;

public class FabricaDeMinerales {
	//Crea el Mineral especificado según el String recibido.
	public static Mineral crear(String tipoMineral) {
		Mineral mineral = null;
		if(tipoMineral == "Cobre") {
			mineral = new Cobre();
		}
		else if(tipoMineral == "Bronce") {
			mineral = new Bronce();
		}
		else if(tipoMineral == "Hierro") {
			mineral = new Hierro();
		}
		else if(tipoMineral == "Plata") {
			mineral = new Plata();
		}
		else if(tipoMineral == "Oro") {
			mineral = new Oro();
		}
		else if(tipoMineral == "Diamante") {
			mineral = new Diamante();
		}

		return mineral;
	}
}