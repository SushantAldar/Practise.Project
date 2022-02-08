package Phase1;

public class LongestSubsequence {
	static int increase_subsequence(int my_arr[], int arr_length) {
		int seq_arr[] = new int[arr_length];
		int i, j, max=0;
		for(i=0;i<arr_length;i++)
			seq_arr[i]=1;
		for(i=1;i<arr_length;i++)
		for (j=0;j<i;j++)
			if (my_arr[i]> my_arr[j] && seq_arr[i]< seq_arr[j]+1)
				seq_arr[i]=seq_arr[j]+1;
		for (i=0;i<arr_length;i++)
			if(max < seq_arr[i])
				max= seq_arr[i];
		return max;
		
	}
	public static void main(String args[])
	{
		int my_arr[] = {22,11,548,47,9,85,54};
		int arr_length = my_arr.length;
		System.out.println("The length of the longest increasing subsequence is" + increase_subsequence(my_arr,arr_length));
	
	}

}
