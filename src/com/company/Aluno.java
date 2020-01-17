package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
    String nome;
    LocalDate dataDeNascimento;
    String endereço;
    String documento;
    String genero;
    String telefone;
    String email;

    public Aluno(String nome, LocalDate dataDeNascimento, String endereço, String documento, String genero, String telefone, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereço = endereço;
        this.documento = documento;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
