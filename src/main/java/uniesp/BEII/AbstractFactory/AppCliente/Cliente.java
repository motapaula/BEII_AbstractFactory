package uniesp.BEII.AbstractFactory.AppCliente;

import uniesp.BEII.AbstractFactory.Interfaces.*;
import uniesp.BEII.AbstractFactory.RestauranteItaliano.*;
import uniesp.BEII.AbstractFactory.RestauranteJapones.*;
import uniesp.BEII.AbstractFactory.RestauranteBrasileiro.*;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolha o tipo de restaurante desejado
        RestauranteFactory fabricaItaliana = new RestauranteItalianoFactory();
        RestauranteFactory fabricaJaponesa = new RestauranteJaponesFactory();
        RestauranteFactory fabricaBrasileira = new RestauranteBrasileiroFactory();

        //Mostre as opções de restaurantes
        System.out.println("\nSelecione o restaurante desejado:");
        System.out.println("1. Italiano");
        System.out.println("2. Japonês");
        System.out.println("3. Brasileiro");

        //Recebendo a escolha do cliente
        int escolhaCliente = scanner.nextInt();

        // Servindo os pratos de acordo com a escolha do cliente
        RestauranteFactory fabricaEscolhida;
        if (escolhaCliente == 1) {
            fabricaEscolhida = fabricaItaliana;
        } else if (escolhaCliente == 2) {
            fabricaEscolhida = fabricaJaponesa;
        } else if (escolhaCliente == 3) {
            fabricaEscolhida = fabricaBrasileira;
        } else {
            System.out.println("Opção inválida. Selecione um número entre 1 e 3.");
            return;
        }

        Entrada entrada = fabricaEscolhida.criarEntrada();
        PratoPrincipal pratoPrincipal = fabricaEscolhida.criarPratoPrincipal();
        Sobremesa sobremesa = fabricaEscolhida.criarSobremesa();

        // Servindo os pratos
        entrada.servir();
        pratoPrincipal.servir();
        sobremesa.servir();
    }
}



//        // Crie os pratos usando a fábrica escolhida
////        System.out.println("**Restaurante Italiano**");
////        Entrada entrada = fabricaItaliana.criarEntrada();
////        PratoPrincipal pratoPrincipal = fabricaItaliana.criarPratoPrincipal();
////        Sobremesa sobremesa = fabricaItaliana.criarSobremesa();
//
//       System.out.println("\n**Restaurante Japonês**");
//       Entrada entrada = fabricaJaponesa.criarEntrada();
//       PratoPrincipal pratoPrincipal = fabricaJaponesa.criarPratoPrincipal();
//       Sobremesa sobremesa = fabricaJaponesa.criarSobremesa();
//
////        System.out.println("\n**Restaurante Brasileiro**");
////        Entrada entrada = fabricaBrasileira.criarEntrada();
////        PratoPrincipal pratoPrincipal = fabricaBrasileira.criarPratoPrincipal();
////        Sobremesa sobremesa = fabricaBrasileira.criarSobremesa();
//
//
//        // Sirva os pratos
//        entrada.servir();
//        pratoPrincipal.servir();
//        sobremesa.servir();
//    }
