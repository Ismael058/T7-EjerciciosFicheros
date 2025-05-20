import java.util.LinkedList;

public class GanadorApp {

	public static void main(String[] args) {

		Jugador j1 = new Jugador (1,"Paco");
		Jugador j2 = new Jugador (2,"Pedro");
		Jugador j3 = new Jugador (3,"Juan");
		
		LinkedList<Object> ListaJugadores = new LinkedList<>();
		
		// añadimos los objetos jugador de esta forma 
		// ya que estan de clarados
		for (Object j :ListaJugadores) {
		ListaJugadores.add(j);
		}
		
		LinkedList<Object> ListaJugadores2 = new LinkedList<>();
		
		// Y aqui los añadimos asi para ver las dos posibilidades 
		
		ListaJugadores2.add(j1);
		ListaJugadores2.add(j2);
		ListaJugadores2.add(j3);
		ListaJugadores2.add(new Jugador (4,"Sergio"));
		ListaJugadores2.add(new Jugador (5,"Carlos"));
		
		
		
	}

}
