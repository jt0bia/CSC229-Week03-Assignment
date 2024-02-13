/**
 * @author JaredTobias
 */
public class BigO {
    public static int getLargest(int[] arr, int sz) {
        int iterate1 = 0;                               // 1
        int iterate2 = 0;                               // 1
        int largest = 0;                                // 1
        while (iterate1 < sz - 1) {                     // (n-1)
            iterate2++;                                 // n
            if (iterate2 == sz) {                       // n
                iterate1++;                             // n
                iterate2 = iterate1;                    // n
                continue;                               // n
            }
        }
        int product = arr[iterate1] * arr[iterate2];    // 1
        if (product > largest)                          // 1
            largest = product;                          // 1

        return largest;                                 // 1
    }
}

// f(n) = 6n + 6
// O(n) - linear
// The following algorithm is linear because Big O has a value of n
// due to the while loop, which each line takes sz-1 (n-1) amount of times
// to execute.