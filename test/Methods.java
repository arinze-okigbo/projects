class Methods
{
	public static void main(String[] args)
	{
		int[] nums = {2,4,6,8};
		System.out.println(getSum(nums));
	}
	public static int getSum(int[] nums)
	{
		int sum = 0;
		for (int i = 0;i < nums.length; i++) {
			sum +=nums[i];
		}
		return sum;
	}
}