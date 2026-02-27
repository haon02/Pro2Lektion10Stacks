import java.util.NoSuchElementException;

public class NodeStack implements StackI {
    private Node top;
    private int currentSize = 0;


    public NodeStack(int size) {

    }

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
        currentSize++;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Object data = top.data;
        top = top.next;
        currentSize--;
        return data;
    }

    @Override
    public Object peek() {
       if (top == null) {
           throw new NoSuchElementException();
       }
        return top.data;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    class Node {
        public Object data;
        public Node next;
    }
}

