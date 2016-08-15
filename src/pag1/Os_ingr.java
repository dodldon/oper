package pag1;

/**
 * Операции, инкримент, декримент
 */
public class Os_ingr {

    public static void main(String args[]) {
        int a = 1;
// инкримент в постфискной форме 
        int c = a++;//увеличения "c" нет т.к "a" извлекается до инкримента
// инкримент в префиксной форме
        System.out.println("a=" + a);
        int d = ++a;//увеличения есть
        System.out.println("c=" + c + "\n" + "d=" + d);
// декремент постфискный      
        int b = a--;//уменьшения нет т.к "a" извлекается до декремента
// декремент префиксный        
        int e = --a;//уменьшения есть
        System.out.println("b=" + b + "\n" + "e=" + e);
    }

}
