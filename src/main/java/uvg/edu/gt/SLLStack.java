package uvg.edu.gt;

public class SLLStack<T> implements UvgStack<T>{
    private UvgList<T> sll;

    /**
     * Constructor que inicializa la pila y usando listas enalazadas simples.
     */
    public SLLStack() {
        ListFactory<T> ListFact = new ListFactory<>();
        this.sll = ListFact.crearLista(1);
    }

    @Override
    public T top() {
        return sll.search(0).getData();
    }

    @Override
    public void push(T obj) {
        Node<T> nodo = new Node<>();
        nodo.setData(obj);
        sll.add(nodo);
    }

    @Override
    public T pop() {
        return sll.delete().getData();
    }

    @Override
    public boolean isEmpty() {
        return this.sll.size() == -1;
    }
}
