package Greeting_Cards;

public class ManyCards {

    public static void main(String[] args) {
        GreetingCard[] greetingCards = new GreetingCard[5];

        GreetingCard greetingCard
                = new GreetingCard("Robin", "Ted");
        WeddingCard weddingCard
                = new WeddingCard("Lily", "Marshal", "Ted");
        BirthdayCard birthdayCard
                = new BirthdayCard("Woman", "Barnie", 18);
        YouthBirthday youthBirthday
                = new YouthBirthday("Jason", "Trina", 7);
        AdultBirthday adultBirthday
                = new AdultBirthday("Whizzer", "Marvin", 30);

        greetingCards[0] = greetingCard;
        greetingCards[1] = weddingCard;
        greetingCards[2] = birthdayCard;
        greetingCards[3] = youthBirthday;
        greetingCards[4] = adultBirthday;

        for (int i = 0; i < greetingCards.length; i++) {
            System.out.println(i + ":");
            System.out.println(greetingCards[i].toString());
            System.out.println("-----------");
        }

    }

}
