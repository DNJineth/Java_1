package ClaseFinal;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

            System.out.println("Ingrese primer numero");
            int num = sc.nextInt();
            System.out.println("Ingrese segundo numero");
            int num2 = sc.nextInt();

            var resultado = num / num2;

            log.info("El resultado de la divicion es: " +resultado );

        }catch (ArithmeticException e){
            log.warning("el arreglo esta sobredimencionado");
            System.out.println("El arreglo esta sobredimencionado");
        }
        catch (RuntimeException e){
            log.warning(e.getMessage());
        }finally {
            sc.close();
        }




    }
}