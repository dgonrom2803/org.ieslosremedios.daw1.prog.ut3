package EXAMEN;

public class Persona {
    private String nombre;
    private String dni;

    private Integer edad;

    private Boolean sexo;

    Persona () {

    }
    Persona (String nombre, String dni, Boolean sexo, Integer edad){
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(Integer edad) {

        this.edad = edad;
    }

    void saludar (){
        System.out.println();

    }
}
