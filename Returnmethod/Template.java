package Returnmethod;

public class Template {

   void addition (int num1 , int num2){
       int total = num1 + num2;
       System.out.println( total);
}
    int subtraction (int num1, int num2){
       int total = num1 - num2;
         return total;

   }
    void multiplication (){
        int num1 =5;
        int num2 = 10;
        int total = num1 * num2;
        System.out.println( total);
    }
    String yourself(String name, int age, boolean maritalStatus){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("married: "+maritalStatus);
        return name;
    }




}

