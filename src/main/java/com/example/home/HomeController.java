package com.example.home;

import java.security.Principal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.example.movie.ActorDto;
import com.example.movie.DirectorDto;
import com.example.movie.MovieDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

	@ModelAttribute("module")
	String module() {
		return "home";
	}

	@ModelAttribute("movies")
	public List<MovieDto> movies() {
		MovieDto movieDto = new MovieDto();
		movieDto.setTitle("Matrix");
		movieDto.setReleaseDate(LocalDate.of(1999, 3, 31));

		DirectorDto lanaWachowski = new DirectorDto();
		lanaWachowski.setFirstName("Lana");
		lanaWachowski.setLastName("Wachowski");

		DirectorDto lillyWachowski = new DirectorDto();
		lillyWachowski.setFirstName("Lilly");
		lillyWachowski.setLastName("Wachowski");

		ActorDto neo = new ActorDto();
		neo.setFirstName("Keanu");
		neo.setLastName("Reeves");

		ActorDto morpheus = new ActorDto();
		morpheus.setFirstName("Laurence");
		morpheus.setLastName("Fishburne");
		Map<String, ActorDto> roles = new TreeMap<>();
		roles.put("Neo", neo);
		roles.put("Morpheus", morpheus);

		movieDto.setDirectors(Arrays.asList(lanaWachowski, lillyWachowski));
		movieDto.setRoles(roles);
		return Arrays.asList(movieDto);
	}

	@GetMapping("/")
	String index(Principal principal) {
		return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
	}
}
