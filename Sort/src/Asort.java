import java.util.Random;
import java.util.Scanner;

public class Asort {
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

    public void ShakerSort(int a[], int n) {
        int i, k = 0, left = 0, right = n - 1;

        while (left < right) {
            for (i = right; i > left; i--) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    k = i;
                }
            }
            left = k;
            for (i = left; i < right; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    k = i;
                }
            }
            right = k;
        }
    }

    // Heap Sort
    public void Heapify(int a[], int n, int vt) {
        while (vt <= n / 2 - 1) {
            int child1 = 2 * vt + 1;
            int child2 = 2 * vt + 2;
            int childmax = child1;
            if (child2 < n && a[child2] > a[childmax])
                childmax = child2;
            if (a[vt] < a[childmax]) {
                int temp = a[vt];
                a[vt] = a[childmax];
                a[childmax] = temp;
            }
            vt = childmax;
        }
    }

    public void BuildHeap(int a[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(a, n, i);
        }
    }

    public void HeapSort(int a[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            Heapify(a, n, 0);
        }
    }

    // Quick Sort
    public void QuickSort(int a[], int left, int right) {
        int i = left, j = right;
        int temp;
        int pivot = a[(left + right) / 2];

        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (left < i) {
            QuickSort(a, left, j);
        }

        if (i < right) {
            QuickSort(a, i, right);
        }
    }

    public void QuickSortDESC(int a[], int left, int right) {
        int i = left, j = right;
        int temp;
        int pivot = a[(left + right) / 2];

        while (i <= j) {
            while (a[i] > pivot)
                i++;
            while (a[j] < pivot)
                j--;
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            QuickSortDESC(a, left, j);
        }

        if (i < right) {
            QuickSortDESC(a, i, right);
        }
    }

    public int LinearSearch(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return x = i;
            }
        }
        return -1;
    }

    public int BinarySearch(int a[], int x) {
        int l = 0, r = a.length;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x)
                return m;
            if (a[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    // Kiểm tra xem array có thứ tự tăng dần không?
    public int TestArr(int a[]) {
        for(int i = 1; i < a.length; i++) {
            for(int j = i - 1; j < i; j++) {
                if(a[i] < a[j])
                break;
            }
            return 1;
        }
        return 0;
    }
}
