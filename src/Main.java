public class Main {
    public static void main(String[] args) {
        Lista l1=new Lista();
        Prodotto l2=new Prodotto("SFVSQW£$%&R465e","abla",3);
        Prodotto l3=new Prodotto("SFVSQWdfgdfgfgdfgd£$%&R465e","abla434343",2343);
        l1.add(l2);
        l1.add(l3);


        l1.stampa();
    }
}