package com.company;

import java.util.List;

public class Turma {
    Integer numeroDaTurma;
    Aluno aluno;
    DiarioDeClasse diarioDeClasse;
    List<Aluno> listaDeAluno;

    public Turma(Integer numeroDaTurma, DiarioDeClasse diarioDeClasse) {
        this.numeroDaTurma = numeroDaTurma;
        this.diarioDeClasse = diarioDeClasse;
    }

    public Integer getNumeroDaTurma() {
        return numeroDaTurma;
    }

    public void setNumeroDaTurma(Integer numeroDaTurma) {
        this.numeroDaTurma = numeroDaTurma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public DiarioDeClasse getDiarioDeClasse() {
        return diarioDeClasse;
    }

    public void setDiarioDeClasse(DiarioDeClasse diarioDeClasse) {
        this.diarioDeClasse = diarioDeClasse;
    }

    public List<Aluno> getListaDeAluno() {
        return listaDeAluno;
    }

    public void setListaDeAluno(List<Aluno> listaDeAluno) {
        this.listaDeAluno = listaDeAluno;
    }
}
