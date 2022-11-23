public class Paragraph extends Element {
    public String text;
    private AlignStrategy AlignStrategy;
    public Paragraph(String s) {
        this.text=s;
    }

    @Override
    public void add(Element element) {
        //nimic
    }

    @Override
    public void get(int id) {
        //nimic
    }

    @Override
    public void remove(Element element) {
        //nimic
    }
    @Override
    public void print()
    {
        if (AlignStrategy != null)
            System.out.println("Paragraph :"+text+" "+AlignStrategy.AlignmentType);
        else
            System.out.println("Paragraph :"+text);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.AlignStrategy=alignStrategy;
    }
}