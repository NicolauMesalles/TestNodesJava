import java.util.ArrayList;

public class Red {
    private ArrayList<Nodo> nodos;

    public Red() {
        nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo) {
        if (!nodos.contains(nodo)) {
            nodos.add(nodo);
        }
    }

    public void conectar(Nodo a, Nodo b) {
        a.connectar(b);
        b.connectar(a);
    }

    public void mostrar() {
        System.out.println("=== GRAFO ===");
        for (Nodo n : nodos) {
            System.out.print(n.getNombre() + " --> " + n.getVecinos() +  "-" + "\n");
        }
    }

}
