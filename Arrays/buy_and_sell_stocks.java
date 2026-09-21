public class buy_and_sell_stocks {
     public static void main (String[] args){
         int[] arr = {7,6,4,3,1};
         int minimum_so_far = arr[0];
         int maximum_profit = 0;
         for(int i = 1;i<arr.length;i++){
             if(arr[i]< minimum_so_far){
                 minimum_so_far = arr[i];
             }
             if(arr[i] - minimum_so_far > maximum_profit){
                 maximum_profit = arr[i] - minimum_so_far;
             }
         }
System.out.print(maximum_profit);
     }
}
