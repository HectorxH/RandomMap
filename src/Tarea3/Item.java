package Tarea3;

public class Item {
    //Constructor
    private Integer precio;
    private Integer recuperar_hp;
    private Integer aumentar_hptotal;
    private Integer aumentar_danio;
    private Integer aumentar_defensa;

    Item(Integer precio,Integer recuperar_hp,Integer aumentar_hptotal,Integer aumentar_danio, Integer aumentar_defensa){
        this.precio = precio;
        this.recuperar_hp = recuperar_hp;
        this.aumentar_hptotal = aumentar_hptotal;
        this.aumentar_danio = aumentar_danio;
        this.aumentar_defensa = aumentar_defensa;
    }

    // Setter Getter
    // precio 
    public Integer getprecio(){
        return precio;
    }
    public void setprecio(Integer precio){
        this.precio = precio;
    }

    // recuperar hp
    public Integer getrecuperarhp(){
        return recuperar_hp;
    }
    public void setrecuperarhp(Integer recuperar_hp){
        this.recuperar_hp = recuperar_hp;
    }

    //aumentar hp total
    public Integer getaumentarhp(){
        return aumentar_hptotal;
    }
    public void setaumentarhp(Integer aumentar_hptotal){
        this.aumentar_hptotal = aumentar_hptotal;
    }

    //aumentar danio
    public Integer getaumentardanio(){
        return aumentar_danio;
    }
    public void setaumentar_danio(Integer aumentar_danio){
        this.aumentar_danio = aumentar_danio;
    }

    //defensa ++
    public Integer getaumentardefensa(){
        return aumentar_defensa;
    }
    public void setaumentardefensa(Integer aumentar_defensa){
        this.aumentar_defensa = aumentar_defensa;
    }
    
    
    public void aplicar(Jugador player){
        
    }
}
