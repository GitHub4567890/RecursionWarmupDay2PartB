public class Maximum {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 3};
        System.out.println(maximum(arr, 1));
    }

    public static int maximum(int[] data, int start) {
        if (start == data.length - 1) {
            return data[start];
        }
        int val = maximum(data, start + 1);
        if (val > data[start]) {
            return val;
        } else {
            return data[start];
        }
    }
}