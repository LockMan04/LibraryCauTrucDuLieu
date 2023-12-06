package DoublyLinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int chon;
        DoublyLinkedList app = new DoublyLinkedList();
        do {
            System.out.println("1. Chèn phần tử ở đầu");
            System.out.println("2. Chèn phần tử ở đuôi");
            System.out.println("3. Chèn phần tử theo vị trí");
            System.out.println("4. Xóa phần tử theo vị trí");
            System.out.println("5. Kiểm tra DSLK rỗng");
            System.out.println("6. Kích thước DSLK");
            System.out.println("7. Duyệt DSLK");
            System.out.println("8. Thoát");
            chon = hi.nextInt();
            if (chon < 1 || chon > 7)
                System.out.println("Đã thoát chương trình");
            switch (chon) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("Nhập số muốn chèn vào đầu: ");
                    int s = hi.nextInt();
                    app.insertAtStart(s);
                    System.out.printf("Đã chèn %d vào đầu trong DSLK\n", s);
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("Nhập số muốn chèn vào cuối: ");
                    int e = hi.nextInt();
                    app.insertAtEnd(e);
                    System.out.printf("Đã chèn %d vào cuối trong DSLK\n", e);
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("Nhập vị trí mà bạn muốn chèn");
                    int chen = hi.nextInt();
                    if (app.getSize() < chen) {
                        System.out.printf("DSLK không đủ độ dài để chèn tại %d\n", chen);
                        System.out.println("--------------------------------");
                        continue;
                    }
                    System.out.printf("Nhập số muốn chèn vào vị trí %d: ", chen);
                    int c = hi.nextInt();
                    app.insertAtEnd(c);
                    System.out.printf("Đã chèn %d vào vị trí %d trong DSLK\n", c, chen);
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    if (app.isEmpty()) {
                        System.out.println("DSLK rỗng không thể xoá");
                        System.out.println("--------------------------------");
                        continue;
                    }
                    System.out.println("Nhập vị trí mà bạn muốn xoá: ");
                    int xoa = hi.nextInt();
                     if (app.getSize() < xoa) {
                        System.out.printf("DSLK không đủ độ dài để xoá tại %d\n", xoa);
                        System.out.println("--------------------------------");
                        continue;
                    }
                    app.deleteAtPosition(xoa);
                    System.out.printf("Đã xoá phần tử tại vị trí %d\n", xoa);
                    System.out.println("--------------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    String message = app.isEmpty() ? "DSLK rỗng" : "DSLK không rỗng";
                    System.out.println(message);
                    System.out.println("--------------------------------");
                    break;
                case 6:
                    System.out.println("--------------------------------");
                    System.out.printf("Kích thước DSLK của bạn là: %d\n", app.getSize());
                    System.out.println("--------------------------------");
                    break;
                case 7:
                    app.display();
                    break;
            }

        } while (chon > 0 && chon < 8);
        hi.close();
    }
}
