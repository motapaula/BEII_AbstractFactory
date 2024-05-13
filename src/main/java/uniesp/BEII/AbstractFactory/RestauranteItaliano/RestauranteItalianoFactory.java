package uniesp.BEII.AbstractFactory.RestauranteItaliano;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import uniesp.BEII.AbstractFactory.Interfaces.RestauranteFactory;
import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;

public class RestauranteItalianoFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaItaliana();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalItaliano();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaItaliana();
    }
}
