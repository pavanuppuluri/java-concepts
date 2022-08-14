public class StringBuilderTest {
    public static void main(String[] args) {

        // Create and Initialize a StringBuilder Object
        StringBuilder sb = new StringBuilder("World Hello, How are you?");
        System.out.println("Original Value in sb = " + sb);

        // Now reverse the entire string
        sb.reverse();
        System.out.println("sb after reverse() method called = " + sb);

        // You can assign the reverse method's result to a
        // different StringBuilder variable...
        StringBuilder rb = sb.reverse();
        System.out.println("(rb == ss) = " + (rb == sb));

        // Now you have two StringBuilder references pointing to the
        // same mutable text
        sb.append(" How are you?");
        System.out.println("sb = " + sb);
        System.out.println("rb = " + rb);
        
        StringBuilder sb1 = new StringBuilder("World Hello, How are you?");
        StringBuilder sb2 = new StringBuilder("World Hello, How are you?");
        
        System.out.println(sb1==sb2);           // false
        System.out.println(sb1.equals(sb2));    // false
        System.out.println(sb1.compareTo(sb2)); // 0
        

    }
}
