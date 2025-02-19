package doublylinkedlist.LDE;

import doublylinkedlist.Data.Tarefa;

public class LDENode {

    private LDENode prev;
    private Tarefa tarefa;
    private LDENode next;

    public LDENode(LDENode prev, Tarefa tarefa, LDENode next) {
        this.prev = prev;
        this.tarefa = tarefa;
        this.next = next;
    }

    public LDENode(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public LDENode getPrev() {
        return prev;
    }

    public void setPrev(LDENode prev) {
        this.prev = prev;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public LDENode getNext() {
        return next;
    }

    public void setNext(LDENode next) {
        this.next = next;
    }
}
