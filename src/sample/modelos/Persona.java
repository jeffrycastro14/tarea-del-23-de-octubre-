package sample.modelos;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    public String nombre;
    public int edad;
    public String apellido;

    private static Persona[] listapersonas={
            new Persona("Jeffry","Castro",21),
            new Persona("Tulio", "Garcia", 21),
            new Persona("Oscar", "Diaz", 23),
            new Persona("Allaster", "Aragon", 24),
            new Persona("Yarince", "Padilla", 21),
            new Persona("Felix", "Peralta", 22),

    };


    public Persona(String nombre,String apellido, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }



    public static Persona buscarPorPosicion(int posicion) {
        if (posicion < listapersonas.length) {
            return listapersonas[posicion];
        }
        return null;
    }

    public static Persona buscarPorNombre(String nombre) {
        String nombr= "(?i)";
        for (int a = 0; a < listapersonas.length; a++) {
            if (listapersonas[a].nombre.startsWith(nombre)) {



return  listapersonas[a];
            }







        }
        return null;
    }

    public static Persona getPersona() {
        if (listapersonas.length > 0) {
            for (int d = 0; d < listapersonas.length; d++) {
                return listapersonas[d];
            }
        }
        return null;
    }


}
