import java.util.ArrayList;
import java.util.List;

public class Playlist extends Element{

    public String titlu;
    public Playlist(String titlu) {
        this.titlu = titlu;
        this.listaElemente= new ArrayList<Element>();
    }

    public void adaugaElement(Element e) {
        this.listaElemente.add(e);
    }

    public Playlist() {
        titlu = "Playlist";
        listaElemente = new ArrayList<Element>();
    }

}