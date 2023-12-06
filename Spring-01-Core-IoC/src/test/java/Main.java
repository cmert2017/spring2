public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = 0;

        while (a < b) {
            if (a % 2 == 0)
                c = c + a;
            else
                c = c + b;

            a++;
            b--;
        }
    }


}
