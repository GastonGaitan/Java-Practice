package Guerrero;
public abstract class Personaje {
    private Integer id;
    private Integer fuerza;
    private Integer energia;
    private Integer vida;
    private String nombre;
    private String nik;
    
    public Personaje(Integer id, Integer fuerza, Integer energia, Integer vida, String nombre, String nik) {
        this.id = id;
        this.fuerza = fuerza;
        this.energia = energia;
        this.vida = vida;
        this.nombre = nombre;
        this.nik = nik;
    }

    public abstract void atacar(Personaje victima);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return "Personaje [id=" + id + ", fuerza=" + fuerza + ", energia=" + energia + ", vida=" + vida + ", nombre="
                + nombre + ", nik=" + nik + "]";
    }

    
}
