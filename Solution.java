import java.util.*;
class Solution {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int l = 0;
        int r = inputArr.length - 1;
        int count = 0;
        while (l <= r) {
            int mid = l + (r-l) /2;
            if (key == inputArr[mid]) {
                return count;
            }
            //Increment the unsuccessful comparison count here.
            count++;
            if (key < inputArr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution bs = new Solution();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}
