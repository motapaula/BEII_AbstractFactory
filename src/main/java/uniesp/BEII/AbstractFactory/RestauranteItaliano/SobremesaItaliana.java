package uniesp.BEII.AbstractFactory.RestauranteItaliano;

import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;
import java.util.Random;
import java.lang.String;
public class SobremesaItaliana implements Sobremesa {
    private static final String[] sobremesasItalianas = {
            "Tiramisu",
            "Panna Cotta",
            "Gelato",
            "Cannoli Siciliani",
            "Torta della Nonna",
            "Sfogliatella",
            "Zabaglione",
            "Biscotti al Mandorla",
            "Pannacotta al Caffè",
            "Crostata di Frutta"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(sobremesasItalianas.length);
        String sobremesaSelecionada = sobremesasItalianas[indiceAleatorio];
        System.out.println("Servindo sobremesa italiana: " + sobremesaSelecionada);
    }
}
