public class TaskDemo {
    public static void main(String[] args) {

        Task t1 = new Task(1, "Learning Java");
        t1.markDone();

        Task t2 = new Task(2, "Learning Spring");

        System.out.println(t1);
        System.out.println(t2);
    }
}