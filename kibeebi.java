public class kibeebi {
    class stairs {

        static int asvlis_variantebi(int n) {
            if (n <= 1)
                return n;
            return asvlis_variantebi(n - 1) + asvlis_variantebi(n - 2);
        }


        static int countWays(int s) {
            return asvlis_variantebi(s + 1);
        }

    }
        public static void main(String args[])
        {
            int s = 1;
            System.out.println("asvlis variantebi  = " + stairs.countWays(s));
        }


}
