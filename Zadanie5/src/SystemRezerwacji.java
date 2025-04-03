import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaRezerwacji= new ArrayList<>();
    private ArrayList<Klient> listaKlientow=new ArrayList<>();
    public void dokonajRezerwacji(Klient k, Wydarzenie w) {
        this.listaKlientow.add(k);
        this.listaRezerwacji.add(w);
        w.zarezerwujMiejsce();
        k.dodajRezerwacje(w);
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena){
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if(w == null){
            throw new IllegalArgumentException("Wydarzenie nie istnieje");}
        w.setCena(nowaCena);
    }

    public Klient znajdzKlienta(String nazwisko)
   {
       for(Klient k: listaKlientow)
       {
           if(k.getNazwisko().equals(nazwisko))
               return k;
       }
       return null;
   }
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
