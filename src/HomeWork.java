
public class HomeWork {

    public static void main(String[] args) {
        //задание 2
        byte b = 16;
        System.out.println(b);

        short s = 290;
        System.out.println(s);

        int i = 27;
        System.out.println(i);

        long l = 1993;
        System.out.println(l);

        float f = 1.2f;
        System.out.println(f);

        double d = 2.4;
        System.out.println(d);

        char c = 'A';
        System.out.println(c);

        boolean b1 = false;
        System.out.println(b1);
        //Задание 3
        System.out.println(calculate(3, 15, 76, 2));
        //Задание 4
        System.out.println(taskFour(5, 14));
        //Задание 6
        System.out.println(isNegative(-1));
        //Задание 7
        System.out.println(hello("Александр"));
    }


    public static int calculate (int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean taskFour (int a, int b){
        return  a + b >= 10 && a + b <= 20;
    }

    //Задание 5
    public static void positive (int a){
        if (a >= 0) {
           System.out.println(a + "Положительное число");
        } else {
            System.out.println(a +"Отрицательное число");
        }
    }

    public static boolean isNegative (int a){
        if (a < 0){
            return true;
        } else {
            return false;
        }

    }

    public static String hello (String name){
        return ("Привет, " + name);
    }
    //Задание 7 альтернатива
    public static void greetings(String name){

        System.out.println("Привет, " + name);
    }
}
