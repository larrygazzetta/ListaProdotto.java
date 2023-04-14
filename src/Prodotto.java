public class Prodotto
{
    protected String codide_barre;
    protected String descrizione;//descrizione sul prodotto
    protected int prezzo;

    public Prodotto(String codide_barre, String descrizione,int prezzo)
    {
        this.codide_barre=codide_barre;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
    }
    public void setcodi(String codide_barre)
    {
        this.codide_barre=codide_barre;
    }
    public void setdesc(String descrizione)
    {
        this.descrizione=descrizione;
    }
    public void setprezo(int prezzo)
    {
        this.prezzo=prezzo;
    }
    public String getcodi()
    {
        return codide_barre;
    }
    public String getdesc()
    {
        return descrizione;
    }
    public int getprez()
    {
        return prezzo;
    }

    public boolean equals(Prodotto p1)
    {
        if(p1.codide_barre==p1.codide_barre)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codide_barre='" + codide_barre + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}