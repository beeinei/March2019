package Greeting_Cards;

public class WeddingCard extends GreetingCard{

    public WeddingCard(String bride, String groom, String sender){
        super(bride+" & "+groom, sender);
    }

    public void setRecipient(String bride, String groom){
        super.setRecipient(bride+" & "+groom);
    }

    @Override
    protected String greetingMsg(){
        return "May you live happily ever after";
    }

}
