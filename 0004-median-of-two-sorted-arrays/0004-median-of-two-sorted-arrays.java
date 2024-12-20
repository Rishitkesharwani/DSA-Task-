class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n) {
            arr[k++] = nums1[i++];
        }
        while (j < m) {
            arr[k++] = nums2[j++];
        }

        Arrays.sort(arr);
        int mid = (m + n) / 2;

        if ((m + n) % 2 != 0) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0; 
        }
    }
}
