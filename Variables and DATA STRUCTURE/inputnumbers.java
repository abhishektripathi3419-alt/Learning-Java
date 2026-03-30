import java.util.*;
public class inputnumbers {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       // String input = sc.next();
       // System.out.println(input);

       // String name = sc.nextLine();
       // System.out.println(name);

       //int number = sc.nextInt();
        //System.out.println(number); 

       //float price  = sc.nextFloat();
      // System.out.println(price);

       //byte digit = sc.nextByte();
       //System.out.println(digit);

       //double value = sc.nextDouble();
       //System.out.println(value);
       
        //boolean status = sc.nextBoolean();
        //System.out.println(status);

        //short num = sc.nextShort();
        //System.out.println(num);

        // long bigNum = sc.nextLong();
        // System.out.println(bigNum);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);

        //Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);

        






    }
}
