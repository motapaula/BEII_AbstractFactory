package uniesp.BEII.AbstractFactory.RestauranteBrasileiro;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import java.util.Random;
import java.lang.String;

public class EntradaBrasileira implements Entrada {
    private static final String[] pratosBrasileiros = {
            "Pastel de Carne com Queijo",
            "Coxinha de Frango com Catupiry",
            "Pão de Queijo Recheado",
            "Acarajé",
            "Salpicão de Frango",
            "Tapioca com Queijo e Presunto",
            "Caldo Verde",
            "Pamonha",
            "Cuscuz Nordestino",
            "Feijão Tropeiro"
    };
    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(pratosBrasileiros.length);
        String pratoSelecionado = pratosBrasileiros[indiceAleatorio];
        System.out.println("Servindo entrada brasileira: " + pratoSelecionado);
    }
}
