package habib;

public class Variables {

   static int number = 10;
   String text = "Hello World";

    public static void main(String[] args) {
        int localVar = 10;
        System.out.println("Local Variable Value : " +localVar);
        System.out.println(number);

        //Object Syntax : ClassName ObjectName = new ClassName();
        Variables obj = new Variables();
        System.out.println(obj.text);
    }
}



