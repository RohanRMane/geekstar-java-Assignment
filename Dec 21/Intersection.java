
import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums1 = {9,4,9,8,4};
		int[] nums2 = {4,9,5};
		int leng1=nums1.length;
		int leng2=nums2.length;
		int i=0,j=0,k=0;
		Arrays.sort(nums1);//sorting array in ascending
		Arrays.sort(nums2);
		
		while(i<leng1&&j<leng2){
			if(nums1[i]<nums2[j]){
				i++;
			}else if(nums1[i]>nums2[j]){
				j++;
			}else {
				nums1[k+1]=nums1[i++];//in k value of intersection b/w two number will be save
				j++;
				System.out.println("intersection of array is "+nums1[i]+" "+nums2[k]);
			}
			
		}

	}

}