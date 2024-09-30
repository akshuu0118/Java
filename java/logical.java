 class logical {

    public static void main(String[] args) {
        // Define some boolean variables
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        // Logical AND (&&) Operator
        System.out.println("Logical AND (&&) Operator:");
        System.out.println("a && b = " + (a && b));  // true && false = false
        System.out.println("a && c = " + (a && c));  // true && true  = true
        System.out.println("b && d = " + (b && d));  // false && false = false
        System.out.println();

        // Logical OR (||) Operator
        System.out.println("Logical OR (||) Operator:");
        System.out.println("a || b = " + (a || b));  // true || false = true
        System.out.println("b || d = " + (b || d));  // false || false = false
        System.out.println("a || c = " + (a || c));  // true || true  = true
        System.out.println();

        // Logical NOT (!) Operator
        System.out.println("Logical NOT (!) Operator:");
        System.out.println("!a = " + (!a));  // !true = false
        System.out.println("!b = " + (!b));  // !false = true
        System.out.println("!c = " + (!c));  // !true = false
        System.out.println("!d = " + (!d));  // !false = true
        System.out.println();

        // Combining Logical Operators
        System.out.println("Combining Logical Operators:");
        System.out.println("(a && c) || (b && d) = " + ((a && c) || (b && d)));  // (true && true) || (false && false) = true
        System.out.println("!(a && b) = " + !(a && b));  // !(true && false) = true
        System.out.println("!(b || d) = " + !(b || d));  // !(false || false) = true
    }
}
