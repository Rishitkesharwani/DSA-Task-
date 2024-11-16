class Solution {
    public int mySqrt(int x) {
        System.out.println(x);
        return sqrt(x);
    }

    public static int sqrt(int x){
        if (x == 0 || x == 1) {
			return x;
		}
        int ans = 0;
        int low = 1;
		int high = x;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (Math.pow(mid, 2) <= x) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
        return ans;
    }
}
