import java.util.*;
class q70
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,j,p,t;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            p=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[p])
                {
                    p=j;
                }
            }
            t=arr[p];
            arr[p]=arr[i];
            arr[i]=t;
        }
        System.out.println("THE SORTED ARRAY IS :-");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}