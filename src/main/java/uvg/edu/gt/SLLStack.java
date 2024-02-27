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
        if (isEmpty()) {
            return null;
        }
        return sll.search(0).getData();
    }

    @Override
    public void push(T obj) {
        Node<T> node = new Node<>();
        node.setData(obj);
        sll.add(node);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return sll.delete().getData();
    }

    @Override
    public boolean isEmpty() {
        return this.sll.size() == 0;
    }
}
