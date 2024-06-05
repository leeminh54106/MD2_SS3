import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[7];
        int[] array3 = new int[array1.length + array2.length];

        // Nhập các phần tử cho mảng array1
        System.out.println("Nhập các phần tử cho mảng array1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        // Nhập các phần tử cho mảng array2
        System.out.println("Nhập các phần tử cho mảng array2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        // Nối mảng array1 và array2 thành mảng array3
        //vị trí index
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index] = array2[i];
            index++;
        }

        // In ra mảng array3
        System.out.println("Mảng array3 sau khi nối:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
    }

