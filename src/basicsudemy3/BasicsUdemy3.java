
package basicsudemy3;

import java.util.Locale;
import java.util.Scanner;


public class BasicsUdemy3 {

    
    public static void main(String[] args) {
     /*
Ask for a real number that represents a price and show
the price with IVA. IVA is 21%.
     */
     
    
        Scanner sc = new Scanner (System.in);
     sc.useLocale(Locale.US); //Esto es para que pongamos el punto en el precio
        final double iva = 0.21;
        //final en una variable significa que no se puede modificar el valor en el programa
        //sirve para prevenir descuidos como que alguien toque la variable
        System.out.println("Hello! Write the price at wich you want to calculate the IVA");
        System.out.println("It has to be a number belonging to the real numbers :)");
        double priceWoIVA =sc.nextDouble();
    
     double priceIVA = priceWoIVA + (priceWoIVA * iva );
    // or double priceIVA = priceWoIVA * (1 + iva);
        System.out.println("The final price is $" + priceIVA);
    
        System.out.println("-----------------------------------");
        







//Ask for a number in seconds and indicate how many hours, minutes and seconds they are equivalent to.
        Scanner kb = new Scanner (System.in);
    
        final int SEC_HOUR = 3600; //Las ctes siempre en mayus
        
        System.out.println("Write the numbers of seconds that you want to calculate");
        int secs =kb.nextInt();
        
        int hours = secs/SEC_HOUR;
        int secs_left = secs % SEC_HOUR;
        
        int mins = secs_left / 60;
        
        secs = secs_left % 60;
        
        System.out.println("Those are " +hours+ " hour/s, " + mins + " minute/s, "+secs+ " second/s");
    
        
        
        System.out.println("-----------------------------------");

           
        
        
 //Ask for a word or phrase trough the console and invert it
        Scanner scan = new Scanner (System.in);
        scan.useDelimiter("\n");
        
        System.out.println("Write a phrase or a word please! ");
        String phrase = scan.next();
        
        String inverted = "";
        //La recorremos, necesito un char
        
        char character;
        for (int i = phrase.length()-1; i >=0; i--) {
            character = phrase.charAt(i);
            inverted += character; }
           
        System.out.println("Inverted: " + inverted);
            
        
        System.out.println("-----------------------------------");
        



//Generate 10 random numbers between 0 and 10.
        Math.random();
        
        int maximo =10;
        int minimo =1;
        
        // 0 * (10 - 1 + 10) + 1 = 1
        // 1 * (10 - 1 + 1 ) + 1 = 11
        
        int random; //Fuera de los bucles definimos las variables.
        for (int i = 0; i < 10; i++) {
            random =(int) (Math.random() * (maximo - minimo +1)+ (minimo));
            System.out.println(random);
        }
        
        
        
        
        
        System.out.println("-----------------------------------");
//Ask for a phrase trough the console and shows if it is palindrome.
//It is palindrome when it is read the same from left to righy as it id from right to left.
        Scanner sn = new Scanner (System.in);
        scan.useDelimiter("\n");
        
        System.out.println("Write a phrase or a word please! ");
        String frase = sn.next().trim();
        //Trim elimina los espacios de atras y de adelante, no los del medio de la frase.
        
        
        String invertido = "";
        //La recorremos, necesito un char
        
        char chara;
        for (int i = phrase.length()-1; i >=0; i--) {
            chara = phrase.charAt(i);
            inverted += chara; }
           
        if (frase.equals(invertido)){
            
            System.out.println("It is palindrome");
        }else {
            System.out.println("It isn't palindrome");
        }
        
        System.out.println("-----------------------------------");
        
        
        }
        
   
}
