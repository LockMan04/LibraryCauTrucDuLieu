package QueueUsingLinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);
        int chon;
        Queue queue = new Queue();
        queue.insert(4);
        queue.insert(1);
        queue.insert(6);
        queue.insert(9);
        queue.insert(8);
        do {
            System.out.println("=================================");
            System.out.println("1. Thêm vào Queue (EnQueue)");
            System.out.println("2. Lấy ra khỏi Queue (DeQueue)");
            System.out.println("3. Xem phần tử đầu Queue");
            System.out.println("4. Kiểm tra Queue rỗng");
            System.out.println("5. Kích thước Queue");
            System.out.println("6. Duyệt Queue");
            System.out.println("7. Thoát");
            System.out.println("=================================");
            System.out.println("Vui lòng nhập tuỳ chọn của bạn");
            chon = hi.nextInt();
            if (chon < 1 || chon > 6)
                System.out.println("Đã thoát chương trình");
            switch (chon) {
                case 1:
                    System.out.println("Nhập số bạn muốn thêm: ");
                    int insert = hi.nextInt();
                    queue.insert(insert);
                    break;
                case 2:
                    System.out.println("Đã lấy ra khỏi queue");
                    queue.remove();
                    break;
                case 3:
                    System.out.println("Phần tử đầu của queue là: " + queue.peek());
                    break;
                case 4:
                    String messageEmpty = queue.isEmpty() ? "Queue rỗng" : "Queue không rỗng";
                    System.out.println(messageEmpty);
                    break;
                case 5:
                    System.out.println("Kích thước cảu queue là: " + queue.getSize());
                    break;
                case 6:
                    queue.display();
                    break;
                default:
                    System.out.println("...Something is wrong...");
            }
        } while (chon > 0 && chon < 7);
        hi.close();
    }
}
