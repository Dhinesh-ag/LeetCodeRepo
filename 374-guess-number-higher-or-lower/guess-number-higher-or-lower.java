public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int middle=start+(end-start)/2;
             if(guess(middle)==-1) 
              end=middle-1;
             else if(guess(middle)==1)  
              start=middle+1; 
             else return 
              middle;
        }
        return -1; 
    }
}