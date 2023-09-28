package Guerrero;
public class Espadachin extends Personaje{

    private Espada espada;

    public Espadachin(Integer id, Integer fuerza, Integer energia, Integer vida, String nombre, String nik) {
        super(id, fuerza, energia, vida, nombre, nik);
    }

    public Espadachin(Integer id, Integer fuerza, Integer energia, Integer vida, String nombre, String nik, Espada espada) {
        super(id, fuerza, energia, vida, nombre, nik);
        this.espada = espada;
        this.setFuerza(this.getFuerza() + this.espada.getFilo());
    }

    @Override
    public void atacar(Personaje victima) {
        victima.setVida(getVida() - this.getFuerza()/2);
        this.setEnergia(getEnergia()-10);
        System.out.println(getNombre() + " acaba de darle un cucuruchazo a " + victima.getNombre() + " con la espada de " + this.espada.getMaterial());
    }
    
    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Espada getEspada() {
        return espada;
    }

    @Override
    public String toString() {
        return "Espadachin [espada=" + espada + "] + " + super.toString();
    }
    
}
