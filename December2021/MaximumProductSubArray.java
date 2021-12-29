public class Solution{
  public int maxProduct(int[] nums){
  int maxSoFar = nums[0];
  int minSoFar = nums[0];
  int res = nums[0];

for(int i = 1; i < nums.length; i++){
	int copyMaxSoFar = maxSoFar;
	int currEl = nums[i];

	maxSoFar = Math.max(currEl, Math.max(currEl*maxSoFar, currEl*minSoFar));
	minSoFar = Math.min(currEl, Math.min(currEl*CopyMaxSoFar, currEl*minSoFar));

	res = Math.max(res, maxSoFar);
        }
	return res;
     }
}
