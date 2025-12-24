import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = 0;
        int sum = 0;
        for (int a : apple) {
            sum += a;
        }
        while (sum > 0) {
            sum -= arr[i++];
        }
        return i;
    }
}
