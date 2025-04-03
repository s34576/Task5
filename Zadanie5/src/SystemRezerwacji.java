import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaRezerwacji= new ArrayList<>();
    private ArrayList<Klient> listaKlientow=new ArrayList<>();
    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for(Wydarzenie w : listaRezerwacji)
        {
            if(w.getNazwa().equals(nazwa))
            {
                return w;
            }
        }
        return null;
    }
    public void dodajWydarzenie(Wydarzenie w) {
    listaRezerwacji.add(w);
    }
    public void dodajWydarzenie(String nazwa, double cena) {
    Wydarzenie w= new Wydarzenie(nazwa,cena);
    listaRezerwacji.add(w);
    }
    public void dodajKlient(Klient k) {
    listaKlientow.add(k);
}
    public void dodajKlient(String nazwa,String nazwisko) {
        Klient k= new Klient(nazwa,nazwisko);
        listaKlientow.add(k);
    }

}
