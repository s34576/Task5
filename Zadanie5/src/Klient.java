import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji=new ArrayList<>();
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }
    public void setListaRezerwacji(ArrayList<Wydarzenie> lista) {
        this.listaRezerwacji = lista;
    }
    public boolean dodajRezerwacje(Wydarzenie w) {
        listaRezerwacji.add(w);
        return true;
    }
    public void wyswietlRezerwacje()
    {
        for(Wydarzenie w : listaRezerwacji)
        {
            System.out.println(w);
        }
    }
    public void anulujRezerwacje(Wydarzenie w)
    {
        listaRezerwacji.remove(w);
    }

}
