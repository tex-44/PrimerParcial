package Lista;
import java.util.Scanner;
public class Main {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		Listas lista =new Listas();
		
		while (true) {
			System.out.println("OPCIONES:");
			System.out.println("1-Ingresar Elementos:");
			System.out.println("2-Buscar Elementos:");
			System.out.println("Ingrese una opción:");
			int opcion =scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1: 
				System.out.print("Ingrese el elemento a insertar: ");
				String elementoInicio = scanner.nextLine();
				lista.InsertarAlInicio(elementoInicio);
				break;
			case 2:
				System.out.print("Ingrese el elemento a buscar: ");
				String buscarElemento = scanner.nextLine();
				if (lista.buscar(buscarElemento)) {
					System.out.println("El elemento " + buscarElemento + " esta en la lista");
				}else {
					System.out.println("El elemento " + buscarElemento + " esta en la lista");
				}
				break;
				
			}
		}
		
	}
}
