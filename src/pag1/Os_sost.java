package pag1;

/**
 * Операции,обьединение арифметических операций с операцией присваивания
 */
public class Os_sost {

    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 4;
        int d;
        //a=a+2; увелечение переменной a на 2
        a += 2; // присваивание переменной a увеличение на 2
//        b=b*2;
        b *= 2;
//        c=c/2;
        c/=2;
        System.out.println(a + "\n" + b+ "\n"+c);
    }

}
