package Aula03.Entidade;

public class Conta {
    private String numero;
    private String agencia;
    private double saldo;
    private String titular;

    public Conta(){ // construtor default

    }

    // sobrecarga de construtor
    public Conta(String numero, String agencia, double saldo, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita (double saldo){
        this.saldo +=saldo; // contador acumulativo de saldo
    }

    public void saca (double saldo) {
        if (saldo <= this.saldo) {
            this.saldo -= saldo;

        }
    }
}
