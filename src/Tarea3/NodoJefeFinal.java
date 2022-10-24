package Tarea3;

import java.util.List;

public class NodoJefeFinal extends Nodo {

    NodoJefeFinal(Integer id, List<Nodo> lista) {
        super(id, lista);
        
    }
    
    private Personaje jefe;

    //Getter Setter
    public Personaje getjefe(){
        return jefe;
    }
    public void setjefe(Personaje jefe){
        this.jefe = jefe;
    }


    public void interactuar(Jugador player) {

    }
}
