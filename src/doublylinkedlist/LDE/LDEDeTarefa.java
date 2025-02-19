package doublylinkedlist.LDE;

import doublylinkedlist.Data.Tarefa;

public class LDEDeTarefa extends LDE{

    private Tarefa tarefa;
    private LDENode head;
    private LDENode tail;
    private int size;

    public LDEDeTarefa(LDENode head, LDENode tail, int size) {
        super(head, tail, size);
    }

    private LDENode search(Tarefa tarefa){
        LDENode current = this.head;

        while(current.getTarefa().compareTo(tarefa) != 0 && current != this.tail){
            current = current.getNext();
        }
        if(current.getTarefa().compareTo(tarefa) != 0){
            return null;
        }
        else{
            return current;
        }
    }

    public void insert(Tarefa tarefa){
        LDENode newNode = new LDENode(tarefa);
        LDENode current = this.head;

        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }
        else if(search(tarefa) != null){
            System.out.println("Ja na lista");
            return;
        }
        else if(newNode.getTarefa().getPrioridade() > this.head.getTarefa().getPrioridade()){
            newNode.setNext(this.head.getNext());
            this.head.setPrev(newNode);
            this.head = newNode;
        }
        else if(newNode.getTarefa().getPrioridade() == this.head.getTarefa().getPrioridade()){
            while(current.getNext().getTarefa().getPrioridade() >= current.getTarefa().getPrioridade() || current.getNext() == null){
                current = current.getNext();
            }

            searchMinor(newNode, current);
        }
        else if(newNode.getTarefa().getPrioridade() <= this.tail.getTarefa().getPrioridade()){
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        else{
            while(current.getNext().getTarefa().getPrioridade() <= current.getTarefa().getPrioridade() || current.getNext() == null){
                current = current.getNext();
            }
            searchMinor(newNode, current);
        }
        this.size++;
    }

    private void searchMinor(LDENode newNode, LDENode current) {
        if(current.getNext() == null){
            current.setNext(newNode);
            newNode.setPrev(current);
        }
        else{
            current.getNext().setPrev(newNode);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }
}
