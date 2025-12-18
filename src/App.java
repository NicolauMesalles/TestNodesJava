public class App {
    public static void main(String[] args) throws Exception {
        Red red = new Red();

        Nodo a = new Nodo("A");
        Nodo b = new Nodo("B");
        Nodo c = new Nodo("C");
        Nodo d = new Nodo("D");
        Nodo e = new Nodo("E");

        red.agregarNodo(a);
        red.agregarNodo(b);
        red.agregarNodo(c);
        red.agregarNodo(d);
        red.agregarNodo(e);


        red.conectar(a, b);
        red.conectar(b, c);
        red.conectar(b, d);
        red.conectar(c, d);
        red.conectar(d, e);

        red.mostrar();
    }
}
