
import java.util.*;

class Solution
{
    public int timetoEqual(int size,int[] array)
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(max<=array[i])
            {
                max=array[i];
            }
        }
        for(int i=0;i<size;i++ )
        {
            sum+=(max-array[i]);
        }
        return sum;

    }
}

class TimeEquality
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        System.out.println(solution.timetoEqual(n,array));
    }
}
