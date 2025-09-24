public class Profile {
    public static void main(String[] args) {
        String name = "Shafkat";
        int age = 21;
        String city = "Los Angeles";
        String favProgrammingLanguage = "Java";

        System.out.println("Hi, my name is " + name + ". I am " + age + " years old, from " + city + ", and my favorite programming language is " + favProgrammingLanguage + ".");

        //instead of " + " with template literals -- String.format
        System.out.println(String.format(
                "Hi, my name is %s. I am %d years old, from %s, and my favorite programming language is %s.",
                name, age, city, favProgrammingLanguage
        ));
    }
}