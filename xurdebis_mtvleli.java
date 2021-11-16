public class xurdebis_mtvleli { class coin {
    //მაგრად დამეხმარა გოოგლი განსაკუთრებით ბოლო სამ დავალებაში თითქმის გადავიწერე რომ არ მოვიტყუო ბოლო კოდიც ვნახე მაგრამ ეგ რომ დამეწერა სრულად უნდა გადმეკოპირებინა ყველაფერი თან
    // ძნელი არის და მარტო გადმოკოპირება ხომ არ არის ამ კოდებსაც უნდა დავუჯდე და გავარჩიო თავიდან ბოლომდე გაუგებარი ნაწიელბი და ეხლა ისიც რომ დამეწერა ჯერ ბევრი გადმოვიდოდა და მერე
    // გადმოკოპირება არ მომწონს მინც და მანც თუ გამოსავალი არ მრჩება მერე მივმართავ მაგ უკიდურეს და გამოსადეგარ ხერხს :)

    static int minCoins(int coins[], int m, int N) {

        if (N == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (coins[i] <= N) {
                int sub_res = minCoins(coins, m, N - coins[i]);
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
        int N = 50;
        System.out.println("xurdis minimaluri raodenoba  "+ xurdebis_mtvleli.coin.minCoins(coins, m, N) );
    }

}
