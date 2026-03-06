package currency_conversion_k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class CurrencyConversionK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionK8sApplication.class, args);
	}

}
