package stacks;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI {
    ArrayList<Object> elements;


    public ArrayListStack(int size) {
        elements = new ArrayList<>();
    }

    @Override
    public void push(Object element) {
        elements.add(element);
    }

    @Override
    public Object pop() {
        if (isEmpty()){
            throw new  NoSuchElementException();
        }
        return elements.remove(elements.size() -1);
    }

    @Override
    public Object peek() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return elements.get(elements.size() -1);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
