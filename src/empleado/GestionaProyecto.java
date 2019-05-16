package empleado;

import java.util.Scanner;

public class GestionaProyecto {

	public static void crearJugadores(Jugador[] j, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[4];


		for (int i = 0; i < j.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (35 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);
			numeros[3] = (int) (Math.random() * (100000 - 20000) + 20000);

			j[i] = new Jugador(nombres[numeros[0]], numeros[1], sexo[numeros[2]], 1500, true); 
		}
	}

	public static void crearJuntaDirectiva(Directivo[] d, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[4];

		for (int i = 0; i < nombres.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (65 - 35) + 35);
			numeros[2] = (int) (Math.random() * 2);
			numeros[3] = (int) (Math.random() * (100000 - 20000) + 20000);

			d[i] = new Directivo(nombres[numeros[0]], numeros[1], sexo[numeros[2]], numeros[3], 20);
		}
	}

	public static void crearEquipoTecnico(Directivo[] d, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[3];

		for (int i = 0; i < nombres.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (65 - 36) + 36);
			numeros[2] = (int) (Math.random() * 2);

			d[i] = new Directivo(nombres[numeros[0]], numeros[1], sexo[numeros[2]], numeros[3], 20);
		}
	}

	public static void crearStaff(Directivo[] d, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[3];

		for (int i = 0; i < nombres.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (65 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);

			d[i] = new Directivo(nombres[numeros[0]], numeros[1], sexo[numeros[2]], 1500, 20);
		}
	}

	public static int eligeMenuPrincipal() {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al menu principal:");
		System.out.println("Estos son las fichas de perfiles que ofrecemos");
		System.out.println("1- Jugadores\n 2- Directivos\n 3- Tecnicos\n 4- Staff");
		do {
			try {				
				num = sc.nextInt();
			} catch (Exception e) {
				num = 0;
			}
			if(num < 1|| num > 4) {
				System.out.println("Por favor Señor/a introduce una opcion correcta");
			}
		} while (num < 1|| num > 4);


		return num;
	}

	public static void subMenuJugador(Jugador[] plantilla) {
		System.out.println("Estos son los jugadores que hay");
		for (int i = 0; i < plantilla.length; i++) {
			System.out.println((i+1) + " " + plantilla[i].nombre);
		}
	}

	public static void subMenuDirectivo(Directivo[] junta) {
		System.out.println("Estos son los jugadores que hay");
		for (int i = 0; i < junta.length; i++) {
			System.out.println((i+1) + " " + junta[i].nombre);
		}
	}
	
	public static void subMenuTecnico(Tecnico[] soporte) {
		System.out.println("Estos son los jugadores que hay");
		for (int i = 0; i < soporte.length; i++) {
			System.out.println((i+1) + " " + soporte[i].nombre);
		}
	}
	
	public static void subMenuStaff(Staff[] grupo) {
		System.out.println("Estos son los jugadores que hay");
		for (int i = 0; i < grupo.length; i++) {
			System.out.println((i+1) + " " + grupo[i].nombre);
		}
	}

	public static void main(String[] args) {
		String[] sexo = {"Hombre", "Mujer"};
		String[] nombre = {"Kasem", "Snong", "Günther", "Bamphen", "Vichai", "Paiboon", "Nit", "Wanchai"};
		Directivo[] directores = new Directivo[4];
		Tecnico[] entrenadores = new Tecnico[2];
		Jugador[] plantilla = new Jugador[11];
		Staff[] mantenimiento = new Staff[4];

		crearJugadores(plantilla, nombre, sexo);
		//		do {
		//			switch (menu) {
		//			case value:
		//				
		//				break;
		//
		//			default:
		//				break;
		//			}
		//		} while (true);

	}

}