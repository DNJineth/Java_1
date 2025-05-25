public class Main {
   public static void main(String[] args) {
      Estudiante estudiante = new Estudiante(
       "123356892",
              " Gineth Noguera ",
              25,
              " 31524589 ",
              " Pasto "
      );
      System.out.println(estudiante.toString());
//Habilitar metodo para cambiar un dato en privado
      estudiante.setNombre(" Gineth Dayana ");
      System.out.println(estudiante.toString());
      System.out.println(estudiante.getNombre());

      estudiante.setEdad(27);
      System.out.println(estudiante.toString());

   }
}
