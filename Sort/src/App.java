import java.util.Random;
import java.util.Scanner;

public class App {

    public void nhapMang(int a[], int n) {
        Scanner hi = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            a[i] = hi.nextInt();
        }
        hi.close();
    }

    public void randomMang(int a[], int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(101);
        }
    }

    public void xuatMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("\n--------------------------------");
    }

    public void InsertionSort(int a[], int n) {
        int x, temp;
        for (int i = 1; i < n; i++) {
            x = a[i];
            temp = i - 1;
            while (temp >= 0 && a[temp] > x) {
                a[temp + 1] = a[temp];
                temp--;
            }
            a[temp + 1] = x;
        }
    }

    public void InsertionSortDESC(int a[], int n) {
        int x, temp;
        for (int i = 1; i < n; i++) {
            x = a[i];
            temp = i - 1;
            while (temp >= 0 && a[temp] < x) {
                a[temp + 1] = a[temp];
                temp--;
            }
            a[temp + 1] = x;
        }
    }

    public void SelectionSort(int a[], int n) {
        int minArr;
        for (int i = 0; i < n - 1; i++) {
            minArr = i;
            for (int j = 0; j < n; j++) {
                if (a[minArr] > a[j]) {
                    minArr = j;
                }
                int temp = minArr;
                a[minArr] = a[i];
                a[i] = temp;
            }
        }
    }

    public void SelectionSortDESC(int a[], int n) {
        int maxArr;
        for (int i = 0; i < n - 1; i++) {
            maxArr = i;
            for (int j = 0; j < n; j++) {
                if (a[maxArr] < a[j]) {
                    maxArr = j;
                }
                int temp = maxArr;
                a[maxArr] = a[i];
                a[i] = temp;
            }
        }
    }

    public void InterchangeSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void InterchangeSortDESC(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void BubbleSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void BubbleSortDESC(int a[], int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public void ShellSort(int a[], int n) {
        for (int x = n / 2; x > 0; x /= 2) {
            for (int i = x; i < n; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= x && a[j - x] > temp; j++) {
                    a[j] = a[j - x];
                }
                a[j] = temp;
            }
        }
    }

    public void ShellSortDESC(int a[], int n) {
            for (int x = n / 2; x > 0; x /= 2) {
            for (int i = x; i < n; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= x && a[j - x] < temp; j -= x) {
                    a[j] = a[j - x];
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner hi = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int n = hi.nextInt();
        int a[] = new int[n];

        App obj = new App();
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
            System.out.println("13.Shell Sort DESC");
            System.out.println("");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            
            
            System.out.println("20. Thoát");
            chon = hi.nextInt();
            if (chon > 13)
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
                    System.out.println("Mảng sau khi Shell Sort DESC là: ");
                    obj.BubbleSortDESC(a, n);
                    obj.xuatMang(a, n);
                    break;
            }
        } while (chon < 20);
        hi.close();
    }
}
