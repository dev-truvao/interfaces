import java.util.Locale;

import com.test.accountpay.model.PayStub;
import com.test.accountpay.model.ServiceOrder;
import com.test.accountpay.service.AccountPayService;
import com.test.payment.Beneficiary;
import com.test.payment.PaymentMethod;
import com.test.payment.Pix;
import com.test.payment.TED;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		PaymentMethod paymentMethod = new TED();

		Beneficiary beneficiary = new Beneficiary("Samuel", "15658894603", "3549-02");

		PayStub payStub = new PayStub(beneficiary, 12.70, 40);

		AccountPayService accountPayService = new AccountPayService(paymentMethod);
		
		accountPayService.pay(payStub);

		Beneficiary supplier = new Beneficiary("AVC Tiro Certo", "avctirocerto@gmail.com", "112-47");

		ServiceOrder sOrder = new ServiceOrder(supplier, 45_458);
		accountPayService.pay(sOrder);
	}
}
