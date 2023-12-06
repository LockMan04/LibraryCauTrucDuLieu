import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);
        int chon;
        BST node = new BST();
        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);
        do {
            System.out.println("=========================================");
            System.out.println("1. Thêm 1 Node");
            System.out.println("2. Xóa 1 Node");
            System.out.println("3. Tìm 1 Khóa trong BST");
            System.out.println("4. Đếm các Node của BST");
            System.out.println("5. Kiểm tra BST rỗng");
            System.out.println("6. Duyệt Inorder");
            System.out.println("7. Duyệt Preorder");
            System.out.println("8. Duyệt Postorder");
            System.out.println("9. Tính chiều cao của BST");
            System.out.println("10. Node có giá trị nhỏ nhất _ Min");
            System.out.println("11. Node có giá trị lớn nhất _ Max");
            System.out.println("12. Đếm số Node lá trong BST");
            System.out.println("13. Đếm số Node 1 con trong BST");
            System.out.println("14. Đếm số Node có 1 con bên trái");
            System.out.println("15. Đếm số Node có 1 con bên phải");
            System.out.println("16. Đếm số Node 2 con trong BST");
            System.out.println("17. Duyệt cây theo chiều ngang");
            System.out.println("18. Đếm số node có data >= x");
            System.out.println("19. Kiểm tra xem có phải là cây nhị phân đầy đủ không? ");
            System.out.println("…");
            System.out.println("25. Thoát");
            System.out.println("Nhấn 1 số để chọn:");
            System.out.println("=========================================");

            chon = hi.nextInt();

            if (chon < 1 || chon > 25)
                System.out.println("Đã thoát chương trình");

            System.out.println("=========================================");
            switch (chon) {
                case 1:
                    int keyInsert;
                    do {
                        System.out.println("Nhập số node bạn muốn thêm");
                        keyInsert = hi.nextInt();
                        node.insert(keyInsert);
                        System.out.println("Bạn có muốn nhập tiếp không?");
                        System.out.println("[1. No]\t[2. Yes]");
                    } while (hi.nextInt() == 2);
                    break;
                case 2:
                    System.out.println("Nhập giá trị node muốn xoá");
                    int delete = hi.nextInt();
                    node.delete(delete);
                    break;
                case 3:
                    System.out.println("Nhập node muốn tìm");
                    int search = hi.nextInt();
                    String messageSearch = node.search(search) ? "Tìm thấy" : "Không tìm thấy";
                    System.out.println(messageSearch);
                    break;
                case 4:
                    System.out.printf("Tree của bạn có: %d node\n", node.countNodes());
                    break;
                case 5:
                    String messageEmpty = node.isEmpty() ? "Cây của bạn rỗng" : "Cây bạn không rỗng";
                    System.out.println(messageEmpty);
                    break;
                case 6:
                    System.out.println("Duyệt Inorder (LNR)");
                    node.inorder();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Duyệt Preorder (NLR)");
                    node.preorder();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Duyệt Posorder (LRN)");
                    node.posorder();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Chiều cao của cây là: " + node.heghtNode());
                    break;
                case 10:
                    System.out.println("Node nhỏ nhất trong tree là: " + node.minValue());
                    break;
                case 11:
                    System.out.println("Node lớn nhất trong tree là: " + node.maxValue());
                    break;
                case 12:
                    System.out.println("Số node lá con trong tree là: " + node.countLeaf());
                    break;
                case 13:
                    System.out.println("Số node 1 lá con là: " + node.count1Leaf());
                    break;
                case 14:
                    System.out.println("Số node 1 lá con bên trái là: " + node.count1LeafLeft());
                    break;
                case 15:
                    System.out.println("Số node 1 lá con bên phải là: " + node.count1LeafRight());
                    break;
                case 16:
                    System.out.println("Số node 2 lá con trong tree là: " + node.count2Leaf());
                    break;
                case 17:
                    System.out.println("Duyệt theo chiều ngang");
                    node.printLevelOrder();
                    System.out.println();
                    break;
                case 18:
                    System.out.println("Mời bạn nhập số cần đếm");
                    int d = hi.nextInt();
                    System.out.printf("Số node có data >= %d là: %d\n", d, node.largerThanX(d));
                    break;
                case 19:
                    String messageIsFullTree = node.isFullTree() ? "Là cây nhị phân đầy đủ"
                            : "Không là cây chị phần đầy đủ";
                    System.err.println(messageIsFullTree);
                    break;
                default:
                    System.out.println("...Something is wrong...");
            }
        } while (chon > 0 && chon < 26);
        hi.close();
    }
}
