package StackUsingLinkedList;
import java.util.NoSuchElementException;

public class Stack {
    protected Node top;
    protected int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    // Push vào stack
    public void push(int data) {
        Node nptr = new Node(data, null);
        if (top == null)
            top = nptr;
        else {
            nptr.setLink(top);
            top = nptr;
        }
        size++;
    }

    // Pop ra khỏi stack
    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack rỗng");
        Node ptr = top;
        top = ptr.getLink();
        size--;
        return ptr.getData();
    }

    // Peek stack
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack rỗng");
        return top.getData();
    }

    // Display Stack
    public void display() {
        System.out.print("\nNội dung của Stack : ");
        if (size == 0) {
            System.out.print("Stack rỗng\n");
            return;
        }
        Node ptr = top;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }

}
