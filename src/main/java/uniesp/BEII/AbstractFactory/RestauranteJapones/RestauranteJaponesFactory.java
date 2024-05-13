package uniesp.BEII.AbstractFactory.RestauranteJapones;

import uniesp.BEII.AbstractFactory.Interfaces.Entrada;
import uniesp.BEII.AbstractFactory.Interfaces.PratoPrincipal;
import uniesp.BEII.AbstractFactory.Interfaces.RestauranteFactory;
import uniesp.BEII.AbstractFactory.Interfaces.Sobremesa;

public class RestauranteJaponesFactory implements RestauranteFactory {
    @Override
    public Entrada criarEntrada() {
        return new EntradaJaponesa();
    }

    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new PratoPrincipalJapones();
    }

    @Override
    public Sobremesa criarSobremesa() {
        return new SobremesaJaponesa();
    }
}
