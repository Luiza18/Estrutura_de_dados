public class Node {
    private int x;
    private Node esquerda, direita;

    public Node(int valor){
        x = valor;
        esquerda = direita = null;
    }

    public void add(int valor){
        if(valor < x){
            if(esquerda != null){
                esquerda.add(valor);
            }else{
                esquerda = new Node(valor);
            }
        }else{
            if(direita != null){
                direita.add(valor);
            }else{
                direita = new Node(valor);
            }
        }
    }

    public void show(){
        if(direita!=null) direita.show();
        System.out.println(x);
        if(esquerda!=null) esquerda.show();
    }

    public boolean contains(int valor){
        if(valor == x){
            return true;
        }
        else if(valor < x){
            if (esquerda != null){
                return esquerda.contains(valor);
            }else{
                return false;
            }
        }else{
            if(direita != null){
                return direita.contains(valor);
            }else{
                return false;
            }
        }
    }

    public void showMenor(int valor){
        if(valor > x && esquerda != null) esquerda.show();
    }
    
    public int qtdFolhas(){
        int qtd = 0;

        if(esquerda != null) qtd +=  esquerda.qtdFolhas();
        if(direita != null) qtd +=  direita.qtdFolhas();
        if(esquerda == null && direita ==null) qtd++;
        
        return qtd;
    }

    public int menor(){
        if(esquerda != null) return esquerda.menor();
        else return x;
    }

    public int maior(){
        if(direita !=null) return direita.maior();
        else return x;
    }

    public void showNivel(int pos,int nivel){
      if(pos != nivel){
        if(esquerda != null){
            esquerda.showNivel(pos+1, nivel);
        }
        if(direita != null){
            direita.showNivel(pos+1, nivel);
        }
        
      }else System.out.println(x);
      }

    public int naoFolhas(){
       int soma = 0;

       if(esquerda != null || direita !=null) soma += x;
       if(esquerda != null) soma +=esquerda.naoFolhas();
       if(direita != null) soma +=direita.naoFolhas();

       return soma;
    }

    public boolean isEstritamenteBinaria(){
       if((esquerda != null && direita != null) || (direita == null && esquerda == null)) return  true;
       else if(esquerda != null && direita != null) return  esquerda.isEstritamenteBinaria() &&  direita.isEstritamenteBinaria();

        return false;
    }

    public boolean isDegenerada(){
        if(esquerda != null && direita != null) return true;
        if(esquerda != null) return esquerda.isDegenerada();
        if(direita != null) return direita.isDegenerada();

        return false;
    }

    public void aninhado(){
        System.out.println("(");
        System.out.println(x);
        if(esquerda != null) esquerda.aninhado();
        if(direita != null) direita.aninhado();
        System.out.println(")");
    }
}