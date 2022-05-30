package statickey;

public class Persondata {

    static String name;
     int height;
      int weight;


      // STATIC METHOD (STATIC METHODS CAN USE ONLY VARIABLES)
    public static void stand(){
       String name = "max";
       int height = 6;
       int weight = 130;
        System.out.println("Pls dance on  hip hop while standing.");
    }
//NON-STATIC METHOD (BELONGS TO OBJECT)
    public void sit(){
        System.out.println("Pls sing lullaby while sitting.");
        String name = "Ron";
        int height = 7;
        int weight = 150;

    }

}
