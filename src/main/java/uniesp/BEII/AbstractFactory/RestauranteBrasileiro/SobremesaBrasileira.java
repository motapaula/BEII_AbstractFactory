package uniesp.BEII.AbstractFactory.RestauranteBrasileiro;

import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;
import java.util.Random;
import java.lang.String;

public class SobremesaBrasileira implements Sobremesa {
    private static final String[] sobremesasBrasileiras = {
            "Brigadeiro",
            "Beijinho",
            "Quindim",
            "Mousse de Maracujá",
            "Pudim de Leite",
            "Cocada com Abacaxi",
            "Queijo Coalho com Goiabada",
            "Açaí na Tigela",
            "Paçoca",
            "Doce de Abóbora com Coco"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(sobremesasBrasileiras.length);
        String sobremesaSelecionada = sobremesasBrasileiras[indiceAleatorio];
        System.out.println("Servindo sobremesa brasileira: " + sobremesaSelecionada);
    }

}
