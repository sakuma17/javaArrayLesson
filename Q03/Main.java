import java.util.*;
public class Main{
	public static void main(String[] args){
		//要素数3のdouble配列作成
		double[] nums=new double[3];
		for(int i=0;i<nums.length;i++){
			//1.0から順番に詰める
			nums[i]=i+1.0;
		}
		System.out.println(Arrays.toString(nums));
	}
}
