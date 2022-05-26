public class Happy {
    public static void main(String[] args) {
        System.out.println("Hello Students");
        int t = 10;
        double y = 10.5;
        float f = 1.46573869F;
        long l = 174865374809L;
        char c = '&';
        System.out.println(c);
        String str = "hello world";

        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("world"));
        System.out.println(str.split("hello"));
        String firstName = "jayshree";
        String lastName = "Visht";
        int age = 40;
        int ageplustwo = 2;

        System.out.println(firstName + "  " + lastName + age);
        System.out.println(str.concat("jayshree"));
        System.out.println(str.compareTo("visit"));
        //java logic arithmetic    +,
        System.out.println(10 != 10);
        System.out.println(10 == 10 || 10 > 11);
        System.out.println(10 == 10 && 10 > 11);

        String sonName = "Romir singh Gussain  ";
        int sonage = 11;
        String daughtersName = "Rhyma Gussain  ";
        int daughterage = 4;
        boolean kids = Boolean.parseBoolean("   true");
        String feelings = "   I love my kids so much";
        System.out.print(sonName+daughtersName+sonage
                +"  "+daughterage+kids+feelings);

    }


}
