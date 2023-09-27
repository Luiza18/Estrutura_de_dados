public class Tree {
    private Node raiz;

    public Tree(){
        raiz = null;
    }

    public void add(int valor){
        if(raiz != null){
            raiz.add(valor);
        }else{
            raiz = new Node(valor);
        }
    }

    public void show(){
        if(raiz!=null) raiz.show();
    }

    public boolean contains(int valor){
        if(raiz != null) return raiz.contains(valor);
        return false;
    }

    public void showMenor(int valor){
        if(raiz != null) raiz.showMenor(valor);
    }

    public int qtdFolhas(){
        if(raiz != null) return raiz.qtdFolhas();
        return -999;
    }

    public int menor(){
        if(raiz != null) return raiz.menor();
        return -999;
    }

    public int maior(){
        if(raiz != null)return raiz.maior();
        return -999;
    }

    public void showNivel(int nivel){
        if(raiz != null){
            raiz.showNivel(1, nivel);
        }
    }

    public int naoFolhas(){
        if(raiz != null) return raiz.naoFolhas();
        return -999;
    }

    public boolean isEstritamenteBinaria(){
        if(raiz != null) return raiz.isEstritamenteBinaria();
        else return false;
    }

    public void aninhado(){
        if(raiz != null) raiz.aninhado();
    }

    public boolean isDegenerada(){
        if(raiz != null) raiz.isDegenerada();
        return false;
    }
}