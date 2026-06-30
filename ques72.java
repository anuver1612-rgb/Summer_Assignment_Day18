import java.util.*;
class q72
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,j,t;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            t=arr[i];
            j=i-1;
            while(j>=0 && arr[j]<t)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=t;
        }
        System.out.println("THE SORTED ARRAY IN DESCENDING ORDER IS:-");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}