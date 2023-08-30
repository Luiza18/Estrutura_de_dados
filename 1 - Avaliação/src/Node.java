public class Node{
	private int x;
	private Node prox;
	
	public Node(int v){
		x = v;
		prox = null;
	}
	
	public void setX(int v){
		x = v;
	}
	
	public int getX(){
		return x;
	}
	
	public void setProx(Node p){
		prox = p;
	}
	
	public Node getProx(){
		return prox;
	}
	
	public void add(int valor){
		if(prox!=null){
			prox.add(valor);
		}
		else{
			prox = new Node(valor);
		}
	}
	
	public void show(){
		System.out.println(x); 
		if(prox!=null){
			prox.show();
		}
	}
	
	public int size(){
	int s=0;
		if(prox!=null){
			s=prox.size();
		}
		return 1+s;
	}

    public boolean contrains(int valor){
        if(x == valor){
            return true;
        }
        if (prox != null) {
            return prox.contrains(valor);
        }
        return false;
    }

   public int somaPosImpares(int pos){
    int s = 0;
        
        if(prox != null){
            s =  prox.somaPosImpares(pos+1);
        }
		if(pos%2 != 0){
           s = s  + x;
        }
        return s;
    }

    public void doubleX(){
    x = x * 2;

        if(prox != null){
            prox.doubleX();
        }
    }

	public int posicao(int pos, int valor){
		if(valor == pos){
			return x;
		}

		if(prox != null){
			return prox.posicao(pos+1,valor);
		}

		throw new IllegalArgumentException("Posição inválida!");
	}

	public int somaPares(int pos){
		int s = 0;

		if(prox != null){
			s = prox.somaPares(pos+1);
		}

		if(x%2 ==0){
			s = s +x;
		}

		return s;
	}

	public boolean verificaOrdemCrescente(){
		if(prox == null){
			return true;
		}

		if(x <=prox.getX()){
			return prox.verificaOrdemCrescente();
		}

		return false;
	}

	public void inverte(Lista invertida){
		if(prox != null){
			prox.inverte(invertida);
		}

		invertida.add(x);
	}

	public int menorValor(int valor) {
		int aux = Integer.MAX_VALUE; 
	
		if (x < valor) {
			aux = x; 
		}
	
		if (prox != null) {
			int proximoMinimo = prox.menorValor(valor);
			aux = Math.min(aux, proximoMinimo); 
		}
	
		return aux;
	}
	
}