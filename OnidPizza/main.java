import java.util.*;

class Main {

	static int maxCrossingSum(int arr[], int l,
								int m, int h)
	{
		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--)
		{
			sum = sum + arr[i];
			if (sum > left_sum)
			left_sum = sum;
		}

		// Include elements on right of mid
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = m + 1; i <= h; i++)
		{
			sum = sum + arr[i];
			if (sum > right_sum)
			right_sum = sum;
		}

		// Return sum of elements on left
		// and right of mid
		return left_sum + right_sum;
	}

	static int maxSubArraySum(int arr[], int l,
									int h)
	{

	if (l == h)
		return arr[l];


	int m = (l + h)/2;

	return Math.max(Math.max(maxSubArraySum(arr, l, m),
					maxSubArraySum(arr, m+1, h)),
					maxCrossingSum(arr, l, m, h));
	}

	public static void main(String[] args)
	{
    Scanner myObj = new Scanner(System.in);
    int nos_com = myObj.nextInt();
    int cost = myObj.nextInt();
    int[] slots = new int[nos_com];
    int cot = 0;
    while(myObj.hasNextInt()){
      slots[cot] = myObj.nextInt();
      cot++;
    }
    myObj.close();
    for(int i=0; i<nos_com; i++ ) {
         slots[i] = slots[i]-cost;
    }

    int n = slots.length;
    int max_sum = maxSubArraySum(slots, 0, n-1);
	  System.out.println(max_sum);
	}
}
