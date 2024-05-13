package uniesp.BEII.AbstractFactory.RestauranteItaliano;

import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import java.util.Random;
import java.lang.String;

public class PratoPrincipalItaliano implements PratoPrincipal {
    private static final String[] pratosPrincipaisItalianos = {
            "Spaghetti alla Carbonara",
            "Lasagna al Forno",
            "Risotto ai Funghi",
            "Ossobuco alla Milanese",
            "Pizza Margherita",
            "Bistecca alla Fiorentina",
            "Gnocchi al Pesto",
            "Ravioli al Ragu",
            "Saltimbocca alla Romana",
            "Pollo alla Cacciatora"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(pratosPrincipaisItalianos.length);
        String pratoPrincipalSelecionado = pratosPrincipaisItalianos[indiceAleatorio];
        System.out.println("Servindo prato principal italiano: " + pratoPrincipalSelecionado);
    }
}
