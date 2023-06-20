package Exercise;

import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = { 10,20,20,20,50,60,70,80,90,90,110,120};
        int size= arr.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                //System.out.print(" i " + arr[i]);
                //System.out.print(" j " + arr[j]);
                if(arr[i]!=arr[j])
                {
                    for(int k=0;k<size;k++)
                    {
                        arr[k]=arr[i];
                        System.out.println(arr[k]);
                        break;
                    }
                }
            }
        }
    }
}

