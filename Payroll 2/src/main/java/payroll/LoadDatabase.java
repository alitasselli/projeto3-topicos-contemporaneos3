package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(BusinessRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Business("Desc do empreendimento", (long) 4 , "ASB456ET67R6", 30, 23)));
      log.info("Preloading " + repository.save(new Business("Desc do empreendimento", (long) 6 , "44B454getaR6", 40, 50)));
    };
  }
}
