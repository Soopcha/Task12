package Testik;

public class Testik2 {
    public static void main(String[] args) {
        int n = 5;
        char[] charBox = new char[2 * n];
        System.out.println(printParenthesis(charBox, 0, n, 0, 0, null));
    }

    //Доделать тут
    static String printParenthesis(char[] str, int pos, int n, int open, int close, String strFinish) {
        if (close == n) {
            for (char c : str) strFinish+= c + "    ";
            return strFinish;
        } else {
            if (open > close) {
                str[pos] = ')';
                printParenthesis(str, pos + 1, n, open, close + 1, strFinish);
            }
            if (open < n) {
                str[pos] = '(';
                printParenthesis(str, pos + 1, n, open + 1, close, strFinish);
            }
        }
        return strFinish;
    }

    /*
    static void printParenthesis(char[] str, int pos, int n, int open, int close) {
        if (close == n) {
            for (char c : str) System.out.print(c);
            System.out.println();
            return;
        } else {
            if (open > close) {
                str[pos] = ')';
                printParenthesis(str, pos + 1, n, open, close + 1);
            }
            if (open < n) {
                str[pos] = '(';
                printParenthesis(str, pos + 1, n, open + 1, close);
            }
        }
    }
    */

}
