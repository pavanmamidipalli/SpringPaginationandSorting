package com.example.SpringBootPaginationAndSorting;

import com.example.SpringBootPaginationAndSorting.entity.VaccineDetails;
import com.example.SpringBootPaginationAndSorting.service.IVaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootPaginationAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootPaginationAndSortingApplication.class, args);
		IVaccineService service = context.getBean(IVaccineService.class);
//		List<VaccineDetails> list = new ArrayList<>();
//		list.add(new VaccineDetails("sputnik","russia"));
//		list.add(new VaccineDetails("covishield","india"));
//		list.add(new VaccineDetails("covaxin","hyd"));
//		list.add(new VaccineDetails("cerrum","USa"));
//		System.out.println(service.addALl(list));
		Iterable<VaccineDetails> vaccineDetails= service.sortTheDetails(false,"vaccineName","vaccineCompany");
		vaccineDetails.forEach(i-> System.out.println(i.getVaccineName()+">>"+i.getVaccineCompany()));
		Iterable<VaccineDetails> vaccineDetails1=service.paginationOfDetails(1,2,false,"vaccineName","vaccineCompany");
		vaccineDetails1.forEach(i-> System.out.println(i));
		service.pagination(1);
	}

}
