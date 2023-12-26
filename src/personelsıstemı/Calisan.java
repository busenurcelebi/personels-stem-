package personelsıstemı;

public class Calisan extends Personel {

	 private double saatlikUcret;
	    private int calismaSaati;

	   
	    public Calisan(String ad, String soyad, int yas, double saatlikUcret, int calismaSaati) {
	        super(ad, soyad, yas);
	        this.saatlikUcret = saatlikUcret;
	        this.calismaSaati = calismaSaati;
	    }

	   
	    double maasHesapla(double vergiOrani) {
	        double maas = saatlikUcret * calismaSaati;
	        return maas - (maas * vergiOrani);
	    }

	   
	    public void bilgiGoster() {
	        super.bilgiGoster();
	        System.out.println("Maaş: " + maasHesapla(0.2)); // Varsayılan vergi oranı
	    }

		@Override
		double maasHesapla() {
			
			return 0;
		}

}
