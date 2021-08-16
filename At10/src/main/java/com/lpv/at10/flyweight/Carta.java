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
public class Carta {
    private String remetente;
    private String destinatario;
    private Endereco endereco;

    public Carta(String remetente, String destinatario, Endereco endereco) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.endereco = endereco;
    }
    
    public String obterCarta() {
        return "Carta = { Remetente = " + remetente + ", Destinatario = " + destinatario + ", " + endereco.toString() + " }";
    }
}
