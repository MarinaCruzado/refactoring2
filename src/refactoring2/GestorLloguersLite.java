package refactoring2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
	public static void main(String[] args ) throws ParseException {
		// demostraci� de construcci� d'un vehicle de categoria BASIC
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

		// demostraci� de construccu� d'un lloguer amb una data
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

		// demostraci� de formatat d'una data
		System.out.println(dateFormat.format(lloguerBasic.getData()));

		
		Client c = new Client("3454545","Eduard","45454545");
        
        Vehicle v1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("d/M/yyyy");
        Date date1 = dateFormat1.parse("2/8/2013");
        Lloguer ll1 = new Lloguer(date1, 2, v1);
        c.afegeix(ll1);     
 
        Vehicle v2 = new Vehicle("Hyundai", "Atos", Vehicle.LUXE);
        date1 = dateFormat1.parse("2/10/2017");
        Lloguer ll2 = new Lloguer(date1, 1, v2);
        c.afegeix(ll2);
        
        Vehicle v3 = new Vehicle("Seat", "Cupra", Vehicle.GENERAL);
        date1 = dateFormat1.parse("2/8/2020");
        Lloguer ll3 = new Lloguer(date1, 5, v3);
        c.afegeix(ll3);
        
        System.out.print(HistorialClient(c));
		
	}
	
	public static String HistorialClient (Client c) {
		return c.informe();
		
	}

}
