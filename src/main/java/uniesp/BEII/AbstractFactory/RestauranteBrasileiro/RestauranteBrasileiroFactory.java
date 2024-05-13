package uniesp.BEII.AbstractFactory.RestauranteBrasileiro;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import uniesp.BEII.AbstractFactory.Interfaces.RestauranteFactory;
import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;

public class RestauranteBrasileiroFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaBrasileira();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalBrasileiro();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaBrasileira();
    }
}
