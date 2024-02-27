package uvg.edu.gt;

public class SLL<T> implements UvgList<T> {
    private Node<T> head;
    private int size;

    public SLL() {
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
        }
        size++;
    }

    @Override
    public Node<T> delete() {
        if (this.size == 0) {
            return null;
        }
        Node<T> current = this.head;
        Node<T> prev = null;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
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
        StringBuilder sllString = new StringBuilder();
        Node<T> current = this.head;
        while (current != null) {
            sllString.append(" ").append(current.toString());
            current = current.getNext();
        }
        return sllString.toString();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> search(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
