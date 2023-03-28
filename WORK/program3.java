// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

// Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.


package WORK;

public class program3 {
    public static void main(String[] args) {
        
        static boolean ex2(String s1){
            /*
            Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
            (возвращает boolean значение).
            Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
             */
            StringBuilder stringBuilder = new StringBuilder(s1);
            stringBuilder = stringBuilder.reverse();
            if (s1.equals(stringBuilder.toString())){
                return true;
            } else {
                return false;
            }
        }
    }
}
