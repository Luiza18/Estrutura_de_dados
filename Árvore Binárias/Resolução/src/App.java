public class App {
    public static void main(String[] args) throws Exception {
        Tree arvore = new Tree();

        arvore.add(50);
        arvore.add(30);
        arvore.add(70);
        arvore.add(20);
        arvore.add(90);
        arvore.add(100);
        arvore.add(10);
        arvore.add(40);
        arvore.add(60);
        arvore.add(25);
        
        //System.out.println(arvore.menor());
        //System.out.println(arvore.qtdFolhas());

        //arvore.showNivel(4);

        System.out.println(arvore.isDegenerada());
        
        //.show()
    }
}