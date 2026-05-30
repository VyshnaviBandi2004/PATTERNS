package ARRAYS;

public class BuySell {
    public static void main(String args[]){
        int a[]={10,7,5,8,11,9};
        // int res=StockBuyandSell(a);
        int res=optimal(a);
        System.out.println(res);
    }
    static int StockBuyandSell(int a[]){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int profit=a[j]-a[i];
                if(profit>max) max=profit;
            }
        }
        return max;
    }
    static int optimal(int a[]){
        int MaxPro=0;
        int cp=a[0];
        for(int i=1;i<a.length;i++){
            int profit=a[i]-cp;
            if(profit>MaxPro) MaxPro=profit;
            if(a[i]<cp) cp=a[i];
        }
        return MaxPro;
    }
}
