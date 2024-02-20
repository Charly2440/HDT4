package uvg.edu.gt;

/**
 * Es una interfaz para una pila genérica

 * @param <T> El tipo de objeto que la pila contendrá.
 */
public interface UvgStack<T> {
    /**
     * Devuelve el último objeto puesto en la pila
     *
     * @return último objeto ingresado a la pila
     * @throws java.util.EmptyStackException Si la pila está vacía.
     */
    T top();

    /**
     * Agrega un elemento a la cima de la pila.
     *
     * @param obj El elemento que se va a agregar a la pila.
     */
    void push(T obj);

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return El elemento en la cima de la pila.
     * @throws java.util.EmptyStackException Si la pila está vacía.
     */
    T pop();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean isEmpty();
}
