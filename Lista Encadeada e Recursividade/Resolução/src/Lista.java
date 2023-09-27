public class Lista{
	private Node inicio;
	private Lista invertida;
	
	public Lista(){
		inicio = null;
		invertida = new Lista();
	}
	
	public void add(int valor){
		if(inicio != null){
			inicio.add(valor);
		}
		else{
			inicio = new Node(valor);
		}
	}

	public Lista getInvertida() {
		return invertida;
	}
	
	public void show(){
		if(inicio!=null){
			inicio.show();
		}
	}
	
	public int size(){
		if(inicio!=null){
			return inicio.size();
		}
		else{
			return 0;
		}
	}

    public boolean contrains(int valor){
        if(inicio != null){
            return inicio.contrains(valor);
        }
        return false;
    }

    public int somaPosImpares(){
        if(inicio != null){
            return inicio.somaPosImpares(0);
        }

        return 999;
    }

    public void doubleX(){
        if(inicio != null){
            inicio.doubleX();
        }
    }

	public int somaPares(){
		if(inicio != null){
			return inicio.somaPares(0);
		}

		return  -999;
	}

	public int posicao(int valor){
		if(inicio != null){
			return inicio.posicao(0,valor);
		}

		return -999;
	}

	public boolean verificaOrdemCrescente(){
		if(inicio != null){
			return inicio.verificaOrdemCrescente();
		}

		return false;
	}

	public void inverte(){
		if(inicio != null){
			inicio.inverte(invertida);
		}
	}

	public int menorValor(int valor){
		if(inicio != null){
			return inicio.menorValor(valor);
		}

		return -999;
	}
}