package Greeting_Cards;

public class Test {

    public static void main(String[] args) {
        GreetingCard greetingCard
                = new GreetingCard("Robin", "Ted");
        WeddingCard weddingCard
                = new WeddingCard("Lily", "Marshal", "Ted");
        BirthdayCard birthdayCard
                = new BirthdayCard("Woman", "Barnie", 18);
        YouthBirthday youthBirthday
                = new YouthBirthday("Jason", "Mendel", 13);
        AdultBirthday adultBirthday
                = new AdultBirthday("Whizzer", "Marvin", 30);
        System.out.println(greetingCard);
        System.out.println("----");
        System.out.println(weddingCard);
        System.out.println("----");
        System.out.println(birthdayCard);
        System.out.println("----");
        System.out.println(youthBirthday);
        System.out.println("----");
        System.out.println(adultBirthday);
    }

}
