package Guerrero;
public class Espada {
    private Integer filo;
    private String material;
    
    public Espada(Integer filo, String material){
        this.filo = filo;
        this.material = material;
    }

    public Integer getFilo() {
        return filo;
    }

    public void setFilo(Integer filo) {
        this.filo = filo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Espada [filo=" + filo + ", material=" + material + "]";
    }
}
