/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.proxy;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class FuncionarioProxyTest {
     
    @Test
    public void testDeveRetornarDadosPessoaisFuncionario() {
        BD.addFuncionario(new Funcionario(1, "João", "Juiz de Fora", 1000.0f));
        BD.addFuncionario(new Funcionario(2, "Maria", "Juiz de Fora", 1200.0f));
        
        FuncionarioProxy funcionario = new FuncionarioProxy(1);
        assertEquals(Arrays.asList("João", "Juiz de Fora"), funcionario.obterDadosPessoais());
    }
    
    @Test
    public void testDeveRetonarSalarioFuncionario() {
        BD.addFuncionario(new Funcionario(1, "João", "Juiz de Fora", 1000.0f));
        BD.addFuncionario(new Funcionario(2, "Maria", "Juiz de Fora", 1200.0f));
        
        Gerente gerente = new Gerente("Ana", true);
        FuncionarioProxy funcionario = new FuncionarioProxy(2);

        assertEquals(1200.0f, funcionario.obterSalario(gerente));
    }

    @Test
    public void testDeveRetonarExcecaoUsuarioNaoAutorizadoConsultarSalarioFuncionario() {
        BD.addFuncionario(new Funcionario(1, "João", "Juiz de Fora", 1000.0f));
        BD.addFuncionario(new Funcionario(2, "Maria", "Juiz de Fora", 1200.0f));
        
        try {
            Gerente gerente = new Gerente("Joana", false);
            FuncionarioProxy funcionario = new FuncionarioProxy(2);

            funcionario.obterSalario(gerente);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Gerente não autorizado", e.getMessage());
        }
    }
}
