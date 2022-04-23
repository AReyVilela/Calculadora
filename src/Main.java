import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lectura por teclado y inicializo variable de opcion de menu
        int opcion = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        do {

            //Imprimo lmenu por consola
            System.out.println("\n");
            System.out.println("*************************************************************");
            System.out.println("************BIENVENIDO A LA CALCULADORA**********************");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("0. Salir");
            System.out.print("Introduce una opción válida : ");

            //Leo la opcion elegida y transformo los caracteres a int
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion < 0 || opcion > 5) {
                System.out.println("OPCION NO VÁLIDA");
            } else if (opcion != 0) {
                System.out.println("\n");
                float operando1, operando2;

                System.out.print("Primer operando?: ");
                operando1 = Float.parseFloat(sc.nextLine());
                System.out.print("Segundo operando?: ");
                operando2 = Float.parseFloat(sc.nextLine());

                switch (opcion) { //posibles casos de la Calculadora
                    case 1: //suma
                        float suma = (operando1 + operando2);
                        System.out.println("Suma es : " + suma);
                        break;
                    case 2: //resta
                        float resta = operando1 - operando2;
                        System.out.println("Resta es: " + resta);
                        break;
                    case 3: //multi
                        float multi = operando1 * operando2;
                        System.out.println("Multiplicacion es : " + multi);
                        break;
                    case 4: //dividir
                        float division = operando1 / operando2;
                        System.out.println("Division sin resto es : " + division);
                        break;
                    case 5: //resto
                        float resto = operando1 % operando2;
                        System.out.println("Resto de la division es : " + resto);
                        break;
                }
            }
        } while (opcion != 0);
        //Cierro la lectura de teclado y muestro mensaje
        sc.close();
        System.out.println("Finaliza la calculadora.");
    }
}