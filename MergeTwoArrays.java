
public class MergeTwoArrays{
    public static void main(String args[]){
        int a[]={-5,-2,4,5};  int n1=a.length;
        int b[]={-3,1,8};  int n2=b.length;
        MergeTwoSortedArraysWithOutExtraSpace(a, b, n1, n2);
        for(int x: a) System.out.print(x+" ");
        for(int y:b) System.out.print(y+" ");
    }
    static void MergeTwoSortedArraysWithOutExtraSpace(int a[],int b[],int n1,int n2){
        int i=n1-1;
        int j=0;
        while(i>=0 && j<n2){
            if(a[i]>b[j]){
                swap(a,b,i,j);
                i--;
                j++;
            }
            else{
                break;
            }
        }
        sort(a);
        sort(b);
    }
    static void swap(int a[],int b[],int left,int right){
        int temp=a[left];
        a[left]=b[right];
        b[right]=temp;
    }
    static void sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
}