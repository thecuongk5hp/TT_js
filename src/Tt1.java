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
                    int evenCount = 0, oddCount = 0, otherCount = 0;

                    for (int num : numbers) {
                        if (num % 2 == 0 && num % 3 == 0) evenCount++;
                        else if (num % 2 != 0 && num % 3 == 0) oddCount++;
                        else otherCount++;
                    }

                    int[] evenDivisibleBy3 = new int[evenCount];
                    int[] oddDivisibleBy3 = new int[oddCount];
                    int[] others = new int[otherCount];

                    int evenIndex = 0, oddIndex = 0, otherIndex = 0;

                    for (int num : numbers) {
                        if (num % 2 == 0 && num % 3 == 0) evenDivisibleBy3[evenIndex++] = num;
                        else if (num % 2 != 0 && num % 3 == 0) oddDivisibleBy3[oddIndex++] = num;
                        else others[otherIndex++] = num;
                    }

                    int n = evenDivisibleBy3.length;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (evenDivisibleBy3[j] > evenDivisibleBy3[j + 1]) {
                                int temp = evenDivisibleBy3[j];
                                evenDivisibleBy3[j] = evenDivisibleBy3[j + 1];
                                evenDivisibleBy3[j + 1] = temp;
                            }
                        }
                    }

                    n = others.length;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (others[j] > others[j + 1]) {
                                int temp = others[j];
                                others[j] = others[j + 1];
                                others[j + 1] = temp;
                            }
                        }
                    }

                    n = oddDivisibleBy3.length;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (oddDivisibleBy3[j] < oddDivisibleBy3[j + 1]) {
                                int temp = oddDivisibleBy3[j];
                                oddDivisibleBy3[j] = oddDivisibleBy3[j + 1];
                                oddDivisibleBy3[j + 1] = temp;
                            }
                        }
                    }

                    int index = 0;
                    for (int num : evenDivisibleBy3) numbers[index++] = num;
                    for (int num : others) numbers[index++] = num;
                    for (int num : oddDivisibleBy3) numbers[index++] = num;

                    System.out.print("Mảng sau khi sắp xếp: ");
                    for (int num : numbers) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Nhập giá trị m: ");
                    int m = scanner.nextInt();

                    int[] newNumbers = new int[numbers.length + 1];
                    for (int i = 0; i < numbers.length; i++) {
                        newNumbers[i] = numbers[i];
                    }
                    newNumbers[numbers.length] = m;

                    int n1 = newNumbers.length;
                    for (int i = 0; i < n1 - 1; i++) {
                        for (int j = 0; j < n1 - i - 1; j++) {
                            if (newNumbers[j] < newNumbers[j + 1]) {
                                int temp = newNumbers[j];
                                newNumbers[j] = newNumbers[j + 1];
                                newNumbers[j + 1] = temp;
                            }
                        }
                    }

                    numbers = newNumbers;

                    System.out.print("Mảng sau khi chèn m và sắp xếp giảm dần: ");
                    for (int num : numbers) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
           
                case 9:
                    System.exit(0);
                    break;
            }
        }
    }
}
