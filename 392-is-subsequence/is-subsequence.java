class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int seq_len=s.length();
        int str_len=t.length();
        int seq_ind=0,str_ind=0;
        while(seq_ind<seq_len && str_ind<str_len)
        {
            if(s.charAt(seq_ind)==t.charAt(str_ind))
            {
                seq_ind++;
                str_ind++;
            }
            else
            {
                str_ind++;
            }
        }
        if(seq_ind==seq_len)
        {
                return true;
        }
        return false;
    }
}