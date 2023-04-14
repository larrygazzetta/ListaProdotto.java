public class Lista {
    public Nodo start;
    public int size;
    public void add(Prodotto a)
    {
        Nodo n1 = new Nodo(a);
        if(start == null)
        {
            start = n1;
        }
        else if(start.next == null)
        {
            start.next = n1;
        }
        else
        {

            for(Nodo i = start.next;i.next != null;i = i.next) {
                i.next = n1;
            }
        }
        size++;
    }

        public void stampa()
        {

            for(Nodo i = start;i != null;i = i.next)
            {
                System.out.println("prodotto: " + i.n.toString());
            }
        }
}
