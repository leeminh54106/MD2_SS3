import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("nhập số cần thêm");
        int number = sc.nextInt();
        System.out.println("nhập vị trí cần thêm");
        int numberIndex = sc.nextInt();

        if (numberIndex >= 0) {
            if(numberIndex > arr.length - 1) {
                //        [1, 2, 3, 4, 5]
                // index   0  1  2  3  4

                // tạo ra mảng mới VD numberIndex = 10
                //         [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 8]
                // index    0  1  2  3  4  5  6  7  8  9  10

                int[] newArr = new int[numberIndex + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[numberIndex] = number;
                System.out.println(Arrays.toString(newArr));


            } else {

                // [1, 2, 3, 4, 5]
                // [1, 2, 8, 3, 4, 5]
                int[] newArr = new int[arr.length + 1];
                // sao chép các phần tử ở đầu 0 -> numberIndex
                for (int i = 0; i < numberIndex; i++) {
                    newArr[i] = arr[i];
                }
                newArr[numberIndex] = number;
                // sao chép từ numberIndex -> cuối
                for (int i = numberIndex; i < arr.length; i++) {
                    newArr[i+1] = arr[i];
                }
                System.out.println(Arrays.toString(newArr));
            }


        } else {
            System.err.println("Index phai lon hon 0");
        }

    }
}
