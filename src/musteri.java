public class musteri {
    private int id;
    private String ad;
    private int sifre;
    private int bakiye;

    public musteri() {
        this.id = 0;
        this.ad = "yok";
        this.sifre =0;
        this.bakiye =0;
    }

    public musteri(int id, String ad, int sifre, int bakiye) {
        this.id = id;
        this.ad = ad;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public int getSifre() {
        return sifre;
    }
    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
    public int getBakiye() {
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
