public class ConditionalsDemo {
    private static final int A_GRADE = 90;
    private static final int B_GRADE = 80;
    private static final int C_GRADE = 70;
    private static final int PASS_MARK = 60;

    public static void main(String[] args) {
        int score = 88;

        if (score >= A_GRADE && score <= 100) {
            System.out.println("A");
        } else if (score >= B_GRADE) {
            System.out.println("B");
        } else if (score >= C_GRADE) {
            System.out.println("C");
        } else if (score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Invalid score");
        }

        int day = 7;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6:      //Java lets you stack cases so they “fall through” into the same block
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong day number"); break;
        }


        System.out.println(score >= PASS_MARK ? "Passing" : "Failing");
    }
}