public class Jugador {//java.io.Serializable{

	private int ident;
	private String nombre;
	private int puntuacion;
	
	public Jugador(int num, String nomb) {
		this.nombre=nomb;
		this.ident=num;
		this.puntuacion=0;
	}

	public int getIdent() {
		return ident;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void SumarPuntos(int puntos) {
		this.puntuacion = puntuacion + puntos;
	}
	
	
	@Override
	/*
	public boolean equals(Object per) throws IllegalArgumentException {
	
		if (per instanceof Jugador) {
			Jugador j2= (Jugador) per;
			
		}
		
	}
	*/
	public String toString() {
		return ("El jugador se llama: "+nombre+" tiene el numero: "+ident+" y su puntuacion es de: "+puntuacion);
	}
	
	
	
}
