package uvg.edu.gt;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayStack<T> implements UvgStack<T> {
    private ArrayList<T> stack;

    public ArrayStack() {
        stack = new ArrayList<>();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public void push(T obj) {
        stack.add(obj);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

