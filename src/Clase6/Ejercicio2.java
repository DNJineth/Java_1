package Clase6;
import java.util.Scanner;
public class Ejercicio2 {
 public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
     int opcion;
     do {
         System.out.println("\n EJERCICIOS  ");
         System.out.println("1. Determinar si un numero es positivo, negativo o cero");
         System.out.println("2. Comparar dos numeros y determinar cual es el mayor o si son iguales ");
         System.out.println("3. Determinar cual  es el año bisiesto");
         System.out.println("4. Calculadora ");
         System.out.println("5. Salir");
         System.out.println("Elige una opcion");
         opcion = scanner.nextInt();

         switch (opcion){
             case 1:
                 System.out.print("Ingresa un número: ");
                 int numero = scanner.nextInt();
                 if (numero > 0) {
                     System.out.println("El número es positivo.");
                 } else if (numero < 0) {
                     System.out.println("El número es negativo.");
                 } else {
                     System.out.println("El número es cero.");
                 }
                 break;

             case 2:
                 System.out.print("Ingresa el primer número: ");
                 int num1 = scanner.nextInt();
                 System.out.print("Ingresa el segundo número: ");
                 int num2 = scanner.nextInt();

                 if (num1 > num2) {
                     System.out.println("El numero "+ num1 + " es mayor que " + num2);
                 } else if (num1 < num2) {
                     System.out.println("El numero " + num2 + " es mayor que " + num1);
                 } else {
                     System.out.println("Ambos números son iguales.");
                 }
                 break;

             case 3:
                 System.out.print("Ingresa un año: ");
                 int año = scanner.nextInt();
                 if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                     System.out.println("El año es bisiesto.");
                 } else {
                     System.out.println("El año no es bisiesto.");
                 }
                 break;

             case 4:
                 System.out.print("Ingresa el primer número: ");
                 double n1 = scanner.nextDouble();
                 System.out.print("Ingresa el segundo número: ");
                 double n2 = scanner.nextDouble();
                 System.out.print("Ingresa el operador (+, -, *, /): ");
                 char operador = scanner.next().charAt(0);

                 switch (operador) {
                     case '+':
                         System.out.println("Resultado: " + (n1 + n2));
                         break;
                     case '-':
                         System.out.println("Resultado: " + (n1 - n2));
                         break;
                     case '*':
                         System.out.println("Resultado: " + (n1 * n2));
                         break;
                     case '/':
                         if (n2 != 0) {
                             System.out.println("Resultado: " + (n1 / n2));
                         } else {
                             System.out.println("Error: No se puede dividir por cero.");
                         }
                         break;
                     default:
                         System.out.println("Operador no válido.");
                 }
                 break;

             case 5:
                 System.out.println("Gracias por realizar los ejericios");
                 break;

             default:
                 System.out.println("Opción no válida. Intenta de nuevo.");
                 break;
         }
     } while (opcion!=5);
     scanner.close();
 }
}
