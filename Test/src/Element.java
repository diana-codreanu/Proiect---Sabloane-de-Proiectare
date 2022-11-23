import java.util.List;

public class Element {

    public String titlu;
    public float dimensiune;
    public List<Element> listaElemente;

    public void adauga(Element element){
        listaElemente.add(element);
    }
    public void sterge(Element element) {
        listaElemente.remove(element);
    }
    public void schimbaDimensiunea(float dimensiune){
        this.dimensiune = dimensiune;
    }

    public float getDimensiune() {
        return dimensiune;
    }
}