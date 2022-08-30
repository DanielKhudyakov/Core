package Java;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,5,1,4,9};
        int min = arr[0];
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int c = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = c;
                    flag = true;
                }
            }
        }
        for (int el:arr) {
            System.out.print(el);
        }
    }
}
