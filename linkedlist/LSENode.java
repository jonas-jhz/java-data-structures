package com.java.datastrutcure.linkedlist; // * Este é o caminho que estamos usando, "diretório"


// * "Nós" são pontos que guardam informação propria e endereço do próximo nó |  -->UO-->UO-->  |
//Nessa parte, criamos um formato para como os nós de uma lista simplesmente encadeada
public class LSENode<T> { // * <T> significa parametro generico para uma classe

    private T info; // informação a ser guardada "U"            |formato: Visibilidade Tipo Nome;
    private LSENode<T> next; // Endereço do proximo nó            |formato: Visibilidade Tipo Nome;

    public LSENode(T info, LSENode<T> next) { // construtor gerado para quando houver infomação e endereço
        this.info = info;
        this.next = next;
    }

    public LSENode(T info) { // construtor gerado para quando houver só um nó
        this.info = info;
        this.next = null; // * definindo null para o proximo, já que é o ultimo nó
    }

    public LSENode(){ // Caso em que não há nó
        this.next = null;
    }

    public LSENode<T> getNext() {
        return next;
    }

    public void setNext(LSENode<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}