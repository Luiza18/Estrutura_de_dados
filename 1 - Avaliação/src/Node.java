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

	public int posicao(int pos){
		int local = 0;

		if(local == pos){
			return x;
		}

		if(prox != null){
			prox.posicao(pos);
		}

		return -999;
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

	public void verificaOrdemCrescente(){
		if(prox != null){

		}
	}
}