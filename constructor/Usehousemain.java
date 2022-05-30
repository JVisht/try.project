package constructor;

  public class Usehousemain {
    public static void main (String [] args){

   Housetemp myHouse = new Housetemp("The Villa", 9611);

      myHouse.livingRoom();
      myHouse.bedroom();
      myHouse.Kitchen();
      myHouse.bathroom();
        System.out.println(myHouse.address);
        System.out.println(myHouse.zipcode);
        System.out.println(myHouse.apt);

        Housetemp ourhouse =new Housetemp("The Villa",9611 );

    }



}
