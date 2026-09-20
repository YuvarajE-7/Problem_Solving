public class frequency_of_a_element {
     public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 3, 5};
        int n = 2;
        int count = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] == n){
                count = count+1;
            }
        }
System.out.print(count);        
    }
}
