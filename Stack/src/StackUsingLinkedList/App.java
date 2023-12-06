package StackUsingLinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);
        int chon;

        Stack stack = new Stack();
        do {
            System.out.println("==============================");
            System.out.println("1. Push vào Stack");
            System.out.println("2. Pop ra khỏi Stack");
            System.out.println("3. Xem phần tử trên đỉnh Stack");
            System.out.println("4. Kiểm tra Stack rỗng");
            System.out.println("5. Số phần tử trong Stack");
            System.out.println("6. Duyệt Stack");
            System.out.println("7. Thoát");
            System.out.println("==============================");
            chon = hi.nextInt();
            if (chon < 1 || chon > 6)
                System.out.println("Đã thoát khỏi chương trình");

            switch (chon) {
                case 1:
                    System.out.println("Nhập số bạn muốn push vào stack: ");
                    int insert = hi.nextInt();
                    stack.push(insert);
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Đã pop ra khỏi stack");
                    break;
                case 3:
                    System.out.println("Phần tử đỉnh của stack: " + stack.peek());
                    break;
                case 4:
                    String messageEmpty = stack.isEmpty() ? "Queue rỗng" : "Queue không rỗng";
                    System.out.println(messageEmpty);
                    break;
                case 5:
                    System.out.println("Kích thước cảu stack là: " + stack.getSize());
                    break;
                case 6:
                    stack.display();
                    break;
                default:
                    System.out.println("..Something is wrong...");
            }
        } while (chon > 0 && chon < 7);
        hi.close();
    }
}
