import java.util.HashMap;

public class Two_sum {
    public static void main (String[] args){
         HashMap<Integer , Integer> hashy = new HashMap<>();
         int[] arr = {2,3,7,10};
         int i = 0;
         int required = 0;
         int target = 10;
         while(i<arr.length){
             required = target - arr[i];
             if(hashy.containsKey(required)){
                 System.out.println("Indxes" + "[" + hashy.get(required) + "," + i + "]");
                 System.out.println("Values" + required + "+" + arr[i] + "=" + target );
                 break;
             }
             else{
                 hashy.put(arr[i],i);
             }
             i++;
         }
     }
}
