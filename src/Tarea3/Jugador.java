package Tarea3;
import java.util.List;

public class Jugador extends Personaje {

    Jugador(String nombre, Integer dinero, Integer hp_actual, Integer hp_total, Integer danio, Integer defensa) {
        super(nombre, dinero, hp_actual, hp_total, danio, defensa);
    }
    
    
    private List<Item> listaitem;

    public List<Item> getlistaitem(){
        return listaitem;
    }
    public void setlistaitem(List<Item> list){
        this.listaitem = list;
    }

    public void verEstado(){

    }
    
    public void verItems(){

    }

}
