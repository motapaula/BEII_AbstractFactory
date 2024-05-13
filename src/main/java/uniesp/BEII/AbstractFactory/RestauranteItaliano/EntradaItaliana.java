package uniesp.BEII.AbstractFactory.RestauranteItaliano;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import java.util.Random;
import java.lang.String;

public class EntradaItaliana implements Entrada {
    private static final String[] entradasItalianas = {
            "Carpaccio de Salmão com Rúcula e Parmesão",
            "Bruschetta Mista",
            "Vitello Tonnato",
            "Insalata Caprese",
            "Melanzane alla Parmigiana",
            "Supplì",
            "Carciofi alla Romana",
            "Polenta Fritta",
            "Prosciutto e Melone",
            "Focaccia"
    };

    @Override
    public void servir() {
        Random geradorAleatorio = new Random();
        int indiceAleatorio = geradorAleatorio.nextInt(entradasItalianas.length);
        String entradaSelecionada = entradasItalianas[indiceAleatorio];
        System.out.println("Servindo entrada italiana: " + entradaSelecionada);
    }
}
