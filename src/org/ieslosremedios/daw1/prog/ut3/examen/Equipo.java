package EXAMEN;

import java.awt.*;

public class Equipo extends Persona{
    public String nombre;
    public Integer partidosGanados;
    public Integer partidosPerdidos;
    public Integer partidosEmpatados;
    public Integer calidad;

    Equipo() {
    }
    Equipo (String nombre, Integer partidosGanados, Integer partidosEmpatados, Integer partidosPerdidos, Integer calidad){
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.calidad = calidad;
    }


    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    public int getPartidosGanados() {

        return partidosGanados;
    }

    public void setPartidosGanados(Integer partidosGanados) {

        this.partidosGanados = partidosGanados;
    }
    public Integer getPartidosEmpatados() {

        return partidosEmpatados;
    }

    public void setPartidosEmpatados(Integer partidosEmpatados) {

        this.partidosEmpatados = partidosEmpatados;
    }
    public Integer getPartidosPerdidos() {

        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Integer partidosPerdidos) {

        this.partidosPerdidos = partidosPerdidos;
    }
    public Integer getCalidad() {

        return calidad;
    }

    private void setCalidad(Integer calidad) {

        this.calidad = calidad;
    }
    void actualizarCalidad (){
        while (calidad <= 100)
            calidad = partidosGanados * 2 + partidosEmpatados -partidosPerdidos;
        System.out.println("La calidad del equipo es: " + calidad);

        }

    }
}
