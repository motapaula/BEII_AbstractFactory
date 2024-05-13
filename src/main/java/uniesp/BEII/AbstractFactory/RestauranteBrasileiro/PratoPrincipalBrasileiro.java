package uniesp.BEII.AbstractFactory.RestauranteBrasileiro;

import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import java.util.Random;
import java.lang.String;

public class PratoPrincipalBrasileiro implements PratoPrincipal {
    private static final String[] pratosBrasileiros = {
            "Feijoada Completa",
            "Moqueca de Peixe",
            "Vaca Atolada",
            "Baião de Dois",
            "Sertanejo de Carne de Sol",
            "Frango com Quiabo",
            "Strogonoff de Carne",
            "X-Tudo",
            "Cuscuz Nordestino com Carne de Sol",
            "Carne de Panela com Pirão"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(pratosBrasileiros.length);
        String pratoSelecionado = pratosBrasileiros[indiceAleatorio];
        System.out.println("Servindo prato principal brasileiro: " + pratoSelecionado);
    }
}
