public class Massive {
    public static void main(String[] args) {
        int[] arr = {72, 3, 18, 25, 96, 1, 7};

        for (int x = 0; x < arr.length - 1; x++) {
            int j = x;
            for (int i = x + 1; i < arr.length; i++) {
                if (arr[i] < arr[j]) {
                    j = i;
                }
            }
            int tmp = arr[x];
            arr[x] = arr[j];
            arr[j] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}