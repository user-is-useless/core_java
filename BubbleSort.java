public class BubbleSort {
    public static void main(String[] args) {
        int []arr=new int[]{25,18,7,69,110,13};
        //for no. of iteration
        for (int i=0;i<arr.length-1;i++)
        {
            //for nth iteration shift the biggest element to the last position of the array
            //for yhe next iteration shift the biggest element to the last position - 1
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k:arr)
        {
            System.out.println(k);
        }
    }
}
