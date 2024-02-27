package uvg.edu.gt;

import java.util.Vector;

public class DLLStack<T> implements UvgStack<T>{
    private UvgList<T> dll;

    /**
     * Constructor que inicializa la pila usando listas enlazadas dobles.
     */
    public DLLStack() {
        ListFactory<T> listFactory = new ListFactory<>();
        this.dll = listFactory.crearLista(2);
    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return dll.search(0).getData();
    }

    @Override
    public void push(T obj) {
        Node<T> node = new Node<>();
        node.setData(obj);
        dll.add(node);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return dll.delete().getData();
    }

    @Override
    public boolean isEmpty() {
        return this.dll.size() == 0;
    }
}
