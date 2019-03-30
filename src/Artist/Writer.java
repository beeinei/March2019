package Artist;

public class Writer extends Artist {

    public Writer(int numOfFans) {
        super(numOfFans);
    }

    public void writerPrint() {
        System.out.println("I am a great writer");
    }
}
