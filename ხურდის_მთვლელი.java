public class ხურდის_მთვლელი {
    class coin {

        static int minCoins(int coins[], int m, int V) {

            if (V == 0) return 0;
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                if (coins[i] <= V) {
                    int sub_res = minCoins(coins, m, V - coins[i]);
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                        res = sub_res + 1;
                }
            }
            return res;
        }
    }
    public static void main(String args[])
    {
        int coins[] = {1, 5, 10, 20};
        int m = coins.length;
        int V = 50;
        System.out.println("Minimum coins required is "+ coin.minCoins(coins, m, V) );
    }

}
