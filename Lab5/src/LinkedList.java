public class LinkedList {
    protected int size;
    protected Nodes start, end;

    public LinkedList() {
        this.size = 0;
        this.start = null;
        this.end = null;
    }

    public void isEmpty() {
        if (start == null)
            System.out.println("DSLK Rỗng");
    }

    // Thêm vào phần tử cuối của DSLK
    public void pop(int id, String name) {

        Nodes newNode = new Nodes(id, name, null);
        size++;
        if (start == null) {
            start = newNode;
            end = start;
        } else {
            end.setLink(newNode);
            end = newNode;
        }
    }

    // Tìm mã xe
    public boolean findID(int x) {
        Nodes ptr = start;

        while (ptr != null) {
            if (ptr.getIdCar() == x) {
                return true;
            }
                ptr = ptr.getLink();
        }
        return false;
    }

    // Tìm tên xe
    public boolean findCar(String y) {
        Nodes ptr = start;

        while (ptr != null) {
            if (ptr.getNameCar().equals(y)) {
                return true;
            } else {
                ptr = ptr.getLink();
            }
            return false;
        }
        return false;
    }

    // Hiện danh sách liên kết
    public void display() {
        if (start == null) {
            System.out.println("DSLK rỗng");
            return;
        }
        if (start.getLink() == null) {
            System.out.printf("DSLK của bạn là: %d | %s \n", start.getIdCar(), start.getNameCar());
            return;
        }

        Nodes ptr = start;
    System.out.println("DSLK của bạn là: ");
    while (ptr != null) {
        System.out.print(ptr.getIdCar() + " | " + ptr.getNameCar() + " -> ");
        ptr = ptr.getLink(); // Move to the next node
    }
    System.out.println();
    }
}
