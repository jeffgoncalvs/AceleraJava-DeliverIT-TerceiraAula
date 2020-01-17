package com.company;

import java.time.LocalDate;

public class Funcionario {

    String nome;
    String documento;
    LocalDate dataNascimento;
    String cargo;
    String telefone;
    String email;

    public Funcionario(String nome, String documento, LocalDate dataNascimento, String cargo, String telefone, String email) {
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
