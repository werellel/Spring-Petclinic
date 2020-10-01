package proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoreTest {

	@Test
	void testPay() {
		Payment cashPerf = new CashPerf();
		Store store = new Store(cashPerf);
		store.buySomething(100);
	}

}
