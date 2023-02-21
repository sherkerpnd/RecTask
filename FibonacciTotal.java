class FibonacciTotal{
    public static void main(String[] args){
        System.out.println(Solution.fibonacciTotal(5));
    }
}
class Solution{
    public static int fibonacciTotal(int n){
        return fibonacciTotalHelper(0,1,n,0);
    }
    public static int fibonacciTotalHelper(int fn1, int fn2, int count, int total){
        if(count <= 0)return total;

        return fibonacciTotalHelper(fn2,fn1+fn2,count-1,total+fn2);
    }
}