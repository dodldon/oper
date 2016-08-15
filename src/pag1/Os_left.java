package pag1;

/**
 * Операции, поразрядные сдвига разрядов 
 */
public class Os_left {

    public static void main(String args[]) {
        int a = 4, i, x, b;

        //4 это 0100
        i = a << 2;  //сдвиг на два разряда влево 1000
       // i <<= 2 // составные поразрядные 
        x = a >> 2;  // сдвиг на два разряда вправо 0000
       // x >>= 2
        b = a >>> 2; //беззнаковый сдвиг на два разряда
        
        System.out.println(" a= " + a+" =0100");

        System.out.println("a << 2 = " + i+" =10000");
        System.out.println("a >> 2 = " + x+" =0001");
        System.out.println("a >>> 2 = " + b+" =0001");

    }
}
