package in.adarsh.practice;

public class binarysearch {


    public static  int min_rotated_binary_search(int[] arr){




        int low= 0;
        int ans=-1;
        int high= arr.length-1;
        while(low<=high) {

            int mid = (low + high) / 2;


            if (arr[mid] > arr[arr.length - 1]) {
                low = mid + 1;
            } else if(arr[mid]<= arr[arr.length-1]){
                ans=mid;
                high = mid - 1;
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,1,2,3,4};

        int asn= min_rotated_binary_search(arr);
        System.out.println(asn);
    }
}
