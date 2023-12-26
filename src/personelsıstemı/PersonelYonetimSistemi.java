package personelsıstemı;

public class PersonelYonetimSistemi {

	public static void main(String[] args) {
		 Calisan calisan = new Calisan("John", "Doe", 25, 20.0, 50);
	
	        calisan.bilgiGoster();
	        Yonetici yonetici = new Yonetici("Jane", "Doe", 35, 5000.0);
	        yonetici.bilgiGoster();
	    }
	}


