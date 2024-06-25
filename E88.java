import java.util.*;

public class E88 {

    public static void main(String[] args) {
        int [] n1 = {1,2,3,0,0,0};
        int [] n2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(n1,m,n2,n);
        System.out.println(Arrays.toString(n1));

    }


    // The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    // m = number of element that should be merged
    // n = n2 array length
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = nums1.length - 1;   // current location pointer new array to last element 
        int n1 = nums1.length - m - 1; // 3
        int n2 = n -1 ; // 2

        while (count >= 0){

            if (nums1 [n1] > nums2 [n2]){
                nums1[count] = nums1 [n1];
                n1--;
                count --;
            }
            else if (nums2 [n2] > nums1 [n1]) {
                nums1[count] = nums2 [n2];
                n2--;
                count --;

            }
            else if ( nums1 [n1] == nums2 [n2]) {
                nums1[count] = nums2 [n2];
                n2--;
                count --;
            }

        }
        
        
    }

        

}
    
