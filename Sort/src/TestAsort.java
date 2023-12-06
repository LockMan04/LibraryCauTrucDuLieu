import java.util.Scanner;

public class TestAsort {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int n = hi.nextInt();
        int a[] = new int[n];

        Asort obj = new Asort();
        int chon;
        do {
            System.out.println("Vui lòng chọn một số: ");
            System.out.println("1. Nhập mảng");
            System.out.println("2. Tạo mảng ngẫu nhiên");
            System.out.println("3. Xuất mảng");
            System.out.println("4.Insertion Sort");
            System.out.println("5.Insertion Sort DESC");
            System.out.println("6.Selection Sort");
            System.out.println("7.Selection Sort DESC");
            System.out.println("8.Interchange Sort");
            System.out.println("9.Interchange Sort DESC");
            System.out.println("10.Bubble Sort");
            System.out.println("11.bubble Sort DESC");
            System.out.println("12.Shell Sort");
            System.out.println("13. Shark Sort");
            System.out.println("14. Heap Sort");
            System.out.println("15.Quick Sort");
            System.out.println("16. Quick Sort DESC");
            System.out.println("17. Linear Search");
            System.out.println("18. Binary Search");
            System.out.println("19. Test Array");
            System.out.println("20. Thoát");
            chon = hi.nextInt();
            if (chon > 20)
                System.out.println("Đã thoát chương trình");

            switch (chon) {
                case 1:
                    obj.nhapMang(a, n);
                    System.out.println();
                    break;
                case 2:
                    obj.randomMang(a, n);
                    System.out.println("Đã tạo mảng ngẫu nhiên");
                    break;
                case 3:
                    System.out.println("Mảng của bạn là: ");
                    obj.xuatMang(a, n);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Mảng sau khi Insertion Sort là: ");
                    obj.InsertionSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 5:
                    System.out.println("Mảng sau khi Insertion Sort DESC là: ");
                    obj.InsertionSortDESC(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 6:
                    System.out.println("Mảng sau khi Selection Sort là: ");
                    obj.InsertionSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 7:
                    System.out.println("Mảng sau khi Selection Sort DECS là: ");
                    obj.InsertionSortDESC(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 8:
                    System.out.println("Mảng sau khi Interchange Sort là: ");
                    obj.InterchangeSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 9:
                    System.out.println("Mảng sau khi Interchange Sort DESC là: ");
                    obj.InterchangeSortDESC(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 10:
                    System.out.println("Mảng sau khi Bubble Sort là: ");
                    obj.BubbleSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 11:
                    System.out.println("Mảng sau khi Bubble Sort DESC là: ");
                    obj.BubbleSortDESC(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 12:
                    System.out.println("Mảng sau khi Shell Sort là: ");
                    obj.BubbleSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 13:
                    System.out.println("Mảng sau khi Shaker Sort là: ");
                    obj.ShakerSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 14:
                    System.out.println("Mảng sau khi Heap Sort là: ");
                    obj.HeapSort(a, n);
                    obj.xuatMang(a, n);
                    break;
                case 15:
                    System.out.println("Mảng sau khi Quick Sort là: ");
                    obj.QuickSort(a, 0, n - 1);
                    obj.xuatMang(a, n);
                    break;
                case 16:
                    System.out.println("Mảng sau khi Quick Sort DESC là: ");
                    obj.QuickSortDESC(a, 0, n - 1);
                    obj.xuatMang(a, n);
                    break;
                case 17:
                    System.out.println("Mời bạn nhập số cần tìm: ");
                    int x = hi.nextInt();
                    if (obj.LinearSearch(a, x) == -1) {
                        System.out.println("Không tìm thấy " + x);
                    } else
                        System.out.println("Đã tìm thấy " + x + " tại vị trí " + obj.LinearSearch(a, x));
                case 18:
                    System.out.println("Mời bạn nhập số cần tìm: ");
                    int z = hi.nextInt();
                    if (obj.BinarySearch(a, z) == -1) {
                        System.out.println("Không tìm thấy " + z);
                    } else {
                        System.out.println("Đã tìm thấy " + z + " tại vị trí " + obj.BinarySearch(a, z));

                    }
                case 19:
                    if (obj.TestArr(a) == 0) {
                        System.out.println("Mảng của bạn không có thứ tự tăng dần");
                    } else {
                        System.out.println("Mảng của bạn có thứ tự tăng dần");
                    }
            }
        } while (chon < 20);
        hi.close();
    }
}
