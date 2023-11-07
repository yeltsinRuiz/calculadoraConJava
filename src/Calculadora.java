public class Calculadora {
    public static void main(String[] args) {
        while (true) {
            try{
                Menu.menu();
                switch (Menu.opcion()) {
                    case 1 -> {
                        float n1 = Menu.num();
                        float n2 = Menu.num();
                        System.out.println("La suma es: " + Calculo.suma(n1, n2));
                    }
                    case 2 -> {
                        float n3 = Menu.num();
                        float n4 = Menu.num();
                        System.out.println("La resta es: " + Calculo.resta(n3, n4));
                    }
                    case 3 -> {
                        float n5 = Menu.num();
                        float n6 = Menu.num();
                        System.out.println("La multiplicacion es: " + Calculo.multiplicacion(n5, n6));
                    }
                    case 4 -> {
                        float n7 = Menu.num();
                        float n8 = Menu.num();
                        System.out.println("La division es: " + Calculo.division(n7, n8));
                    }
                    case 5 -> {
                        System.out.println(" hasta pronto ");
                        System.exit(1);
                    }
                    default -> System.out.println(" Numero invalido ");
                }
            }
            catch (Exception e){
                System.out.println("Solo numeros " + e.getMessage());
            }

        }
    }
}
