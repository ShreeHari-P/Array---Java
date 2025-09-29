public class PalindromeArrayCheck {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Is Palindrome: " + isPalindrome(arr1));

        System.out.println();
        
        System.out.println("Array: " + java.util.Arrays.toString(arr2));
        System.out.println("Is Palindrome: " + isPalindrome(arr2));
    }

    public static boolean isPalindrome(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
