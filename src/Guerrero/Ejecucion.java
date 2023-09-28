package Guerrero;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args){

        Espada espada = new Espada(10, "Manteca");
        Espadachin espadachin = new Espadachin(1, 100, 100, 100, "Tapia", "Macri", new Espada(33, "manteca"));
        espadachin.setEspada(espada);

        Espadachin espadachin2 = new Espadachin(2, 100, 100, 100, "espadachin 2", "Macri", new Espada(33, "caca"));

        //Espadachin espadachin3 = new Espadachin(3, 100, 100, 100, "Fede", "Macri", new Espada(33, "carne"));

        Arquero arquero = new Arquero(2, 10, 100, 100, "Tiraflecha", "Tiraflecha");
        arquero.setArco(new Arco(50, 100));

        //espadachin.atacar(arquero);

        System.out.println(espadachin.toString());
        System.out.println(arquero.toString());

        //espadachin3.atacar(espadachin);

        List <Espadachin> listaDeEspadachines = new ArrayList<>();
        //List <Arquero> listaDeArgArqueros = new ArrayList<>();

        String nombre;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Introduzca el nombre numero " + i);
            nombre = scanner.nextLine();
            listaDeEspadachines.add(new Espadachin(i, 100, 10*i, i*2, nombre, "Esp"));
        }
        scanner.close();
        listaDeEspadachines.add(espadachin);
        listaDeEspadachines.add(espadachin2);
        listaDeEspadachines.add(new Espadachin(4, 100, 1000, 100, "Don Omar", "Mancuqui", new Espada(10, "Carne")));

        for (Espadachin esp: listaDeEspadachines){
            System.out.println(esp.getNombre());
        }
        
    }
}
