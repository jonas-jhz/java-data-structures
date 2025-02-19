package doublylinkedlist.LDE;

import doublylinkedlist.Data.Tarefa;

public class LDE {

    private LDENode head;
    private LDENode tail;
    private int size;

    public LDE(LDENode head, LDENode tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public LDENode getHead() {
        return head;
    }

    public void setHead(LDENode head) {
        this.head = head;
    }

    public LDENode getTail() {
        return tail;
    }

    public void setTail(LDENode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private Tarefa isInList(Tarefa tarefa){

        LDENode current = this.head;

        do{
            if(current.getTarefa().compareTo(tarefa) != 0){
                current = current.getNext();
            }
            else{
                return tarefa;
            }

        }while(current != this.tail);

        return null;
    }

    private LDENode search(Tarefa tarefa){
        LDENode current = this.head;

        while(current.getTarefa().compareTo(tarefa) != 0 && current != this.tail){
            current.getNext();
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

        }
        else if(newNode.getTarefa().getPrioridade() < this.tail.getTarefa().getPrioridade()){

        }
        else if(newNode.getTarefa().getPrioridade() == this.tail.getTarefa().getPrioridade()){

        }
        else{

        }
        this.size++;
    }
}
