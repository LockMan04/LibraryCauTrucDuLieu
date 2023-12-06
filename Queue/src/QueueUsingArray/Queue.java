package QueueUsingArray;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue {
    protected int Queue[];
    protected int front, rear, size, len;

    // Định nghĩa Queue
    public Queue(int n) {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }

    /* Thêm 1 phần tử vào queue */
    public void Enqueue(int i) {
        if (rear == -1) {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        } else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Queue đầy!");
        else if (rear + 1 < size)
            Queue[++rear] = i;
        len++;
    }

    /* Lấy 1 phần tử ra khỏi queue */
    public int Dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue rỗng!");
        else {
            len--;
            int ele = Queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else
                front++;
            return ele;
        }
    }

    /* Hàm duyệt queue */
    public void display() {
        System.out.print("\nNội dung của Queue : ");
        if (len == 0) {
            System.out.print("Queue rỗng\n");
            return;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i] + " ");
        System.out.println();
    }

    /* Hàm xem phần tử Front của queue */
    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue rỗng!");
        return Queue[front];
    }

    /* Hàm lấy kích thước của queue */
    public int getSize() {
        return len;
    }

    // Kiểm tra Queue có rỗng hay không?
    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Nhập kích thước của Queue: ");
        int size = hi.nextInt();

        Queue obj = new Queue(size);

        int chon;
        do {
            System.out.println("1. Push vào Queue (EnQueue)");
            System.out.println("2. Pop ra khỏi Queue (DeQueue)");
            System.out.println("3. Xem phần tử trên đỉnh Queue");
            System.out.println("4. Kiểm tra Queue rỗng");
            System.out.println("5. Số phần tử trong Queue");
            System.out.println("̉6. Duyệt Queue");
            System.out.println("7. Thoát");

            chon = hi.nextInt();
            if (chon <= 0 || chon >= 7)
                System.out.println("Lựa chọn không hợp lệ, đã thoát chương trình");
            switch (chon) {
                case 1:
                    System.out.println("Nhập giá trị để push vào Queue: ");
                    int value = hi.nextInt();
                    obj.Enqueue(value);
                    break;
                case 2:
                    obj.Dequeue();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    if (obj.isEmpty()) {
                        System.out.println("Queue rỗng");
                    } else {
                        System.out.println("Queue không rỗng");
                    }
                    break;
                case 5:
                    System.out.println("Số phần tử trong Queue là: " + obj.getSize());
                    break;
                case 6:
                    obj.display();
                    break;
            }
        } while (chon > 0 && chon < 7);
        hi.close();
    }
}
