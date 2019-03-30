package Artist;

public class Main {

    public static void main(String[] args) {
        Singer singer = new Singer(4);
        singer.singerPrint();
        //singer.painterPrint(); //טיפוסים שלא יורשים/אין את הפעולה בsinger
        singer.artistPrint();
        Artist artist1 = new Artist(200);
        artist1.artistPrint();
        //artist1.singerPrint(); //down cast without up cast
        //((Singer)artist1).singerPrint(); //down cast without up cast
        //Artist artist2 = new Singer(); //אין משתנה בקונסטרקטור
        //artist2.artistPrint(); //artist2 is invalid
        //artist2.singerPrint(); //artist2 is invalid
    }

}
