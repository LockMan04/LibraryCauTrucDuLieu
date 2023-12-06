package DoublyLinkedList;
public class DoublyLinkedList {
    protected Nodes start, end;
    protected int size;

    public DoublyLinkedList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public DoublyLinkedList(Nodes start, Nodes end, int size) {
        this.start = start;
        this.end = end;
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    // Chèn phần tử ở vị trí đầu
    public void insertAtStart(int data) {
        Nodes x = new Nodes(data, null, null);
        if (isEmpty()) {
            start = x;
            end = x;
        } else {
            start.setLinkPrev(x);
            x.setLinkNext(start);
            start = x;
        }
        size++;
    }

    // Chèn phần tử ở đuôi
    public void insertAtEnd(int data) {
        Nodes x = new Nodes(data, null, null);
        if (isEmpty()) {
            start = x;
            end = x;
        } else {
            end.setLinkNext(x);
            x.setLinkPrev(end);
            end = x;
        }
        size++;
    }

    // Chèo theo vị trí position
    public void insertAtPosition(int data, int pos) {
        Nodes x = new Nodes(data, null, null);
        if (isEmpty()) {
            insertAtStart(data);
            return;
        }
        if(pos > size){
            return;
        }
        Nodes ptr = start;
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Nodes temp = ptr.getLinkNext();
                ptr.setLinkNext(x);
                x.setLinkPrev(ptr);
                x.setLinkNext(temp);
                temp.setLinkPrev(x);
            }
            ptr = ptr.getLinkNext();
        }
        size++;
    }

    // Xoá phần tử theo vị trí
    public void deleteAtPosition(int pos) {
        if (isEmpty()) {
            System.out.println("DSLK rỗng, không thể xoá");
            return;
        }
        if (pos == 1) {
            if (size == 1) {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--;
            return;
        }
        if (pos == size) {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size--;
            return;
        }

        Nodes ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Nodes n = ptr.getLinkNext();
                Nodes p = ptr.getLinkPrev();

                p.setLinkNext(n);
                n.setLinkPrev(p);
                size--;
                return;
            }
            ptr = ptr.getLinkNext();
        }

    }

    // Duyệt DSLK
    public void display() {
        if (isEmpty()) {
            System.out.println("DSLK rỗng, không thể duyệt");
            return;
        }
        if (size == 1) {
            System.out.println("DSLK của bạn là: " + start.getData());
            return;
        }

        Nodes ptr = start;
        System.out.println("DSLK của bạn là: ");
        System.out.print(start.getData() + " <-> ");
        while (ptr.getLinkNext() != null) {
            System.out.print(ptr.getData() + " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData() + "\n");
    }
}