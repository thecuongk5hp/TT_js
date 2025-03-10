import java.util.Scanner;

public class Tt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng n = ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột m = ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        while (true) {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số phần tử chia hết cho 2 và 3");
            System.out.println("4. In và tính tổng phần tử biên và đường chéo");
            System.out.println("5. Sắp xếp tăng dần theo cột");
            System.out.println("6. In số nguyên tố");
            System.out.println("7. Sắp xếp đường chéo chính giảm dần");
            System.out.println("8. Chèn mảng 1 chiều vào dòng");
            System.out.println("9. Thoát");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            arr[i][j] = sc.nextInt();
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Số phần tử chia hết cho 2 và 3: " + count);
                    break;
   case 4:
                    int sum = 0;
                    System.out.println("Phần tử trên biên, đường chéo chính, đường chéo phụ:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1 || i == j || i + j == m - 1) {
                                System.out.print(matrix[i][j] + " ");
                                sum += matrix[i][j];
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Tổng các phần tử trên biên, đường chéo chính, đường chéo phụ: " + sum);
                    break;

                case 5:
                    for (int col = 0; col < m; col++) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int j = i + 1; j < n; j++) {
                                if (matrix[i][col] > matrix[j][col]) {
                                    int temp = matrix[i][col];
                                    matrix[i][col] = matrix[j][col];
                                    matrix[j][col] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp tăng dần theo cột.");
                    break;

                case 6:
                    System.out.println("Các số nguyên tố trong mảng:");
                    for (int[] row : matrix) {
                        for (int num : row) {
                            if (num > 1) {
                                boolean isPrime = true;
                                for (int j = 2; j * j <= num; j++) {
                                    if (num % j == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                                if (isPrime) {
                                    System.out.print(num + " ");
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 7:
                    int min;
                    if (n < m) {
                        min = n;
                    } else {
                        min = m;
                    }

                    for (int i = 1; i < min; i++) {
                        int key = arr[i][i];
                        int j = i - 1;

                        while (j >= 0 && arr[j][j] < key) {
                            arr[j + 1][j + 1] = arr[j][j];
                            j--;
                        }

                        arr[j + 1][j + 1] = key;
                    }
                    break;
                case 8:
                    System.out.print("Nhập số phần tử mảng 1 chiều: ");
                    int size = sc.nextInt();
                    int[] newArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.printf("newArr[%d] = ", i);
                        newArr[i] = sc.nextInt();
                    }
                    System.out.print("Nhập dòng muốn chèn: ");
                    int row = sc.nextInt();
                    if (row >= 0 && row < n && size <= m) {
                        for (int i = 0; i < size; i++) {
                            arr[row][i] = newArr[i];
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
