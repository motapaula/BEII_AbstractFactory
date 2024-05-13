package uniesp.BEII.AbstractFactory.RestauranteJapones;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import java.util.Random;
import java.lang.String;

public class EntradaJaponesa implements Entrada {
    private static final String[] entradasJaponesas = {
            "Edamame",
            "Gyoza",
            "Tempura",
            "Sashimi",
            "Yaki Tori",
            "Miso Soup",
            "Sunomono",
            "Chawanmushi",
            "Takoyaki",
            "Okonomiyaki"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(entradasJaponesas.length);
        String entradaSelecionada = entradasJaponesas[indiceAleatorio];
        System.out.println("Servindo entrada japonesa: " + entradaSelecionada);
    }
}
