// Напишите метод, который составит строку, состоящую из 100 повторений слова
// TEST и метод, который запишет эту строку в простой текстовый
// файл, обработайте исключения.

package WORK;

/**
 * program4
 */
public class program4 {

    public static void main(String[] args) {
        static void ex3(String s, int n){
            /*
            Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
            который запишет эту строку в простой текстовый файл, обработайте исключения.
             */
            String filePath = "f/f/f/f/ftest.txt";
            String s1 = repeatString(s, n);
            writeToFile(s1, filePath);
    }
    static void ex3(String s, int n){
        /*
        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        String filePath = "f/f/f/f/ftest.txt";
        String s1 = repeatString(s, n);
        writeToFile(s1, filePath);
    }
    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}