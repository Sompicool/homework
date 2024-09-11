public class Main {
    public static void main(String[] args) {
        byte a = 6;
        {
            System.out.println(a);
        }

        short d = 30000;
        {
            System.out.println(d);
        }

        int b = 3;
        {
            System.out.println(b);
        }
        long c = 1231231;
        {
            System.out.println(c);
        }
        float v = 3.5f + 100;
        {
            System.out.println(v);
        }
        double n = 1.25;
        {
            System.out.println(n);
        }
        char mChar = 'a';
        {
            System.out.println(mChar);
        }
        boolean mBolean = false;
        {
            System.out.println(mBolean);
        }

        int ab = 2;
        int ad = 3;
        int sum = ab + ad;
        String summ;
        summ = "Сложение: ";
        System.out.println(summ + sum);
        int product = ab * ad;
        String product1;
        product1 = "Умножение: ";
        System.out.println(product1 + product);
        int difference = ad - ab;
        String difference1 = "Вычитание: ";
        System.out.println(difference1 + difference);
        int quotient = ad / ab;
        String quotient1 = "Деление: ";
        System.out.println(quotient1 + quotient);
        int remainder = ab % ad;
        String y;
        y = "Остаток: ";
        System.out.println(y + remainder);




    }

}


