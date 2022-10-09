public class bubblesort {

    public void printArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void sort(int [] arr){
        int n=arr.length;
        boolean isSwapped;
        //each pass
        for(int i=0;i<n-1;i++){
            isSwapped=false; //to check if array is sorted at some point of iteration
            //inner iteration for each pass
            for(int j=0;j<n-i-1;j++){
                //swapping 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true; //swap flag is assigned true if swap is performed
                }
            }
            //checking after each iteration or inner iteration if swap was performed or not 
            //if swapping is not performed that means array is sorted at this iteration
            //so then we break out of outer for loop (or algorithm)
            if(isSwapped==false){
                break;
            }  
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{5,1,2,9,10};
        bubblesort bs=new bubblesort();
        System.out.println("Array before bubble sorting : ");
        bs.printArray(arr);

        bs.sort(arr);

        System.out.println("Array after bubble sorting : ");
        bs.printArray(arr);
    }
}
