public class ImmutableString {

    public static void main(String[] args) {

        //  "Hello" exists on the string pool, s1 gets a reference to it
        String s1 = "Hello";  
 
        /*
        The following code does not change the value of "Hello" on the
        string pool, it creates a new string with value of "Hello World" and
        passes the reference to this new string to s1;
 
        "Hello World" not added to the string pool unless intern() called
        */
        s1 = s1 + " World";

        // It prints - Hello World
        System.out.println(s1);

        
        s1 = "Hello";
        s1.concat(" World");

        // It prints - Hello
        // Because any methods (concat in this case) operates on the String 
        // are actually creating new Strings and these new Strings need to be assigned to same 
        // variable (self-assignment) or to new variable
      
        System.out.println(s1);
    }
}
