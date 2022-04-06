import java.util.Scanner;

interface InterfazDosNumeros {

	public void operacion();
}

public class MainLambdas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean terminado;
		System.out.println("OPERACIONES BÁSICAS USANDO FUNCIONES LAMBDAS");
		System.out.println("¿Que operación le gustaría llevar a cabo?");
		System.out.println("Elige una opción entre todas");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACIÓN");
		System.out.println("4. DIVISIÓN");
		System.out.println("5. POTENCIA");
		System.out.println("0. SALIR");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			InterfazDosNumeros iDN = () -> {
				System.out.println("Has elegido la operación: SUMA");
				int num1, num2, suma;
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce otro número: ");
				num2 = sc.nextInt();
				suma = num1 + num2;
				System.out.println("La suma de los números " + num1 + " y " + num2 + " es: " + suma);
			};

			iDN.operacion();
			break;
		case 2:
			iDN = () -> {
				System.out.println("Has elegido la operación: RESTA");
				int num1, num2, resta;
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce otro número: ");
				num2 = sc.nextInt();
				resta = num1 - num2;
				System.out.println("La resta de los números " + num1 + " y " + num2 + " es: " + resta);
			};

			iDN.operacion();
			break;
		case 3:
			iDN = () -> {
				System.out.println("Has elegido la operación MULTIPLICACIÓN");
				int num1, num2, mult;
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce otro número: ");
				num2 = sc.nextInt();
				mult = num1 * num2;
				System.out.println("La multiplicación de los números " + num1 + " y " + num2 + " es: " + mult);
			};

			iDN.operacion();
			break;
		case 4:
			iDN = () -> {
				System.out.println("Has elegido la operación DIVISIÓN");
				int num1, num2, div;
				System.out.print("Introduce un numero: ");
				num1 = sc.nextInt();
				System.out.print("Introduce otro número: ");
				num2 = sc.nextInt();
				div = num1 / num2;
				System.out.println("La división de los números " + num1 + " y " + num2 + " es: " + div);
			};

			iDN.operacion();
			break;
		case 5:
			iDN = () -> {
				System.out.println("Has elegido la operación POTENCIA");
				int num, potencia;
				System.out.print("Introduce un numero para aplicarle su potencia: ");
				num = sc.nextInt();
				potencia = num * num;
				System.out.println("La potencia del número " + num + " es: " + potencia);
			};

			iDN.operacion();
			break;
		default:
			System.out.println("Saliendo del programa...");
			break;
		}

	}
}
