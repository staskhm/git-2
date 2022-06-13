import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a, b, c, d, e;
            String[] data = reader.readLine().replaceAll("", "").split("");
            a = data[0];
            b = data[1];
            c = data[2];


            numbers k = new numbers();
            numbers h= new numbers();
            numbers m= new numbers();
            int s;
            int f;

            k.num = Integer.parseInt(a);
            h.num = Integer.parseInt(c);

            System.out.println("Hello");

           if (b.equals("+") ) {
               System.out.println("Result for two numbers is: ");
            System.out.println(f = k.num + h.num);
        } else if (b.equals("-") ) {
               System.out.println("Result for two numbers is: ");
            System.out.println(f = k.num - h.num);
        } else if (b.equals("*") ) {
               System.out.println("Result for two numbers is: ");
            System.out.println( f = k.num * h.num);
            } else if (b.equals("/") ) {
               System.out.println("Result for two numbers is: ");
                System.out.println(f = k.num / h.num); }

            d = data[3];
            e = data[4];
            m.num = Integer.parseInt(e);

             if (b.equals("+") && d.equals("-") ) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num + h.num - m.num);
        } else if (b.equals("+") && d.equals("*")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num + h.num * m.num);
        } else if (b.equals("+") && d.equals("/")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num + h.num / m.num);
        } else if (b.equals("+") && d.equals("+")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num + h.num + m.num);

        } else if (b.equals("-") && d.equals("*")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num - h.num * m.num);
        } else if (b.equals("-") && d.equals("+")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num - h.num + m.num);
        } else if (b.equals("-") && d.equals("/")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num - h.num / m.num);
        } else if (b.equals("-") && d.equals("-")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num - h.num - m.num);

        } else if (b.equals("/") && d.equals("*")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num / h.num * m.num);
        } else if (b.equals("/") && d.equals("+")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num / h.num + m.num);
        } else if (b.equals("/") && d.equals("/")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num / h.num / m.num);
        } else if (b.equals("/") && d.equals("-")) {
                 System.out.println("Result for three number is");
            System.out.println(s = k.num / h.num - m.num);

             } else if (b.equals("*") && d.equals("*")) {
                 System.out.println("Result for three number is");
                 System.out.println(s = k.num * h.num * m.num);
             } else if (b.equals("*") && d.equals("+")) {
                 System.out.println("Result for three number is");
                 System.out.println(s = k.num * h.num + m.num);
             } else if (b.equals("*") && d.equals("/")) {
                 System.out.println("Result for three number is");
                 System.out.println(s = k.num * h.num / m.num);
             } else if (b.equals("*") && d.equals("-")) {
                 System.out.println("Result for three number is");
                 System.out.println(s = k.num * h.num - m.num);


            }


} }
