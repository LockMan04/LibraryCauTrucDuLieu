package StackUsingArray;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack {
    protected int arr[];
    protected int top, size, len;

    // Khai báo Stack
    public Stack(int n) {
        size = n;
        len = 0;
        top = -1;
        arr = new int[size];
    }

    // Đẩy phần tử vào trong Stack (Push)
    public void push(int i) {
        if (top + 1 >= size)
            throw new IndexOutOfBoundsException("Stack đầy _ OverFlow Exception");
        if (top + 1 < size)
            arr[top++] = i;
        len++;
    }

    // Lấy phần tử ra khỏi Stack (Pop)
    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        len--;
        return arr[top--];
    }

    // Lấy phần tử đỉnh của Stack (Peek)
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack rỗng");
        return arr[top];
    }

    // Duyệt Stack
    public void display() {
        System.out.print("\nStack = ");
        if (len == 0) {
            System.out.print("Rỗng\n");
            return;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Kiểm tra mảng rỗng
    public boolean isEmpty() {
        return top == -1;
    }

    // Lấy size của Stack
    public int getSize() {
        return size;
    }

    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);
        System.out.println("Nhập kích thước của stack: ");
        int size = hi.nextInt();

        Stack obj = new Stack(size);

        int chon;
        do {
            System.out.println("1. Push vào Stack");
            System.out.println("2. Pop ra khỏi Stack");
            System.out.println("3. Xem phần tử trên đỉnh Stack");
            System.out.println("4. Kiểm tra Stack rỗng");
            System.out.println("5. Số phần tử trong Stack");
            System.out.println("̉6. Duyệt Stack");
            System.out.println("7. Thoát");

            chon = hi.nextInt();
            if (chon <= 0 || chon >= 7)
                System.out.println("Lựa chọn không hợp lệ, đã thoát chương trình");
            switch (chon) {
                case 1:
                    System.out.println("Nhập giá trị để push vào stack: ");
                    int value = hi.nextInt();
                    obj.push(value);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    if (obj.isEmpty()) {
                        System.out.println("Stack rỗng");
                    } else {
                        System.out.println("Stack không rỗng");
                    }
                    break;
                case 5:
                    System.out.println("Số phần tử trong Stack là: " + obj.getSize());
                    break;
                case 6:
                    obj.display();
                    break;
            }
        } while (chon > 0 && chon < 7);
        hi.close();
    }
}
