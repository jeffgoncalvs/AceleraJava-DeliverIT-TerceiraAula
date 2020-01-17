package com.company;

public class DiarioDeClasse {

    Professor professor;
    Disciplina disciplina;
    Sala sala;
    Turma turma;


    public DiarioDeClasse(Professor professor, Disciplina disciplina, Sala sala, Turma turma) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.sala = sala;
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
