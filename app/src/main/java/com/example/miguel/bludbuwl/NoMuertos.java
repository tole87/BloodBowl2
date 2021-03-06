package com.example.miguel.bludbuwl;

import java.util.Arrays;
import java.util.HashSet;

public class NoMuertos extends Equipo {

    public NoMuertos() {
        this.ficha = R.drawable.no_muertos_equipo;
        this.icono = R.drawable.no_muertos_logo;
        this.nombre = R.string.no_muertos_nombre;
    }

    @Override
    public HashSet<Jugador> getJugadores() {
        if (jugadores.isEmpty()) {
            //Aqui instancio jugadores
            jugadores.add(new Jugador("Esqueletos", 40000, 5, 3, 2, 7, new HashSet<>(Arrays.asList(Habilidad.CABEZADURA.getNombre(), Habilidad.REGENERACION.getNombre()))));
            jugadores.add(new Jugador("Zombis", 40000, 4, 3, 2, 8, new HashSet<>(Arrays.asList(Habilidad.REGENERACION.getNombre()))));
            jugadores.add(new Jugador("Necrofagos", 70000, 7, 3, 3, 7, new HashSet<>(Arrays.asList(Habilidad.ESQUIVAR.getNombre()))));
            jugadores.add(new Jugador("Tumularios", 90000, 6, 3, 3, 8, new HashSet<>(Arrays.asList(Habilidad.PLACAR.getNombre(), Habilidad.REGENERACION.getNombre()))));
            jugadores.add(new Jugador("Hombres Lobo Nigrománticos", 120000, 3, 5, 1, 9, new HashSet<>(Arrays.asList(Habilidad.GOLPEMORTIFERO.getNombre(), Habilidad.REGENERACION.getNombre()))));

        }
        return jugadores;
    }
}
