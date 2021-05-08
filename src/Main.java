import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Emirhan", "Yýlmaz",1999, "57346350160" );
		BaseCustomerManager customerManager = new StarbucksCustomerManager	(new MernisServiceAdapter());
		customerManager.save(customer1);
	}
	

}
