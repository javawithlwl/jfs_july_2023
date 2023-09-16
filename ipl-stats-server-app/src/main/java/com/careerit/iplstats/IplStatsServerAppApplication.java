package com.careerit.iplstats;

import com.careerit.iplstats.domain.AppUser;
import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.repo.AppUserRepo;
import com.careerit.iplstats.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class IplStatsServerAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(IplStatsServerAppApplication.class, args);
	}
}
