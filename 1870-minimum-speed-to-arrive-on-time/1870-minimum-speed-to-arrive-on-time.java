class Solution {
    boolean canReach(int[] dist, double hour, int speed) {
        double time = 0;
        for (int i = 0; i < dist.length; i++) {
            if (i < dist.length - 1) {
                time += Math.ceil((double) dist[i] / speed);
            } else {
                time += (double) dist[i] / speed;
            }
        }
        return time <= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int s = 1, e = (int) 1e7, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (canReach(dist, hour, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
