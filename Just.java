public class Just implements Maybe{
    private int valeur;
    public void accept (Entier entier){
        entier.visit(this);
    }
    int getValeur (){
        return this.valeur;
    }
    
    
    Just (int valeur){
        this.valeur = valeur;
    }
}