/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.proxy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class Funcionario implements IFuncionario{
    private Integer matricula;
    private String nome;
    private String cargo;
    private Float salario;
    
    public Funcionario(int matricula) {
        this.matricula = matricula;
        Funcionario objeto = BD.getFuncionario(matricula);
        this.nome = objeto.nome;
        this.cargo = objeto.cargo;
        this.salario = objeto.salario;
    }

    public Funcionario(Integer matricula, String nome, String cargo, Float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Integer getMatricula() {
        return matricula;
    }
    
    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cargo);
    }

    @Override
    public Float obterSalario(Gerente gerente) {
        return this.salario;
    }
}
