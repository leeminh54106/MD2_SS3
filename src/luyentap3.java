import java.util.Scanner;

public class luyentap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng");
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];
        do {

            System.out.printf("***********menu************\n" +
                    "1.Nhập giá trị các phần tử của mảng\n" +
                    "2.Hiển thị giá trị của phần tử của mảng\n" +
                    "3.In ra giá trị các phần tử là số chẵn\n" +
                    "4.In ra giá trị các phần tử có chỉ số là lẻ\n" +
                    "5.Tính tổng các phần tử trong mảng\n" +
                    "6.In giá trị nhỏ nhất và lớn nhất trong mảng\n" +
                    "7.Thoát"
            );

            System.out.println("nhập lựa chọn 1->7");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println("nhập số từ phần tử " + i + " :");
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("các phần tử trong mảng là");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + ",");
                    }
                    break;
                case 3:
                    System.out.println("In ra giá trị các phần tử là số chẵn");
                    for (int element : numbers) {
                        if (element % 2 == 0) {
                            System.out.println(element + ",");
                        }
                    }
                    break;
                case 4:
                    System.out.println("các phần tử có chỉ số lẻ là:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (i % 2 != 0) {
                            System.out.print(numbers[i] + ",");
                        }
                    }
                    break;
                case 5:
                    int sum = 0;
                    for (int element : numbers) {
                        sum += element;
                    }
                    System.out.println("tổng là " + sum);
                    break;
                case 6:
                    int min = numbers[0];
                    int max = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (min > numbers[i]) {
                            min = numbers[i];
                        }
                        if (max < numbers[i]) {
                            max = numbers[i];
                        }
                    }
                    System.out.println("giá trị nhỏ nhất:" + min + "giá trị lớn nhất:" + max);
                    break;
                case 7:
                System.exit(0);
                default:
                    System.out.println("nhập lại nhé");

            }

        } while (true);

    }
}
