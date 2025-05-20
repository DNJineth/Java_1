public class Estudiante {
    public Estudiante (String cc, String nombre, int edad, String telefono, String direccion){
     this.cc = cc;
     this.nombre = nombre;
     this.edad= edad;
     this.telefono= telefono;
     this.direccion= direccion;
    }
    private String cc;
    private String nombre;
    private  int edad;
    private String telefono;
    private String direccion;

    public  void setNombre(String nombre) {this.nombre = nombre; }
    public String getNombre() {
        return nombre;
    }
    public  void setEdad(int edad) {this.edad = edad;}
    public int getEdad() {
        return edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    public String toString(){
        return "Estudiante{"+
                "cc='" + cc + '\''+
                ", nombre='" + nombre + '\''+
                "edad=" + edad + '\''+
                "telefono=" + telefono + '\''+
                "direccion=" + direccion+ '\'' +
                 '}';

    }
}
