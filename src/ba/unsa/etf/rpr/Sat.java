package ba.unsa.etf.rpr;

public class Sat {
    private int sati,minute,sekunde;

    public Sat (int sati, int minute, int sekunde){
        postavi(sati,minute,sekunde);
    }
    public void postavi (int sati, int minute, int sekunde){
        this.sati = sati; this.minute = minute; this.sekunde=sekunde;
    }

    public void sljedeci () {
        sekunde++;
        if (sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            sati++;
        }
        if (sati == 24)
            sati = 0;

    }





}
