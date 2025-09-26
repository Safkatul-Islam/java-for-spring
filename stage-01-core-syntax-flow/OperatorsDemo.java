public class OperatorsDemo {
    public static void main(String[] args) {
        int x = 15, y = 4;

        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Quotient: " + ((double) x / y));
        System.out.println("Remainder: " + (x % y));

        if (x > y) {
            System.out.println(String.format("Value of x = %d is greater than y = %d", x, y));
        } else {
            System.out.println(String.format("Value of y = %d is greater than x = %d", y, x));
        }

        boolean isSunny = true, isWeekend = false;

        boolean canGoOutside = isSunny && isWeekend;
        System.out.println("Can go outside? " + canGoOutside);

        if (isSunny && isWeekend) {
            System.out.println("You can go outside");
        } else {
            System.out.println("You can't go outside");
        }
    }
}