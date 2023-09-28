package Guerrero;
public class Arquero extends Personaje{

    private Arco arco;

    public Arquero(Integer id, Integer fuerza, Integer energia, Integer vida, String nombre, String nik) {
        super(id, fuerza, energia, vida, nombre, nik);
    }

    public Arquero(Integer id, Integer fuerza, Integer energia, Integer vida, String nombre, String nik, Arco arco) {
        super(id, fuerza, energia, vida, nombre, nik);
        this.arco = arco;
    }

    @Override
    public void atacar(Personaje victima) {
        victima.setVida(victima.getVida() - this.getFuerza()/3);
        this.setEnergia(this.getEnergia()-5);
        System.out.println(this.getNombre()+" acaba de masturbar a " + victima.getNombre());
    }

    public Arco getArco() {
        return arco;
    }

    public void setArco(Arco arco) {
        this.arco = arco;
    }

    @Override
    public String toString() {
        return "Arquero [arco=" + arco + "] " + super.toString();
    }
}
