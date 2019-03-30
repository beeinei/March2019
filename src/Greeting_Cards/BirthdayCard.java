package Greeting_Cards;

public class BirthdayCard extends GreetingCard {

    protected int age;

    public BirthdayCard(String recipient, String sender, int age){
        super(recipient, sender);
        this.age = age;
    }

    @Override
    protected String greetingMsg() {
        return "Happy " + age + "th Birthday!";
    }

}
