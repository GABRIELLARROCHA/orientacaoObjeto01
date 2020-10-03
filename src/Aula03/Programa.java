package Aula03;

import Aula03.Entidade.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta("10007","2149",800,"gabi");


        Conta c2 = new Conta();
        c2.setTitular("Gabi");
        c2.deposita(500);
        c2.deposita(200);
        c2.saca(100);









    }
}
