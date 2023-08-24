public class Lista{
	private Node inicio;
	
	public Lista(){
		inicio = null;
	}
	
	public void add(int valor){
		if(inicio != null){
			inicio.add(valor);
		}
		else{
			inicio = new Node(valor);
		}
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
            return inicio.somaPosImpares(1);
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
			return inicio.somaPares(1);
		}

		return  -999;
	}

	public int posicao(int valor){
		if(inicio != null){
			return inicio.posicao(valor);
		}

		return -999;
	}

}