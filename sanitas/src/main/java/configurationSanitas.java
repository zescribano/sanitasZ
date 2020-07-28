import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.sanitas.services.CalculadoraServices;
import com.example.sanitas.services.impl.CalculadoraServicesImpl;

@Configuration
public class configurationSanitas {
	 @Bean
	    public CalculadoraServices calcService() {
	        return new CalculadoraServicesImpl();
	    }
}
