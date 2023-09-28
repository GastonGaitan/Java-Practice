package Guerrero;
public class Arco {

    private Integer fuerza;
    private Integer velocidad;

    public Arco(Integer fuerza, Integer velocidad) {
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }
    
    public Integer getFuerza() {
        return fuerza;
    }
    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }
    public Integer getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
    @Override
    public String toString() {
        return "Arco [fuerza=" + fuerza + ", velocidad=" + velocidad + "]";
    }


}
