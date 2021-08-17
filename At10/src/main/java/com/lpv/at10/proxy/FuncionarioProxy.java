/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at10.proxy;

import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class FuncionarioProxy implements IFuncionario{
    private Funcionario funcionario;

    private Integer matricula;

    public FuncionarioProxy(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.funcionario == null) {
            this.funcionario = new Funcionario(this.matricula);
        }
        return this.funcionario.obterDadosPessoais();
    }

    @Override
    public Float obterSalario(Gerente gerente) {
        if (!gerente.isGerenteContabilidade()) {
            throw new IllegalArgumentException("Gerente não autorizado");
        }
        if (this.funcionario == null) {
            this.funcionario = new Funcionario(this.matricula);
        }
        return this.funcionario.obterSalario(gerente);
    }  
}
