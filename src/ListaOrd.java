
class ListaOrd<E extends Comparable<E>> {

    private Node2 head; //início da Lista Ordenada

    //Cria uma Lista no estado vazia (construtor)
    public ListaOrd() {
        head = null;
    }

    //Verifica se a lista está vazia
    public boolean isEmpty() {
        return (head == null);
    }

    //Insere um elemento na Lista Ordenada
    public <E extends Comparable<E>> E insert(E x) {
        if(x==null)return null;
        try {
            Node2 novo = new Node2();
            Node2 aux;
            novo.setDado(x);
            //Se a lista estiver vazia ou o elemento for menor que o primeiro
            if (isEmpty() || x.compareTo((E) head.getDado()) < 0) {
                novo.setProx(head);
                head = novo;
            } else {
                aux = head;
                while (aux.getProx() != null && x.compareTo((E) aux.getProx().getDado()) > 0) {
                    aux = aux.getProx();
                }
                novo.setProx(aux.getProx());
                aux.setProx(novo);
            }
        } catch (Exception ex) { //se memória insuficiente
            return null;
        }
        return x;
    }

    public String toString() {
        if (!isEmpty()) {
            Node2 aux;
            aux = head;
            String saida = "";
            while (aux != null) {
                saida += aux.getDado().toString();
                aux = aux.getProx();
                if (aux != null) {
                    saida += ", ";
                }
            }
            return "ListaOrd: [" + saida + "]";
        } else {
            return "ListaOrd: []";
        }
    }


    //Retorna o conteúdo da Lista
    public String toString2() {
        if (!isEmpty()) {
            Node2 aux;
            aux = head;
            String saida = "";
            while (aux != null) {
                saida += aux.getDado().toString();
                aux = aux.getProx();
                if (aux != null) {
                    saida += "\n";
                }
            }
            return "ListaOrd: \n[\n\n" + saida + "\n]";
        } else {
            return "ListaOrd: []";
        }
    }

    //Remove um elemento da lista
    public <E extends Comparable<E>> E remove(E x) {
        Node2 antes = null, depois = null;        
        if (isEmpty() || x == null || x.compareTo((E) head.getDado()) < 0) {
            return null;  //se lista vazia, valor menor que o primeiro ou x nulo 
        } else {
            if (x.compareTo((E) head.getDado()) == 0) { //se for o primeiro elemento	
                Node2 temp = head;
                head = head.getProx();
                temp = null;
                return x;
            } else { //se for maior que o primeiro, então tentar achar a posição:
                antes = head;
                depois = head.getProx();
                while (depois != null && x.compareTo((E) depois.getDado()) > 0) {
                    antes = antes.getProx();  // mover simultaneamente os dois ponteiros
                    depois = depois.getProx();
                }
                if (depois != null && x.compareTo((E) depois.getDado()) == 0) {
                    antes.setProx(depois.getProx()); // encontrou, caso geral
                    depois = null;
                    return x;
                } else {
                    return null; //não encontrou o elemento					
                }
            }
        }
    }

    //Busca por um elemento na lista e retorna o nó onde encontrou
    public <E extends Comparable<E>> Node2 find(E x) {
        Node2 aux = head;

        //Navega até o nó de interesse
        while (aux != null && x.compareTo((E) aux.getDado()) > 0) {
            aux = aux.getProx();
        }
        //Se achou o elemento
        if (aux != null && x.compareTo((E) aux.getDado()) == 0) {
            return aux;
        } else {
            return null;
        }
    }

    //Destrói uma lista ordenada
    public void clear() {
        Node2 aux = head;
        while (aux != null) {
            remove((E) aux.getDado());
            aux = aux.getProx();
        }
        head = null;
    }
}
