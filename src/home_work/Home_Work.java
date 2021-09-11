package home_work;
import java.util.Scanner;

public class Home_Work {
 
    public static void main(String[] args) {
        /*Задача 1
        Пользователь вводит трехзначное число.
        Найдите: Число единиц, десятков, cумму цифр.
        Для решения можно использовать арифметический оператор % -остаток от деления.
        */
      
        /*
        System.out.println("Ведите трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int units = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num /100;
        
        int summ = units + tens + hundreds;
        
        System.out.println("В заданном Вами числе единиц " + units);
        System.out.println("В заданном Вами числе десятков " + tens);
        System.out.println("В заданном Вами числе сотен " + hundreds);
        System.out.println("Сумма всех цифр равна " + summ );
        */
        
        
        /*Задача 2
        Напишите программу, которая из консоли считывает градусы Цельсия в
        переменную double, затем конвертирует в градусы Фаренгейта и отображает
        результат. Формула для конвертации следующая:

         fahrenheit = (9 / 5) * celsius + 32
        (0 °C × 9/5) + 32 = 32 °F
        */
         
       
         
        System.out.println("Введите значение температуры в градусах цельсия:");
        Scanner temp = new Scanner(System.in); //объявили Scanner temp
        double cels = temp.nextDouble(); //считали значение double cels
        double far = cels * 9 / 5 + 32; //высчитали значение double far
        
        System.out.println("Если температура в градусаз Цельсия равна: " + cels + ", то в градусах Фарингейта это будет: " + far );

        
    }
    
}
