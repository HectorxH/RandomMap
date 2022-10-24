package Tarea3;
import java.util.List;

public abstract class Nodo {
    // Constructor
    Nodo(Integer id, List<Nodo> lista){
        this.id = id;
        this.lista = lista;
    }
    
    // id del nodo 
    private Integer id;
    
    public Integer getid(){
        return id;
    }
    public void setid(Integer id){
        this.id = id;
    }

    // Lista de nodos
    private List<Nodo> lista;

    public List<Nodo> getlist(){
        return lista;
    }
    public void setlist(List<Nodo> list){
        this.lista = list;
    }
    
    public abstract void interactuar(Jugador player);

    public void agregarNodo(Nodo add){

    }
}
