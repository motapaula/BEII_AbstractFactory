package uniesp.BEII.AbstractFactory.RestauranteJapones;

import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import java.util.Random;
import java.lang.String;

public class PratoPrincipalJapones implements PratoPrincipal {
    private static final String[] pratosPrincipaisJaponeses = {
            "Sushi",
            "Sashimi",
            "Ramen",
            "Udon",
            "Soba",
            "Tempura",
            "Tonkatsu",
            "Yakiniku",
            "Shabu-Shabu",
            "Curry Japonês"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(pratosPrincipaisJaponeses.length);
        String pratoPrincipalSelecionado = pratosPrincipaisJaponeses[indiceAleatorio];
        System.out.println("Servindo prato principal japonês: " + pratoPrincipalSelecionado);
    }
}
