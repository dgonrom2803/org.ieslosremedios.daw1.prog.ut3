package EXAMEN;

public class Entrenador extends Persona {

    private char licencia;
    private String email;

    public Double sueldo;

    Entrenador(){

    }
    Entrenador (char licencia, String email, Double sueldo){
        this.licencia = licencia;
        this.email = email;
        this.sueldo = sueldo;
    }
    public char getLicencia() {

        return licencia;
    }

    public void setLicencia(char licencia) {

        this.licencia = licencia;
    }
    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public Double getSueldo() {

        return sueldo;
    }

    public void setSueldo(Double sueldo) {

        this.sueldo = sueldo;
    }

    void pagarIncentivo (int a){
        sueldo = sueldo * a;
        System.out.println("El nuevo sueldo es : " + sueldo);
    }
    void pagarFiniquito (){
        sueldo = sueldo * 0;
    }
}
