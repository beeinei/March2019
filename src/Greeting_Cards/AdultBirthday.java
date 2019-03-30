package Greeting_Cards;

public class AdultBirthday extends BirthdayCard {

    public AdultBirthday(String recipient, String sender, int age){
        super(recipient,sender,age);
    }

    @Override
    protected String greetingMsg() {
        return "Happy " + super.age + "th Birthday!" + "\n" + "You haven't changed at all!";
    }

}
