import java.util.*;
public class Test{
    public static int minOperations(ArrayList<Integer> nums, int k) {
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = i+1;
        }
        int ct=0;
        int ans=0;
        for(int j=nums.size()-1;j>=0;j--){
            if(nums.get(j)<=k && nums.get(j)>0 && arr[nums.get(j)-1]!=-1){
                arr[nums.get(j)-1]=-1;
                ct++;
            }
            if(ct==k && ans==0){
                ans=nums.size()-j-1;
                break;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        int k = 5;
        System.out.println(minOperations(nums, k));
    }
}