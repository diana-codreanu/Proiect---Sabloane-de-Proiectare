import java.util.ArrayList;

public class MediaPlayer extends Playlist{

    public Element playList;
    public String titlu;

    public MediaPlayer(String titlu) {
        this.titlu = titlu;
       
    }
    public void adauga(Element e){
        playList = e;
    }

    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }

}