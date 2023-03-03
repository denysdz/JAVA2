
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Main {

    private static char StrArray[ ] = {
            'Н', 'а', 'ц', 'і', 'о', 'н', 'а', 'л', 'ь', 'н', 'и', 'й', ' ',
            'л', 'і', 'с', 'о', 'т', 'е', 'х', 'н', 'і', 'ч', 'н', 'и', 'й', ' ',
            'у', 'н', 'і', 'в', 'е', 'р', 'с', 'и', 'т', 'е', 'т', ' ',
            'У', 'к', 'р', 'а', 'ї', 'н', 'и', ' ',
            'І', 'н', 'с', 'т', 'и', 'т', 'у', 'т', ' ', 'д', 'е', 'р', 'е', 'в', 'о', 'о', 'б', 'р', 'о', 'б', 'н', 'и', 'х', ' ', 'т', 'а', ' ', 'к', 'о', 'м', 'п', '\'', 'ю', 'т', 'е', 'р', 'н', 'и', 'х', ' ', 'т', 'е', 'х', 'н', 'о', 'л', 'о', 'г', 'і', 'й', ' ', 'т', 'а', ' ', 'д', 'и', 'з', 'а', 'й', 'н', 'у',
            ' ', 'І', 'С', 'Т', '-', '2', '1', '/', '1', ' ',
            'І', 'н', 'ф', 'о', 'р', 'м', 'а', 'ц', 'і', 'й', 'н', 'і', ' ', 'с', 'и', 'с', 'т', 'е', 'м', 'и', ' ',
            'т', 'а', ' ', 'т', 'е', 'х', 'н', 'о', 'л', 'о', 'г', 'і', 'ї'
    };

    public static void main(String[] args) {
            System.out.println("Hello world!");
            String str1 = new String(StrArray, 118, 34);
            String str2 = "";
             for (int i = str1.length( ) -1; i >= 0; i--)
                 str2 = str2+str1.charAt(i);
            System.out.println(str2);
            String str3 = str1.toUpperCase();
            if (str1.equals(str3)) {
                System.out.println("Equals");
            }
            System.out.println(new String(StrArray, 47, 61));
            String str4 = str1 + " " + str3;
            System.out.println(str1.indexOf('і') + " " +str1.lastIndexOf('і'));
            StringBuffer buffer1 = new StringBuffer("Джугалик Денис Ігорович 06 березня 2004");
            buffer1.delete(23, 33);
            System.out.println(buffer1);
            buffer1.append(" Львів");
            System.out.println(buffer1);
            buffer1.insert(30, "чоловіча ");
            System.out.println(buffer1);
            int length = buffer1.toString().length();
            int lengthInBytes = buffer1.toString().getBytes(StandardCharsets.UTF_8).length;
            System.out.println(length + " / " + lengthInBytes);
            buffer1 = buffer1.delete(24, buffer1.length());
            System.out.println(buffer1);
            StringBuffer buffer2 = new StringBuffer(buffer1);
            buffer2.reverse();
            System.out.println(buffer2);
    }


}