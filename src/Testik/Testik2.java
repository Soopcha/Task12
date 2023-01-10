package Testik;


//Это просто для того, чтобы чекнуть как что работает БЕЗ интерфейса (можно удалить но оставлю)
public class Testik2 {
    public static void main(String[] args) {
        System.out.println(Answer(6));
    }

    public static String strFinish = "";

    static String Answer(int x) {
        if (x % 2 == 0 && x >= 2) {
            strFinish = "";
            char[] charBox = new char[x];
            printSkobki(charBox, 0, x / 2, 0, 0);
            return strFinish;
        } else {
            return "Ваше число нечётное или меньше 2";
        }
    }

    //Доделать тут
    static void printSkobki(char[] str, int pos, int n, int open, int close) {
        if (close == n) {
            for (char c : str) strFinish += c;
            strFinish += " ";
        } else {
            if (open > close) {
                str[pos] = ')';
                printSkobki(str, pos + 1, n, open, close + 1);
            }
            if (open < n) {
                str[pos] = '(';
                printSkobki(str, pos + 1, n, open + 1, close);
            }
        }
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
