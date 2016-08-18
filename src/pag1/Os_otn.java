package pag1;

/**
 * Операции,отношения и логические операции
 */
public class Os_otn {

    public static void main(String args[]) {
        int a = 1, c = 2;
        boolean b, b1, b2, b3, b4, b5, b6;
        b = a > c; //больше
        b1 = a < c; //меньше
        b2 = a == c; //равно
        b3 = a >= c; //больше и равно
        b4 = a <= c; //меньше и равно
        b5 = a != c; //не равно
        System.out.println("a=1;c=2");
        System.out.println("a > c "+ b);
        System.out.println("a < c "+b1);
        System.out.println("a == c "+b2);
        System.out.println("a >= c "+b3);
        System.out.println("a <= c "+b4);
        System.out.println("a != c "+b5);

    }

}
