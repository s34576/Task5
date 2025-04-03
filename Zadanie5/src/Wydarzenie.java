public class Wydarzenie {
    String nazwa;
    String data;
    String miejsce;
    int maxLiczbaMiejsc =100;
    int dostepneMiejsca=0;
    double cena;
    public Wydarzenie(String nazwa, double cena,String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, "Radom");
    }
    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "12-04-2025", "Warszawa");
    }
    public Wydarzenie(String nazwa) {
        this(nazwa, 20, "13-05-2025", "Wroclaw");
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {

        if(dostepneMiejsca<0)
        {
            throw new IllegalArgumentException("Dostepne miejsca nie mogą być mniejsze niż 0");
        }
        if(dostepneMiejsca>maxLiczbaMiejsc)
        {
            throw new IllegalArgumentException("Dostępnych miejsc nie może być więcej niż maksymalna liczba miejsc");
        }
                this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
       if(cena<0)
       {
           throw new IllegalArgumentException("Cena nie może być ujemna");
       }
        this.cena = cena;
    }
    public String ToString()
    {
        return this.nazwa+" "+this.data+" "+this.miejsce;
    }
    public boolean zarezerwujMiejsce()
    {
        if(dostepneMiejsca<=0)
        {
            System.out.println("Podane miejsce nie istnieje/ Podane miejsce jest niedostepne");
            return false;
        }
        this. dostepneMiejsca--;
        return true;
    }
}
