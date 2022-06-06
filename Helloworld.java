import javax.swing.JOptionPane; // Import JOptionPane class

public class Helloworld {

   public static void main(String[]args) {
   
   String a = "Hello World? ";
   String b = "How old are you? ";
   String c = a + b + "What is your name? ";
   System.out.println(c);
   
   int e = 9;
   int f = e + 13;
   System.out.println(f);
  
   String name;
   
   name = JOptionPane.showInputDialog ("What is your name?:");
   
   String d = "Hello ";
   
   System.out.println(d + name);
   }
   }
   