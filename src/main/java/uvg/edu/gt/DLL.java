package uvg.edu.gt;

public class DLL<T> implements UvgList<T> {
    private Node<T> head;
    private int size;

    public DLL() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void add(Node<T> obj) {
        if (this.head == null) {
            this.head = obj;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(obj);
            obj.setPrev(current);
        }
        size++;
    }

    @Override
    public Node<T> delete() {
        if (this.size == 0) {
            return null;
        }
        Node<T> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node<T> prev = current.getPrev();
        if (prev != null) {
            prev.setNext(null);
        } else {
            this.head = null;
        }
        size--;
        return current;
    }

    @Override
    public String traverse() {
        StringBuilder dllString = new StringBuilder();
        Node<T> current = this.head;
        while (current != null) {
            dllString.append(" ").append(current.toString());
            current = current.getNext();
        }
        return dllString.toString();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> search(int index) {
        if (index < 0 || index >= this.size) {
            return null; // Invalid index
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
