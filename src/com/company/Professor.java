package com.company;

public class Professor extends Funcionario {
    DiarioDeClasse diarioDeClasse;
    Colegio colegio;

    public Professor(Colegio colegio) {
        this.colegio=colegio;
    }

    public DiarioDeClasse getDiarioDeClasse() {
        return diarioDeClasse;
    }

    public void setDiarioDeClasse(DiarioDeClasse diarioDeClasse) {
        this.diarioDeClasse = diarioDeClasse;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
}
