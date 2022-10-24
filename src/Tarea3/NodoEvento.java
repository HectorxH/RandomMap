package Tarea3;

import java.util.List;

public class NodoEvento extends Nodo {

    NodoEvento(Integer id, List<Nodo> lista) {
        super(id, lista);
        
    }

    //atributos
    private String descripcion;
    private String alternativa1;
    private String alternativa2;
    private Item resultado1;
    private Item resultado2;
    
    //Getter Settter

    public String getdescripcion(){
        return descripcion;
    }
    public void setdescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getalternativa1(){
        return alternativa1;
    }
    public void setalternativa1(String alternativa1){
        this.alternativa1 = alternativa1;
    }

    public String getalternativa2(){
        return alternativa2;
    }
    public void setalternativa2(String alternativa2){
        this.alternativa2 = alternativa2;
    }

    public Item getresultado1(){
        return resultado1;
    }
    public void setresultado1(Item resultado1){
        this.resultado1 = resultado1;
    }

    public Item getresultado2(){
        return resultado2;
    }
    public void setresultado2(Item resultado2){
        this.resultado2 = resultado2;
    }
    

    public void interactuar(Jugador player) {
    }

}
