import java.util.*;

public class E88 {

    public static void main(String[] args) {
        int [] n1 = {0};
        int [] n2 = {1};
        int m = 0;
        int n = 1;
        merge(n1,m,n2,n);
        System.out.println(Arrays.toString(n1));

    }


    // The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    // m = number of element that should be merged
    // n = n2 array length
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1;
        int n2 = n-1;
        int i = n + m -1;


        while (n2 >= 0){

            if ( n1 >=0 && nums1[n1] > nums2[n2]){
                nums1[i] = nums1[n1];
                i--;
                n1--;
            }
            else {
                nums1[i] = nums2[n2];
                i--;
                n2--;
            }

        }

        
    }

        

}
    
