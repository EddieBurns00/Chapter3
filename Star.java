
/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star
{
   public static void main (String[]args) {
      starA();
      System.out.print("\n");
      starB();
      System.out.print("\n");
      starC();
      System.out.print("\n");
      starD();
       }
   
   
   public static void starA() {
       int stars = 10;
       for (int x = 0; x < 10; x++) {
           for (int y = 0; y < stars; y++) {
               System.out.print("*");
               
               
               
           }
           stars--;
           System.out.println(" ");
       }
       
       
   }
   
   
   public static void starB() {
       int stars = 1;
       int spaces = 9;
       for (int x = 0; x < 10; x++) {
           for (int y = spaces; y > spaces; y--) {
               System.out.print(" ");
            }
           for (int z = stars; z > 0; z--) {
               System.out.print("*");
               
               
               
            }  
           stars+=1;
           spaces-=1;
           System.out.print("\n");
       }
       
       
   }
   
   public static void starC() {
       int stars = 10;
       int spaces = 0;
       for (int x = 0; x < 10; x++) {
           for (int y = spaces; y > spaces; y--) {
               System.out.print(" ");
            }
           for (int z = stars; z > 0; z--) {
               System.out.print("*");
               
               
               
            }  
           stars-=1;
           spaces+=1;
           System.out.print("\n");
       }
       
       
   }
   
   public static void starD() {
       int stars = 1;
       int spaces = 4;
       for (int x = 0; x < 5; x++) {
           for (int y = spaces; y > 0; --y) {
               System.out.print(" ");
            }
           for (int z = stars; z > 0; --z) {
               System.out.print("*");
               
               
               
            }
           for (int i = spaces; i > spaces; --i) {
               System.out.print(" ");
            }
           stars+=2;
           spaces-=1;
           System.out.print("\n");
       }
       int newstars = 4;
       int newspaces = 1;
       for (int x = 0; x < 5; x++) {
           for (int y = newspaces; y > 0; --y) {
               System.out.print(" ");
            }
           for (int z = newstars; z > 0; --z) {
               System.out.print("*");
               
               
               
            }
           for (int i = newspaces; i > spaces; --i) {
               System.out.print(" ");
            }
           stars-=2;
           spaces+=1;
           System.out.print("\n");
       }
    }
}
