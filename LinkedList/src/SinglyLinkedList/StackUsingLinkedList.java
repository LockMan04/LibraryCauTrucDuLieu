package SinglyLinkedList;
import java.util.Scanner;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chon;
        SinglyLinkedList linkedList = new SinglyLinkedList();
        do {
            System.out.println("1. Push vào Stack");
            System.out.println("2. Pop ra khỏi Stack");
            System.out.println("3. Xem phần tử trên đỉnh Stack");
            System.out.println("4. Kiểm tra Stack rỗng");
            System.out.println("5. Số phần tử trong Stack");
            System.out.println("6. Duyệt Stack");
            System.out.println("7. Đảo ngược Stack");
            System.out.println("8. Thêm dữ liệu vào Stack theo thứ tự tăng dần");
            System.out.println("9. Gộp 2 DSLK");
            System.out.println("10. Thoát");
            chon = scanner.nextInt();

            if (chon < 1 || chon > 9) {
                System.out.println("Đã thoát khỏi chương trình");
                System.out.println("---------------------------------");
            }

            switch (chon) {
                case 1:
                    System.out.println("Nhập số cần thêm vào Stack: ");
                    int x = scanner.nextInt();
                    linkedList.push(x);
                    System.out.printf("Đã thêm %d vào Stack \n", x);
                    break;
                case 2:
                    String messagePop = linkedList.pop() ? "Đã pop ra khỏi Stack" : "Mảng rỗng không thể pop ra";
                    System.out.println(messagePop);
                    break;
                case 3:
                    linkedList.peek();
                    break;
                case 4:
                    String messageEmpty = linkedList.isEmpty() ? "Mảng rỗng" : "Mảng không rỗng";
                    System.out.println(messageEmpty);
                    break;
                case 5:
                    System.out.println("Số phần tử trong Stack là: " + linkedList.getSize());
                    break;
                case 6:
                    linkedList.display();
                    break;
                case 7:
                    System.out.println("Đã đảo ngược Stack");
                    linkedList.reverseStack();
                    linkedList.display();
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } while (chon > 0 && chon < 10);

        scanner.close();
    }
}
