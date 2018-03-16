package TareaTema12;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class Lista {

		private ArrayList<Persona> persona = new ArrayList<Persona>();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		//Constructores
		

		//Métodos
		public void cargar() {
			persona.add(new Persona("Adrián", "García Santos", "11111111A", 23,	"C/ Los Olivos", 3,	38493, "Santa Cruz de Tenerife"));
			persona.add(new Persona("Ana", "Méndez Núñez", "22222222B", 22, "C/ Los Pinos", 25, 38403, "Santa Cruz de Tenerife"));
			persona.add(new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceces", 23, 38505, "Las Palmas"));
			persona.add(new Persona("Julio", "Brito González",	"44444444D", 30, "C/ Los Pinos", 25, 38403, "Las Palmas"));
		}
		
		public void listar() {
			for (Persona lista: persona)
				System.out.print(lista + "\n");
		}
		
		public void insertar() {		
			System.out.println("Introduzca el nombre por favor:");
			String nombre = sc1.nextLine();
			System.out.println("Introduzca los apellidos por favor:");
			String apellidos = sc1.nextLine();
			System.out.println("Introduzca el DNI por favor:");
			String dni = sc1.nextLine();
			System.out.println("Introduzca la edad por favor:");
			int edad = sc2.nextInt();
			System.out.println("Introduzca el nombre de la calle por favor:");
			String calle = sc1.nextLine();
			System.out.println("Introduzca el número de la casa por favor:");
			int numero = sc2.nextInt();
			System.out.println("Introduzca el código postal por favor:");
			int cp = sc2.nextInt();
			System.out.println("Introduzca la provincia por favor:");
			String provincia = sc1.nextLine();
			persona.add(new Persona(nombre, apellidos, dni, edad, calle, numero, cp, provincia));
		}
		
		
		public void eliminar() {
			System.out.println("Introduzca el dni de la persona a eliminar:");
			String dni = sc1.nextLine();
			int eliminar = buscar(dni);
			if (eliminar != -1)
				persona.remove(eliminar);
		}

		public int contar() {
			 return persona.size();
		}
		
		
		public void buscar() {
			System.out.println("Introduzca el dni de la persona a buscar:");
			String dni = sc1.nextLine();
			int buscar=0;
			for(Persona lista : persona) {
					if(dni.equals(lista.getDni())) {
						System.out.println(lista);
						buscar=1;
					}
			}
					if(buscar == 0)
						System.out.println("El número de dni que ha introducido no se encuentra en la lista");
		}
		
		public int buscar(String dni) {
			for(Persona lista : persona)
				if(dni.equals(lista.getDni()))
					return persona.indexOf(lista);
			return -1;
		}

		public void ordenar() {
			Collections.sort(persona);
		}
	}

