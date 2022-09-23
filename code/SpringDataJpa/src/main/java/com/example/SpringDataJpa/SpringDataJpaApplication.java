package com.example.SpringDataJpa;

import com.example.SpringDataJpa.entity.ChuyenBay;
import com.example.SpringDataJpa.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);

		ChuyenBayService chuyenBayService;
		System.out.println();
	}

//	@Bean
//	CommandLineRunner run(ChuyenBayService chuyenBayService) {
//		return args -> {
//			List<ChuyenBay> chuyenBays = chuyenBayService.findByGaDen("DAD");
//			for (ChuyenBay cb: chuyenBays) {
//				System.out.println(cb);
//			}
//		};
//	}

}
