/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class CorreiosTest {
    
    @Test
    public void testDeveRetornarCartas() {
        Correios correios = new Correios();
        correios.enviarCartaCarta("João", "Maria", "Rua A", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("João", "Maria", "Rua A", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("Alice", "Debora", "Rua B", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("Carlos", "Vitor", "Rua C", "Juiz de Fora", "MG");

        List<String> saida = Arrays.asList(
                "Carta = { Remetente = João, Destinatario = Maria, Endereco = { Rua = Rua A, Cidade = Juiz de Fora, UF = MG } }",
                "Carta = { Remetente = João, Destinatario = Maria, Endereco = { Rua = Rua A, Cidade = Juiz de Fora, UF = MG } }",
                "Carta = { Remetente = Alice, Destinatario = Debora, Endereco = { Rua = Rua B, Cidade = Juiz de Fora, UF = MG } }",
                "Carta = { Remetente = Carlos, Destinatario = Vitor, Endereco = { Rua = Rua C, Cidade = Juiz de Fora, UF = MG } }");

        assertEquals(saida, correios.obterCartas());
    }
    
    @Test
    public void testDeveRetornarTotalEnderecos() {
        Correios correios = new Correios();
        correios.enviarCartaCarta("João", "Maria", "Rua A", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("João", "Maria", "Rua A", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("Alice", "Debora", "Rua B", "Juiz de Fora", "MG");
        correios.enviarCartaCarta("Carlos", "Vitor", "Rua C", "Juiz de Fora", "MG");

        assertEquals(3, EnderecoFactory.getTotalEnderecos());
    }
    
    
    
}
