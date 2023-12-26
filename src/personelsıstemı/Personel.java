package personelsıstemı;

abstract class Personel {
	 private String ad;
	    private String soyad;
	    private int yas;

	   
	    public Personel(String ad, String soyad, int yas) {
	        this.ad = ad;
	        this.soyad = soyad;
	        this.yas = yas;
	    }

	  
	    abstract double maasHesapla();

	   
	    protected String getAdSoyad() {
	        return ad + " " + soyad;
	    }

	  
	    public void bilgiGoster() {
	        System.out.println("Ad Soyad: " + getAdSoyad());
	        System.out.println("Yaş: " + yas);
	    }
}
