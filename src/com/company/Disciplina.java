package com.company;

public class Disciplina {
    String nomeDisciplina;
    String horarioInicio;
    String horarioTermino;
    Serie serie;

    public Disciplina(String nomeDisciplina, String horarioInicio, String horarioTermino, Serie serie) {
        this.nomeDisciplina = nomeDisciplina;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.serie = serie;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
}
