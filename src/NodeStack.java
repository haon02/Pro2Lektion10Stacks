import java.util.NoSuchElementException;

public class NodeStack implements StackI {
    private Node top;


    public NodeStack(int size) {

    }

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Node oldTop = top;
        Node newTop = top.next;
        top = newTop;
        return oldTop.data;
    }

    @Override
    public Object peek() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    class Node {
        public Object data;
        public Node next;
    }
}

