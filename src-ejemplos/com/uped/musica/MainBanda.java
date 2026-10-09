package com.uped.musica;
import com.uped.musica.modelo.*;

public class MainBanda {
    public static void main(String[] args) {
        Instrumento i = new Guitarra();

        System.out.println(i.tipo);
        System.out.println(Instrumento.identificar());
        i.mostrarTipo();
        i.tocar();

        System.out.println("--- banda completa ---");

        Instrumento[] banda = {
                new Guitarra(),
                new Piano(),
                new Bateria()
        };

        for (Instrumento instrumento : banda) {
            instrumento.tocar();
        }
    }
}