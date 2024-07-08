//Bubble Sort............................................

// public class sorting{

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]  = {3,6,2,8,1,9};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         printarr(arr);
//     }
// }



//Selection Sort..........................................

// public class sorting{

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]  = {3,6,2,8,1,9};

//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;

//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printarr(arr);
//     }
// }



//Insertion Sort..............................................

// public class sorting{

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]  = {3,6,2,8,1,9};

//         for(int i=1;i<arr.length;i++){
//             int current  = arr[i];
//             int j = i-1;
//             while (j>=0 && current<arr[j]) {
//                 arr[j+1]=arr[j];
//                 j--;    
//             }
//             arr[j+1]=current;
//         }
//         printarr(arr);
//     }
// }




//Merge Sort...............................................

// public class sorting{

//     public static void merge(int arr[], int mid,int si,int ei){

//         int merged[] = new int[ei-si+1];
//         int idx1 = si;
//         int idx2 = mid+1;
//         int x = 0;

//         while (idx1<=mid && idx2 <=ei) {
//             if(arr[idx1]<=arr[idx2]){
//                 merged[x++]=arr[idx1++];
//             }
//             else{
//                 merged[x++]=arr[idx2++];
//             }
//         }

//         while (idx1<=mid) {
//             merged[x++]=arr[idx1++];

//         }   

//         while (idx2<=ei) {
//             merged[x++]=arr[idx2++];

//         }   

//         for(int i=0,j=si; i<merged.length; i++,j++){
//             arr[j]=merged[i];
//         }
            
//     }

//     public static void devide(int arr[],int si,int ei){

//         if(si>=ei){
//             return;
//         }

//         int mid  = si+(ei-si)/2;
//         devide(arr, si, mid);
//         devide(arr, mid+1, ei);
//         merge(arr,mid,si,ei);
        
//     }
//     public static void main(String[]args){
//         int arr[] = {5,3,8,6,2,9};
//         int n  = arr.length;

//         devide(arr, 0, n-1);


//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
// }



//Quick Sort...................................................


public class sorting{

    public static int partision(int arr[],int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        i++;
        int temp = arr[i];
        arr[i]=pivot;
        pivot=temp;
        return i;
        
    }
    public static void quickSort(int arr[], int low,int high){
        if(low<high){
            
            int pidx = partision( arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[]args){
        int[] arr = {6,3,8,7,4,9};
        int n = arr.length;

        quickSort(arr,0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}