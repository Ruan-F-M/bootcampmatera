package com.bootcamp.matera;

import java.util.List;

public class MisContas {

    private List<Conta> contas = null;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Integer quantidadeDeContas() {
        if (contas == null) {
            return 0;
        }
        return contas.size();
    }
}
