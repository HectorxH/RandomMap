package Tarea3;

import java.util.List;

public class NodoCombate extends Nodo {

    NodoCombate(Integer id, List<Nodo> lista) {
        super(id, lista);

    }
    
    

    private Personaje enemigo;
    public Personaje getenemigo(){
        return enemigo;
    }
    public void setprofundidad(Personaje enemigo){
        this.enemigo = enemigo;
    }

    public void interactuar(Jugador player) {
    }
}
