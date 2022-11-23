import java.util.ArrayList;

public class Song extends Element{

    public Song(String titlu, float dimensiune) {
        super(titlu);
        this.dimensiune = dimensiune;
    }

    public Song(String titlu) {
        super(titlu);
    }
}