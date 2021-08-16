/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class Correios {
    private List<Carta> cartas = new ArrayList<>();

    public void enviarCartaCarta(String remetente, String destinatario, String rua, String cidade, String uf){
        Endereco endereco = EnderecoFactory.getEndereco(rua,cidade,uf);
        Carta carta =  new Carta(remetente, destinatario, endereco);
        cartas.add(carta);
    }

    public List<String> obterCartas() {
        List<String> saida = new ArrayList<String>();
        for (Carta carta : this.cartas) {
            saida.add(carta.obterCarta());
        }
        return saida;
    }
}
