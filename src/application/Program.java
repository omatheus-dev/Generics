package application;

import entitites.Carro;
import entitites.CarroCivic;
import entitites.CarroFox;
import entitites.CarroPalio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Carro> list = new ArrayList<>();

        System.out.print("Quantos carros serão registrados? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Digite os dados do " + i + "° carro");
            System.out.print("Modelo do carro (civic/palio/fox)? ");
            String carro = sc.next();
            System.out.print("Cor: ");
            String cor = sc.next();
            System.out.print("Ano do carro: ");
            int anoDoCarro = sc.nextInt();
            System.out.print("Potência: ");
            int potencia = sc.nextInt();
            if(Objects.equals(carro, "civic")) {
                Carro civic = new CarroCivic( cor, anoDoCarro, potencia, carro);
                list.add(civic);
            } else if (Objects.equals(carro, "palio")) {
                Carro palio = new CarroPalio( cor, anoDoCarro, potencia, carro);
                list.add(palio);
            } else {
                Carro fox = new CarroFox( cor, anoDoCarro, potencia, carro);
                list.add(fox);
            }
        }

        System.out.println();
        System.out.println("Dados de todos os carros:");
        for(Carro c : list) {
            System.out.println(c);
        }
    }
}
