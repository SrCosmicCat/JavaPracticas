package Eventos;

import Personajes.Jugador;

public class SiguienteSala extends Evento{
    private final String[] respuestas = {"Pasas a la siguiente sala...", "Caminas despacio pasando de sala...", "Apresuradamente pasas de sala...", "¿Eso fue todo? Pasas de sala...", "La siguiente sala está oscura, pero pasas igualmente...", "Pasas a la siguiente sala y te percatas de que un chostito te observa desde las sombras..."};

    public SiguienteSala() {
    }

    public SiguienteSala(int id, String descripcion, Jugador jugador) {
        super(id, descripcion, jugador);
    }
    
    @Override
    public String getRespuesta() {
        return respuestas[(int)(Math.random()*(respuestas.length))];
    }

    @Override
    public void activarEvento() {
        //El evento es pasar de sala
    }

}
