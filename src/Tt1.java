import java.util.Scanner;

public class Tt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        while (true) {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập n phần tử mảng");
            System.out.println("2. In mảng");
            System.out.println("3. Trung bình các số dương");
            System.out.println("4. Tìm vị trí phần tử k");
            System.out.println("5. Sắp xếp giảm dần");
            System.out.println("6. Đếm số nguyên tố");
            System.out.println("7. Sắp xếp theo yêu cầu");
            System.out.println("8. Chèn số m vào mảng");
            System.out.println("9. Thoát");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số phần tử n = ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.printf("arr[%d] = ", i);
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int sum = 0, count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    System.out.println("Trung bình số dương: " + (float) sum / count);
                    break;

                case 4:
                    System.out.print("Nhập k = ");
                    int k = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    break;

                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;
                        if (arr[i] < 2) isPrime = false;
                        for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) primeCount++;
                    }
                    System.out.println("Số lượng số nguyên tố: " + primeCount);
                    break;

                case 7:
                    int[] a = new int[n];
                    int[] b = new int[n];
                    int[] c = new int[n];
                    int aSize = 0, bSize = 0, cSize = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 3 == 0) {
                            if (arr[i] % 2 == 0) {
                                a[aSize] = arr[i];
                                aSize++;
                            } else {
                                c[cSize] = arr[i];
                                cSize++;
                            }
                        } else {
                            b[bSize] = arr[i];
                            bSize++;
                        }
                    }

                    for (int i = 0; i < aSize - 1; i++) {
                        for (int j = i + 1; j < aSize; j++) {
                            if (a[i] > a[j]) {
                                int temp = a[i];
                                a[i] = a[j];
                                a[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < bSize - 1; i++) {
                        for (int j = i + 1; j < bSize; j++) {
                            if (b[i] > b[j]) {
                                int temp = b[i];
                                b[i] = b[j];
                                b[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < cSize - 1; i++) {
                        for (int j = i + 1; j < cSize; j++) {
                            if (c[i] < c[j]) {
                                int temp = c[i];
                                c[i] = c[j];
                                c[j] = temp;
                            }
                        }
                    }

                    int index = 0;
                    for (int i = 0; i < aSize; i++) {
                        arr[index] = a[i];
                        index++;
                    }
                    for (int i = 0; i < bSize; i++) {
                        arr[index] = b[i];
                        index++;
                    }
                    for (int i = 0; i < cSize; i++) {
                        arr[index] = c[i];
                        index++;
                    }
                    break;

                case 8:
                    System.out.print("Nhập m = ");
                    int m = sc.nextInt();
                    arr[n] = m;
                    n++;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    break;

                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}