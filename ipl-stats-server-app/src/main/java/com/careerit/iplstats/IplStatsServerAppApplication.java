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
public class IplStatsServerAppApplication implements CommandLineRunner {

	@Autowired
	private AppUserRepo appUserRepo;
	@Autowired
	private PlayerRepo playerRepo;

	public static void main(String[] args) {
		SpringApplication.run(IplStatsServerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*AppUser appUser1 = new AppUser();
		appUser1.setUsername("sai");
		appUser1.setPassword("sai@123");
		appUser1.setEmail("sai.a@gmail.com");

		AppUser appUser2 = new AppUser();
		appUser2.setUsername("manoj");
		appUser2.setPassword("manoj@123");
		appUser2.setEmail("manoj.pvn@gmail.com");

		List<AppUser> list = List.of(appUser1, appUser2);
		appUserRepo.saveAll(list);*/

		/*List<AppUser> appUserList = appUserRepo.findAll();
		appUserList.forEach(ele->{
			System.out.println(ele.getUsername());
		});*/
		String name = "sai";
		/*List<AppUser> appUsers = appUserRepo.findByUsername(name);
		System.out.println("App user count with name "+name+" is:"+appUsers.size());*/

	/*	List<AppUser> appUsers = appUserRepo.findByEmailOrName(name);
		System.out.println("App user count with name "+name+" is:"+appUsers.size());

		appUserRepo.deleteById(UUID.fromString("5f26f5cf-1dc8-45cb-8bee-0c90d013a45f"));

		Optional<AppUser> optUser = appUserRepo.findById(UUID.fromString("0e609d8c-3bdf-4d26-85e6-c97640496532"));
		if(optUser.isPresent()){
			AppUser appUser = optUser.get();
			appUser.setEmail("saikrishna.a@gmail.com");
			appUserRepo.save(appUser);
		}*/

		playerRepo.getTeamStats().forEach(System.out::println);
	}
}
