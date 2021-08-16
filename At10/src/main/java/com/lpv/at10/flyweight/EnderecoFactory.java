/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vitor.marcelino
 */
public class EnderecoFactory {
    private static Map<String, Endereco> enderecos = new HashMap<>();

    public static Endereco getEndereco(String rua, String cidade, String uf) {
        Endereco endereco = enderecos.get(rua);
        if (endereco == null) {
            endereco = new Endereco(rua, cidade, uf);
            enderecos.put(rua, endereco);
        }
        return endereco;
    }

    public static int getTotalEnderecos() {
        return enderecos.size();
    }
}
