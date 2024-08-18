class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length-1;
        Arrays.sort(people);
        int left=0;
        int right=n;
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}