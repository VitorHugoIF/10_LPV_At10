/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vitor.marcelino
 */
public class BD {
    private static Map<Integer, Funcionario> alunos = new HashMap<>();

    public static Funcionario getFuncionario(Integer matricula) {
        return alunos.get(matricula);
    }

    public static void addFuncionario(Funcionario funcionario) {
        alunos.put(funcionario.getMatricula(), funcionario);
    }
}
