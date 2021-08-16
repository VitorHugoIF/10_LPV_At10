/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.flyweight;

/**
 *
 * @author vitor.marcelino
 */
public class Endereco {
    private String rua;
    private String cidade;
    private String uf;

    public Endereco(String rua, String cidade, String uf) {
        this.rua = rua;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco = { Rua = " + rua + ", Cidade = " +cidade+ ", UF = " +uf+ " }";
    }
}
