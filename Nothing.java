public class Nothing implements Maybe{
    public void accept (Entier entier){
        entier.visit(this);
    }
}