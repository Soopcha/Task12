package Classes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


import static javax.swing.UIManager.getString;

public class MainLogic {
/*
Число правильных скобочных структур длины 6 равно 5: ()()(), (())(), ()(()), ((())), (()()).
Напишите рекурсивную программу генерации всех правильных скобочных структур
длины 2n.
Указание: Правильная скобочная структура минимальной длины «()». Структуры
большей длины получаются из структур меньшей длины, двумя способами:
 если меньшую структуру взять в скобки,
 если две меньших структуры записать последовательно.

те ()()()()()()() ((((((()))))))  ()(())(())()()
 */




        /*
            public static String readStringFromFile(String filename) throws FileNotFoundException {
                Scanner scanner = new Scanner(new File(filename));
                String s = scanner.nextLine();
                scanner.close();
                return s;
            }
            */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = listOfAllInterrogativeSentences("В лингвистике термин «текст» используется в широком значении, включая и образцы устной речи. Восприятие текста изучается в рамках лингвистики текста и психолингвистики. Так, например, И. Р. Гальперин определяет текст следующим образом: «Это письменное сообщение, объективированное в виде письменного документа, состоящее из ряда высказываний, объединённых разными типами лексической, грамматической и");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> listOfAllInterrogativeSentences(String str) { //возвращяет лист вопросов
        List<String> list = new ArrayList<>();
        for (String s : list) {
            list = List.of(s.split("[.!?]"));// .of вместо задачи new и  add те сократили
            // в [] мы сунули сразу несколько разделителей
        }

        //list = List.of(str.split("!")); // \\ нужны для того, чтобы джава не думала что мы команду какуе-то прописать хотим а просто символ
        return list;
    }

    //    .\input.txt .\output.txt
    public static void readAndWriteMethod(InputArgs inputArgs) throws IOException {
        String str = ClassesForInAndOut.readFile(inputArgs.getInputFile());
        int dlinaPosledovatelnosty= Integer.parseInt(str);
        String answer = MainLogic.getAnswer(dlinaPosledovatelnosty);
        ClassesForInAndOut.writeFile(inputArgs.getOutputFile(), answer);
    }

    public static void printSuccessMessage(int num) {
        if (num == 0) {
            System.out.println("Основная программа выполнена.");
        } else {
            System.out.println("Тест " + num + " выполнен успешно.");
        }
        System.out.println();
    }

    public static String getAnswer(int dlinaPosledovatelnosty) {        
        String finishStr = null;

        return finishStr;
    }

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

}



    /* public static String getAnswer(String str){
        String string = " ";
        Pattern pattern1 = Pattern.compile("[a-zA-Zа-яА-Я]*[0-9]*[a-zA-Z]+[а-яА-Я]+[a-zA-Zа-яА-Я]*");
        Pattern pattern2 = Pattern.compile("[a-zA-Zа-яА-Я]*[a-zA-Z]+[а-яА-Я]+[0-9]*[a-zA-Zа-яА-Я]*");
        Pattern pattern3 = Pattern.compile("[a-zA-Zа-яА-Я]*[а-яА-Я]+[0-9]*[a-zA-Z]+[a-zA-Zа-яА-Я]*");
        Pattern pattern4 = Pattern.compile("[a-zA-Zа-яА-Я]*[0-9]*[а-яА-Я]+[a-zA-Z]+[a-zA-Zа-яА-Я]*");
        Pattern pattern5 = Pattern.compile("[a-zA-Zа-яА-Я]*[a-zA-Z]+[0-9]*[а-яА-Я]+[a-zA-Zа-яА-Я]*");
        Pattern pattern6 = Pattern.compile("[a-zA-Zа-яА-Я]*[а-яА-Я]+[a-zA-Z]+[0-9]*[a-zA-Zа-яА-Я]*");
        String[] parts = str.split("[,.;:!?()\\s]+");
        for (String p : parts){
            if ((pattern1.matcher(p).matches() | pattern2.matcher(p).matches() | pattern3.matcher(p).matches() | pattern4.matcher(p).matches() | pattern5.matcher(p).matches() | pattern6.matcher(p).matches())){
                string += "[" + p + "] ";
//            }else{
//                string += "kek ";
            }
        }
        return string.trim().replace(" ", ", ");
    }



     */
