

public class Node2 {
	private Object dado; 	//Dado a ser armazenado no nó
	private Node2 prox;	//Referência para o próximo nó

	//Devolve o conteúdo do nó
	public Object getDado() {
		return dado;
	}

	//Atribui um valor ao conteúdo do nó
	public void setDado(Object novovalor) {
		dado = novovalor;
	}

	//Devolve a referência do próximo nó
	public Node2 getProx() {
		return prox;
	}

	//Atribui uma referência para o próximo nó
	public void setProx(Node2 novoprox) {
		prox = novoprox;
	}

}