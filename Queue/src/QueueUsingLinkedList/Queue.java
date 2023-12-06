package QueueUsingLinkedList;
import java.util.NoSuchElementException;

import StackUsingLinkedList.Node;

public class Queue {
    protected Node front, rear;
    public int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    // Thêm vào queue
    public void insert(int data) {
        Node nptr = new Node(data, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    // Xoá khỏi queue
    public int remove() {
        if (isEmpty())
            throw new NoSuchElementException("Queue rỗng!");
        Node ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size--;
        return ptr.getData();
    }

    // Xem phần tử cuối
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue rỗng!");
        return front.getData();
    }

    // Duyệt queue
    public void display() {
        System.out.print("\nNội dung trong Queue : ");
        if (size == 0) {
            System.out.print("Queue rỗng.\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getLink()) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}
