class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        int [] combained = new int[m+n];

        while(j<n && i<m){
            if(nums1[i] > nums2[j]){
                combained[k++]  = nums2[j++];
            }else{
                combained[k++]  = nums1[i++];
            }
        // System.out.println("."+Arrays.toString(combained));
        }
        if(j==n){
            System.arraycopy(nums1, i, combained, k, (m+n-k));
            // System.out.println(Arrays.toString(combained));
        }else if(i==m){
            System.arraycopy(nums2, j, combained, k, (m+n-k));
            // System.out.println(Arrays.toString(combained));
        }
        System.arraycopy(combained, 0, nums1, 0, (m+n));
    }
}