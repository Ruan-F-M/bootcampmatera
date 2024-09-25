package com.bootcamp.matera;

public abstract class Conta implements IChavePix {

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public static void imprimeTitulo() {
        System.out.println("Extrato de metodo estatico");
    }
    public abstract void imprimeExtrato();

    public Boolean isSaldoNegativo() {
        if (saldo > 0) {
            return true;
        }
        return false;
    }


}
