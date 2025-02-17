package com.java.datastructure.lde;

public class Tarefa implements Comparable<Tarefa>{
    private String descricao;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }


    @Override
    public int compareTo(Tarefa tarefa) {
        return this.descricao.compareTo(tarefa.descricao);
    }
}
