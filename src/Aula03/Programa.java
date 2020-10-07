package Aula03;

import Aula03.Entidade.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta("10007","2149",800,"rafa");


        Conta c2 = new Conta();
        c2.setTitular("Gabi");
        c2.deposita(500);
        c2.deposita(200);
        c2.saca(100);
        c2.transfere(c1,200);

        System.out.println("operacao tranferencia");

        System.out.println( "Saldo atualizado " + c2.getTitular()+ " saldo: " + c2.getSaldo() + " " + c1.getTitular() + " saldo: " + c1.getSaldo());













    }
}
