package personelsıstemı;

public class Yonetici extends Personel {
	
	 private double aylikMaas;

	    // Yapılandırıcı
	    public Yonetici(String ad, String soyad, int yas, double aylikMaas) {
	        super(ad, soyad, yas);
	        this.aylikMaas = aylikMaas;
	    }

	    // Fazladan yükleme (overloading)
	    double maasHesapla(double primOrani, double vergiOrani) {
	        double maas = aylikMaas + (aylikMaas * primOrani);
	        return maas - (maas * vergiOrani);
	    }

	    // Erişim belirleme (public)
	    public void bilgiGoster() {
	        super.bilgiGoster();
	        System.out.println("Maaş: " + maasHesapla(0.1, 0.3)); // Varsayılan prim ve vergi oranları
	    }

		@Override
		double maasHesapla() {
			// TODO Auto-generated method stub
			return 0;
		}

	

}
