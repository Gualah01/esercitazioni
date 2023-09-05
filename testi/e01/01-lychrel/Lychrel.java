import java.util.Scanner;

/**
 * Lychrel 
 * Questa classe consente, dato un numero(in base dieci) in ingresso, eseguire una o più trasformazioni con 
 * l'obiettivo di ottenere un numero palindromo. I numeri per cui ciò non accade sono detti numeri di Lychrel.
 */
public class Lychrel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        while (true) {
            System.out.println(n);
            if (isPalindrome(n)) {
                break;
            }
            n = trasformazione(n);
        }
    }

    /**
     * @param n
     * @return n a cui viene sommato il numero ottenuto scrivendo le sue cifre dall'ultima alla prima 
     */
    public static int trasformazione(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();        
        return n + Integer.parseInt(sb.toString());
    }

    /**
     * @param n
     * @return true se n è palindromo
     * @return false se n non è palindromo
     */
    public static boolean isPalindrome(int n){
        char[] chars = ("" + n).toCharArray();
        int fst = 0;
        int lst = chars.length - 1;
        while (true) {
            if (chars[fst] != chars[lst]) {
                return false;
            }
            if (fst == lst || lst-fst == 1) {
                return true;
            }
            fst++;
            lst--;
        }   
    }

}