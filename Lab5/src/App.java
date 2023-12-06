import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int chon;
    
        LinkedList linkedList = new LinkedList();
        linkedList.pop(123, "Honda");
        linkedList.pop(124, "Huyndai");
        linkedList.pop(135, "Volvo");
        linkedList.pop(90, "Lexus");


        do {
            System.out.println("Nhập yêu cầu của bạn: ");
            System.out.println("1. Thêm phần tử vào DSLK");
            System.out.println("2. Tìm mã xe");
            System.out.println("3. Tìm tên xe");
            System.out.println("4. Duyệt DLSK");
            System.out.println("5. Thoát");
            chon = hi.nextInt();

            if (chon < 1 || chon > 5) {
                System.out.println("Đã thoát chương trình");
            }

            switch (chon) {
                case 1:
                    System.out.println("Thêm phần tử");
                    System.out.println("Nhập mã xe: ");
                    int id = hi.nextInt();
                    hi.nextLine();
                    System.out.println("Nhập tên xe: ");
                    String name = hi.nextLine();
                    linkedList.pop(id, name);
                    break;
                case 2:
                    System.out.println("Nhập mã xe muốn tìm: ");
                    int x = hi.nextInt();
                    hi.nextLine();
                    String messageX = linkedList.findID(x) ?  "Đã tìm thấy " + x + " trong DSLK" : "Không tìm thấy";
                    System.out.println(messageX);
                    break;
                case 3:
                    System.out.println("Nhập tên xe muốn tìm: ");
                    hi.nextLine();
                    String y = hi.nextLine();
                    String messageY = linkedList.findCar(y) ? "Đã tìm thấy " + y + " trong DSLK" : "Không tìm thấy";
                    System.out.println(messageY);
                    break;
                case 4:
                    linkedList.display();
                    break;
            }
        } while (chon > 0 && chon < 5);
        hi.close();
    }
}
