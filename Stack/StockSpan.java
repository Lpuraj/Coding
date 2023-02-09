public class StockSpan {
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1, count = 1;
            while (j >= 0 && arr[j] < arr[i]) {
                j--;
                count++;
            }
            temp[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
