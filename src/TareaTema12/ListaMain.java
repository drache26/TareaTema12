package TareaTema12;

import java.util.Scanner;

public class ListaMain {


		public static void main(String[] args) {
		
			int menu=0;
			Lista tabla = new Lista();
			Scanner sc = new Scanner(System.in);

			do {
				System.out.println("Men�");
				System.out.println("1) Cargar ");
				System.out.println("2) Mostrar toda la lista");
				System.out.println("3) Insertar una persona");
				System.out.println("4) Eliminar una persona");
				System.out.println("5) Mostrar el n�mero de personas en la lista");
				System.out.println("6) Buscar persona por DNI");
				System.out.println("7) Ordenar la lista seg�n el n�mero de DNI");
				System.out.println("0) Salir");
				menu = sc.nextInt();
				switch(menu) {
				case 1: tabla.cargar();
						break;
				case 2:	tabla.listar();
						break;
				case 3: tabla.insertar();
						break;
				case 4: tabla.eliminar();
						break;
				case 5: System.out.println("La cantidad de personas en la lista son: " + tabla.contar());
						break;
				case 6: tabla.buscar();
						break;
				case 7: tabla.ordenar();
						break;
				case 0:	System.out.println(" Muchas gracias por usar el programa, hasta la pr�xima");
						break;
				default:System.out.println("Por favor, introduzca una opci�n correcta");
						break;
				}
			
			}while(menu != 0);
			
			sc.close();
		}
		
	}