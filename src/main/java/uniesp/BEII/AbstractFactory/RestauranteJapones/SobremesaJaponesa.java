package uniesp.BEII.AbstractFactory.RestauranteJapones;

import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;
import java.util.Random;
import java.lang.String;

public class SobremesaJaponesa implements Sobremesa {
    private static final String[] sobremesasJaponesas = {
            "Mochi",
            "Dorayaki",
            "Taiyaki",
            "Anmitsu",
            "Matcha Ice Cream",
            "Warabi Mochi",
            "Mitarashi Dango",
            "Sakura Mochi",
            "Udon Soba",
            "Melon Pan"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(sobremesasJaponesas.length);
        String sobremesaSelecionada = sobremesasJaponesas[indiceAleatorio];
        System.out.println("Servindo sobremesa japonesa: " + sobremesaSelecionada);
    }
}
