public class H{
    public static void main(String args[]){
        int n=7;
         n-=1;
        if(n%2==0)
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==n/2 || j==n-1)
                System.out.print("*"+" ");
                else{
                System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }
}                        
               