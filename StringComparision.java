public class StringComparision {
    public static void main(String[] args) {
      
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";
        String s2 = "hello";
      
        // It prints true
        System.out.println((s1 == s2) ? "true" : "false"));
      
        String s3 = new String("hello");
        String s4 = new String("hello");

        // Now evaluates to false, strings do not point to same reference,
        // and are not stored in the string pool
        System.out.println((s3 == s4) ? "true" : "false"));
      
        //**** Add intern() method:  intern checks the string pool
        // and returns the string pool reference to s1.
        String s5 = new String("hello").intern();

        //**** Add intern() method: s2 also gets the string pool
        // reference for "hello"
        String s6 = new String("hello").intern();

        // Now evaluates to true
        System.out.println((s5 == s6) ? "true" : "false"));
    }
}
