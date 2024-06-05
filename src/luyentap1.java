import java.util.Scanner;

public class luyentap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("mời nhập vào hàng");
        row = scanner.nextInt();

        System.out.println("mời nhập vào cột");
        col = scanner.nextInt();

        int[][] arr = new int[row][col];


        do {
            System.out.println("===========menu==============\n" +
                    "1. nhập giá trị cho các phần tử của mang \n" +
                    "2.in các phần tử của mảng dưới daạng ma trận \n" +
                    "3.tính tổng tất cả phần tử của mảng \n" +
                    "4.In ra đường chéo chính \n" +
                    "5.in ra đường chéo phụ(phải là ma trận vuông\n" +
                    "6.in ra đường viền" +
                    "7.thoát\n");
            System.out.println("mời bạn nhập từ 1-7");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("in ra ma trận:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("%-3d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum =0;
                    System.out.println("Tính tổng tất cả phần tử của mảng");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                        sum+=arr[i][j];
                        }

                        System.out.println();
                    }
                    System.out.println(sum);
                    break;
                case 4:
                    System.out.println("in ra đương chéo chính");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (i == j) {
                                System.out.printf("%-3d", arr[i][j]);
                            } else {
                                System.out.printf("%-3s", "");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (row == col) {
                        System.out.println("in ra đương chéo phụ:");
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                if (i + j == arr.length - 1) {
                                    System.out.printf("%-3d", arr[i][j]);
                                } else {
                                    System.out.printf("%-3s", "");
                                }
                            }
                            System.out.println();
                        }

                    }
                    break;
                case 6:
                        System.out.println(" đường biên:");
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
//                                if (j == 0 || i == 0 || j== arr[i].length - 1 || i == arr.length - 1) {
                                if (j == 0 || i == 0 || j== col - 1 || i == row - 1) {
                                    System.out.printf("%-3d", arr[i][j]);
                                } else {
                                    System.out.printf("%-3s", "");
                                }
                            }
                            System.out.println();
                        }
                    break;

            }
        }
        while (true);

    }
}