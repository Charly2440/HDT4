package uvg.edu.gt;
/**
 * Es una interfaz para una lista genérica. Politica FIFO
 */
public interface UvgList<T> {
    /**
     * Agrega elemento al final de la lista enlazada creando un nuevo nodo.
     *
     * @param obj  el objeto a ser agregado a la lista
     */
    public void add(Node<T> obj);

    /**
     * Recorre la lista devolviendo la referencia de cada elemento de la cabeza a la cola
     *
     * @return retorna un string con las referencias
     *
     */
    public String traverse();

    /**
     * Elimina el elemento en la posicion designada, el ultimo por default
     *
     *
     * @return El nodo que se está eliminando
     *
     */
    public Node<T> delete();

    /**
     * Verifica el tamaño de la lista
     *
     * @return cantidad de nodos en la lista
     */
    public int size();

    /**
     * Busca un elemento en una posicion
     * @param index posicion del elemento de interes
     * @return retorna el elemento en la posicion indicada
     */
    public Node<T> search(int index);

}
