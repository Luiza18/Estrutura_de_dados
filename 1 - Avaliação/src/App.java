public class App {
    public static void main(String[] args) throws Exception {
       Lista lista = new Lista();

       lista.add(1);
       lista.add(2);
       lista.add(3);
       lista.add(4);
       lista.add(5);
       lista.add(6);
       lista.add(7);
       lista.add(8);
       lista.add(9);

       //lista.verificaCrescente();

       System.out.println(lista.posicao(4));
    }
}
