import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println("""
                \tcalculadora
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Divicion
                5. Salir
                """);
    }

    public static int opcion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un opcion: ");
        int numero = sc.nextInt();
        return numero;
    }

    public static float num (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float numero = sc.nextFloat();
        return numero;
    }




}
