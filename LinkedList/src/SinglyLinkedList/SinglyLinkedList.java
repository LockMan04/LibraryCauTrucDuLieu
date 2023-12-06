package SinglyLinkedList;
public class SinglyLinkedList {
    protected NodesSingly start, end;
    protected int size;

    public SinglyLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    // Push vào stack
    public void push(int x) {
        NodesSingly newNode = new NodesSingly(x);
        size++;
        if (start == null) {
            start = newNode;
            end = start;
        } else {
            newNode.setLink(start);
            start = newNode;
        }
    }

    // Pop ra khỏi stack
    public boolean pop() {
        if (start == null) {
            return false;
        } else {
            start = start.getLink();
            size--;
            return true;
        }
    }

    // Xem phần tử đỉnh của stack
    public void peek() {
        if (start == null) {
            System.out.println("Stack rỗng không có phần tử đỉnh");
        } else {
            System.out.println("Phần tử đỉnh của Stack là: " + end.getData());
        }
    }

    // Duyệt DSLK
    public void display() {
        if (start == null) {
            System.out.println("Danh sách liên kết rỗng");
            return;
        }
        if (start.getLink() == null) {
            System.out.println("Stack của bạn là: " + start.getData());
            return;
        }
        System.out.println("Stack của bạn là: ");
        NodesSingly ptr = start.getLink();
        System.out.print(start.getData() + " -> ");
        while(ptr.getLink() != null) {
            System.out.print(ptr.getData() +" -> ");
            ptr = ptr.getLink();
        }
            System.out.print(ptr.getData() + "\n");
    }

    // Đảo ngược Stack
    public void reverseStack() {
        SinglyLinkedList reversedStack = new SinglyLinkedList();
        while (!isEmpty()) {
            int data = start.getData();
            reversedStack.push(data);
            pop();
        }
        
        start = reversedStack.start;
        size = reversedStack.size;
    }
    
}
