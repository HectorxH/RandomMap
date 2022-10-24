package Tarea3;

public class Personaje {
    
    //Constructor
    Personaje(String nombre, Integer dinero, Integer hp_actual,Integer hp_total,Integer danio,Integer defensa){
        this.nombre = nombre;
        this.dinero = dinero;
        this.hp_actual = hp_actual;
        this.hp_total = hp_total;
        this.danio = danio;
        this.defensa = defensa;

    }
    
    // "Parametros"
    private String nombre;
    private Integer dinero;
    private Integer hp_actual;
    private Integer hp_total;
    private Integer danio;
    private Integer defensa;

    //Setters y Geters
    // Nombre
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    // dinero
    public Integer getdinero(){
        return dinero;
    }
    public void setdinero(Integer dinero){
        this.dinero = dinero;
    }

    // hp_actual
    public Integer gethpacutal(){
        return hp_actual;
    }
    public void sethpactual(Integer hp_actual){
        this.hp_actual = hp_actual;
    }

    //hp_total
    public Integer gethptotal(){
        return hp_total;
    }
    public void sethptotal(Integer hp_total){
        this.hp_total = hp_total;
    }

    // danio
    public Integer getdanio(){
        return danio;
    }
    public void setdanio(Integer danio){
        this.danio = danio;
    }

    // defensa
    public Integer getdefensa(){
        return defensa;
    }
    public void setdefensa(Integer defensa){
        this.defensa = defensa;
    }

    public void combate(Personaje player){

    }
}   

    
