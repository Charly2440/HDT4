package uvg.edu.gt;

import java.util.Vector;

public class DLLStack<T> implements UvgStack<T>{
    private UvgList<T> dll;

    /**
     * Constructor que inicializa la pila usando listas enlazadas dobles.
     */
    public DLLStack() {
        ListFactory<T> ListFact = new ListFactory<>();
        this.dll = ListFact.crearLista(2);
    }

    @Override
    public T top() {
        return dll.search(0).getData();
    }

    @Override
    public void push(T obj) {
        Node<T> nodo = new Node<>();
        nodo.setData(obj);
        dll.add(nodo);
    }

    @Override
    public T pop() {
        return dll.delete().getData();
    }

    @Override
    public boolean isEmpty() {
        return this.dll.size() == -1;
    }
}
