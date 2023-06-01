package atividadeParticip02;

public class Lista {
	private Node inicio;
	private int quantidade;
	
	public class Node{
		private String nome;
		private Node ant;
		private Node prox;
		
		public Node(String nome) {
			this.nome = nome;
			this.ant = null;
			this.prox = null;
		}
	}
	
	public Lista() {
        this.inicio = null;
        this.quantidade = 0;
    }
	
	public boolean listaVazia() {
        return quantidade == 0;
    }
	
	public int getQuantidade() {
        return quantidade;
    }
	
	public void inserirInicio(String nome) {
		if(procuraNome(nome)==null) {
			Node novo = new Node(nome);
			
			if(listaVazia()) {
				inicio = novo;
				novo.prox = novo;
				novo.ant = novo;
			} else {
				novo.prox = inicio;
				novo.ant = inicio.ant;
				inicio.ant.prox = novo;
				inicio.ant = novo;
				inicio = novo;
			}
			
			quantidade++;
		} else {
			System.out.println("Nome já inserido");
		}
	}
		
	
	public void inserirFinal(String nome) {
		if(procuraNome(nome)==null) {
			Node novo = new Node(nome);
			
			if(listaVazia()) {
				inicio = novo;
				novo.prox = novo;
				novo.ant = novo;
			} else {
				novo.prox = inicio;
				novo.ant = inicio.ant;
				inicio.ant.prox = novo;
				inicio.ant = novo;
			}
			
			quantidade++;
		} else {
			System.out.println("Nome já inserido");
		}
		
	}
	
	public String mostrarLista() {
		if(listaVazia()) {
			return "Lista Vazia";
		} else {
			String strLista = "";
			Node atual = inicio;
			
			int i = 0;
			while(i<quantidade) {
				strLista = strLista + atual.nome + " -> ";
				atual = atual.prox;
				i++;
			}
			
			return strLista;
		}
	}
	
	public String mostrarListaInvertida() {
		if(inicio==null) {
			return "Lista Vazia";
		} else {
			String strLista = "";
			Node atual = inicio;
			
			int i = 0;
			while(i<quantidade) {
				strLista = strLista + atual.ant.nome + " -> ";
				atual = atual.ant;
				i++;
			}
			
			return strLista;
		}
	}
	
	public Node procuraNome(String nomeBusca) {
		if(inicio==null) {
			return null;
		} else {
			Node atual = inicio;
			int i = 0;
			while(i<quantidade) {
				if(atual.nome == nomeBusca) {
					System.out.println("Nome na lista!");
					return atual;
				} else {
						atual = atual.prox;
						i++;
					}
				}
			return null;
		}
	}
	
	public void excluiNome(String nome) {
		if (listaVazia()) {
            System.out.println("A lista está vazia.");
        } else {
        	if(quantidade==1) {
        		inicio = null;
        	} else {
        		Node aux = procuraNome(nome);
        		aux.ant.prox = aux.prox;
        		aux.prox.ant = aux.ant;
        	}
        	quantidade--;
        }
	}
	
	
	
	

}
