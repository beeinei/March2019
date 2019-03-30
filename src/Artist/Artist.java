package Artist;

public class Artist {

    protected int numOfFans;

    public Artist(int numOfFans) {
        this.numOfFans = numOfFans;
    }

    public void artistPrint(){
        System.out.println("I have a very special soul because I am an artist, I have " + numOfFans + " fans that admire me");
    }
}
