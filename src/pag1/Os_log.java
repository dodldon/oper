package pag1;

/**
 * Операции, логические
 */
public class Os_log {

    public static void main(String args[]) {
        
        boolean a = true, b = false, c, d, e, i, f, g, x, y, z, s, k,t;
        i = !a;//НЕ
        c = a & b; // И
        d = a | b; // ИЛИ
        e = a ^ b; // ИЛИ-НЕ
        f = a == b; //равенство
        g = a != b; //неравенство
        k = a || b; //укороченное ИЛИ
        x = a && b; //укороченное И
        a |= a;//ИЛИ с присваиванием
        b &= b; //И с присваиванием
        a ^= b; // ИЛИ-НЕ с присваиванием
        s = a?b:a; //тернарный оператор (if-then-else)
        t=a=b;
        System.out.println(s);

    }

}
