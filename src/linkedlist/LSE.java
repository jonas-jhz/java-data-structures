package linkedlist;

//Nessa parte, definimos um descritor para listas simplesmente encadeadas
// * o descritor é um facilitador de navegação
//
class LSE<T>{ // * parametro genererico para que qualquer tipo de dado possa ser passado "<>"

    //os atributos são visiveis apenas para este programa por motivos de segurança interna
    private LSENode<T> head; // * head é o endereço do primeiro nó de uma lista encadeada
    private LSENode<T> tail; // * tail é o endereço do ultimo nó de uma lista encadeada
    private int size; // * size é a quantidade de nós de uma lista

    public LSE(){ // Construtor define as informações por padrão de uma lista encadeada
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

// ------------------------- nessa parte definiremos os metodos usuais para uma lista encadeada

    // função para saber se há nós
    public boolean isEmpty(){ // isEmpty é uma função que retorna true se a lista estiver vazia e false caso haja pelo menos um nó
        return this.size == 0 ? true : false; // Para fins visuais, crio um ternário que não é necessário nesse caso
    }

    // metodo para inserir (não ordenado)
    public void insert(T value){ // insert recebe um valor de um tipo generico e cria um nó dentro de uma lista encadeada
        LSENode<T> newNode = new LSENode<T>(value); // criação de um novo nó
        if(isEmpty()){ // se estiver vazia, o novo nó criado é o head e o tail
            this.head = newNode;
            this.tail = newNode;
        }
        else{ // se não estiver vazio, o nó da tail receberá o endereço do novo nó
            this.tail.setNext(newNode); // seta o proximo no como sendo o novo
            this.tail = newNode; // o tail agora é o novo nó
        }
        this.size++; // incrementa-se o tamanho
    }

    public T search(T value){
        LSENode<T> current = this.head;

        do{
            if(current.getInfo().equals(value)){
                System.out.println(current);
                return current.getInfo();
            }
            current = current.getNext();
        }while(current.getNext() != null);
        return null;
    }

    public void deleteEnd(T value){
        LSENode<T> current = this.head;

        if(current.getInfo().equals(value)){

        }
    }
}