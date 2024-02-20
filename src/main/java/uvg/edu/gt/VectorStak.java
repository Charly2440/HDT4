package uvg.edu.gt;

import java.util.Vector;

public class VectorStak<T> implements UvgStack<T> {
    private Vector<T> v;
    private int tamano;

    /**
     * Constructor que inicializa la pila y el tamaño.
     */
    public VectorStak() {
        this.v = new Vector<>();
        this.tamano = -1;
    }

    @Override
    public T top() {
        return (this.tamano == -1) ? null : v.lastElement();
    }

    @Override
    public void push(T obj) {
        v.add(obj);
        this.tamano++;
    }

    @Override
    public T pop() {
        if (this.tamano < 0) {
            return null;
        } else {
            T lastElement = v.lastElement();
            v.remove(this.tamano);
            this.tamano--;
            return lastElement;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.tamano == -1;
    }
}
