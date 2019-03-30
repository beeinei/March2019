package Greeting_Cards;

public class YouthBirthday extends BirthdayCard {

    public YouthBirthday(String recipient, String sender, int age){
        super(recipient,sender,age);
    }

    @Override
    protected String greetingMsg() {
        return "Happy " + super.age + "th Birthday!" + "\n" + "How you have grown!!";
    }

}
