package uvg.edu.gt;

public class SLL<T> implements UvgList<T> {
    private Node<T> head;
    private int size;

    public SLL() {
        Node<T> head = new Node<>();
        this.size = -1;
    }

    @Override
    public void add(Node<T> obj) {
        Node<T> next = head.getNext();
        if (this.size > -1){
            while (next != null){
                next = next.getNext();
            }
            next = obj;
            size++;
        }
        else{
            next = obj;
            size++;
        }
    }

    @Override
    public Node<T> delete(Node obj, int index) {
        Node<T> next = head.getNext();
        Node<T> prev = null;
        if (this.size > -1){
            while (next != null){
                prev = next;
                next = next.getNext();
            }
            Node<T> eliminado = next;
            prev = next;
            size--;
            return eliminado;
        }
        else{
            return null;
        }
    }

    @Override
    public String traverse() {
        StringBuilder dllString = new StringBuilder();
        int i = 0;
        while (i<=this.size){
            dllString.append(" ").append(this.head.toString());
        }
        return dllString.toString();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> search(int index) {
        return null;
    }
}
