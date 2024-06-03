
package com.seeker.runner;

import java.util.List;

import com.seeker.entity.JobSeeker;
import com.seeker.service.IJobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekerService jobSeekerService;

	@Override
	public void run(String... args) {

		List<JobSeeker> list = jobSeekerService.findByJobSeekerNameEqualsService("mahesh");
		list.forEach(System.out::println);

		jobSeekerService.readByJobSeekerNameService("mahesh").forEach(System.out::println);
		System.out.println("----------------------");
		jobSeekerService.getByJobSeekerNameIsService("mahesh").forEach(System.out::println);

		jobSeekerService.findByPercentageBetweenService(45.0, 89.0).forEach(System.out::println);

		jobSeekerService.findByJobSeekerNameStartingWithService("M").forEach(System.out::println);
		jobSeekerService.findByJobSeekerNameEndingWithIgnoreCaseService("H").forEach(System.out::println);
		jobSeekerService.findByJobSeekerNameContainingIgnoreCaseService("ah").forEach(System.out::println);

		jobSeekerService.findByJobSeekerNameLikeIgnoreCaseService("m%").forEach(System.out::println);
		System.out.println("_____________________");
		jobSeekerService.findByJobSeekerNameLikeIgnoreCaseService("%h").forEach(System.out::println);
		System.out.println("_____________________");
		jobSeekerService.findByJobSeekerNameLikeIgnoreCaseService("%sh").forEach(System.out::println);

		jobSeekerService.findByQlfyInService(List.of("B.E", "B.Sc")).forEach(System.out::println);
		jobSeekerService.readByMobileNoIsNullService().forEach(System.out::println);
		jobSeekerService.findByQlfyInOrderByQlfyAscService(List.of("B.E", "B.sc", "B.Tech"))
				.forEach(System.out::println);

	}

}
