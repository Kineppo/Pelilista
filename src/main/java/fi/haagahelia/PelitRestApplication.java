package fi.haagahelia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.domain.Pelit;
import fi.haagahelia.domain.PelitRepository;

@SpringBootApplication
public class PelitRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PelitRestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PelitRepository repository) {
		return (args) -> {
			repository.save(new Pelit("Yakuza Kiwami", "PS4", "EU: 29.8.2017"));
			repository.save(new Pelit("Yakuza 6", "PS4", "Eu: 2018?"));
			repository.save(new Pelit("Ryu Ga Gotoku Ishin!", "PS4", "Japani: 22.2.2014, EU: never?"));
			repository.save(new Pelit("Kingdom Hearts - HD 1.5 + 2.5 ReMix -", "PS4", "31.3.2017"));
			repository.save(new Pelit("Kingdom Hearts HD 2.8 - Final Chapter Prologue -", "PS4", "24.1.2017"));
			repository.save(new Pelit("Horizon Zero Dawn", "PS4", "28.2.2017"));
		};	
	}
}
