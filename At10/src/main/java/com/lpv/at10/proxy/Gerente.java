/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.proxy;

/**
 *
 * @author vitor.marcelino
 */
public class Gerente {
    private String nome;
    private boolean isGerenteContabilidade;

    public Gerente(String nome, boolean isGerenteContabilidade) {
        this.nome = nome;
        this.isGerenteContabilidade = isGerenteContabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGerenteContabilidade() {
        return isGerenteContabilidade;
    }

    public void setGerenteContabilidade(boolean isGerenteContabilidade) {
        this.isGerenteContabilidade = isGerenteContabilidade;
    }
}
