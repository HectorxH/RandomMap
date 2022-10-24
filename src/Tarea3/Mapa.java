package Tarea3;

public class Mapa{
    //constructor
    private Integer profundidad;
    private NodoInicial nodo_inicial;
    private Nodo nodo_actual;

    //Constructor
    Mapa(Integer profundidad,NodoInicial nodo_inicial,Nodo nodo_actual){
        this.profundidad = profundidad;
        this.nodo_inicial = nodo_inicial;
        this.nodo_actual = nodo_actual; 
    }

    //Setter Getter
    //profundidad
    public Integer getprofundidad(){
        return profundidad;
    }
    public void setprofundidad(Integer profundidad){
        this.profundidad = profundidad;
    }
    
    //nodo inicial
    public NodoInicial getnodoinicial(){
        return nodo_inicial;
    }
    public void setnodoinicial(NodoInicial nodo_inicial){
        this.nodo_inicial = nodo_inicial;
    }

    //Nodo actual
    public Nodo getnodoactual(){
        return nodo_actual;
    }
    public void setnodoactual(Nodo nodo_actual){
        this.nodo_actual = nodo_actual;
    }

    public void verMapa(){

    }
    public void avanzar(){

    }


    
}
