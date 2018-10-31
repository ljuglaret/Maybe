import java.util.Scanner;
/**
    
 entierPair : Int -> Maybe Int
 
 */
public class Main
{

    
    public static boolean estChiffre (String str){
        boolean rep = true;
        char[] chars = str.toCharArray();
        for (char e : chars){
            if (!Character.isDigit(e)) {
                rep = false;
            }
        }
        return rep;
    }
    
    public static Maybe estEntier(String str){
          Maybe entier;
    if ( estChiffre (str)) {
           Just entierstr = new Just(Integer.parseInt (str));
            entier = entierstr;
        }
        else {
            Nothing entierPairn = new Nothing();
            entier = entierPairn;
            
        }
        return entier;
    }
    
    public static void test(String str1, String str2){
    
       if ((estEntier(str1) instanceof Just) && (estEntier(str2) instanceof Just)) {
           System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        }
      
       else {
        System.out.println (" rien ");}
    }

    
    
    static public void main (String []  args) {
   
       /**

       divparZero(6,3);
       divparZero(4,0);
       Scanner sc = new Scanner (System.in);
       int x  = sc.nextInt();
       */
       test ("8","15");
       test("okoñk" ,"12");
       test("23","kj");
}
}