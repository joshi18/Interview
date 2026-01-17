package src.DSA.DP.StocksToBuyAndSell;

public class DP35BestTimeTobuyandSell {
    public static void main(String[] args) {
        // this is not a dp problem
        

        int[] arr = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        System.out.println("Solving dp problems");
        int mini = arr[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(cost, profit);
            mini = Math.min(mini, arr[i]);
        }
        System.out.println(profit);
    }
}
