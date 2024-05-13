package uniesp.BEII.AbstractFactory.Interfaces;

public interface RestauranteFactory {
    Entrada criarEntrada();
    PratoPrincipal criarPratoPrincipal();
    Sobremesa criarSobremesa();
}
