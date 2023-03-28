// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd.
// Результат: a4b3cd2

package WORK;

/**
 * program2
 */
public class program2 {

   public static void main(String[] args) {
    
   }
   static String ex1(String s){
    /*
    Напишите метод, который сжимает строку.
    Пример: вход aaaabbbcdd.
    Результат: a4b3cd2
     */
    int count = 1;
    StringBuilder stringBuilder = new StringBuilder();
    char[] arr = s.toCharArray();
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) == s.charAt(i-1)){
            count++;
        } else {
            stringBuilder.append(s.charAt(i-1));
            if (count != 1){
                stringBuilder.append(count);
            }
            count = 1;
        }
    }
    stringBuilder.append(s.charAt(s.length()-1));
    if (count != 1){
        stringBuilder.append(count);
    }
    return stringBuilder.toString();

}
}

        
        