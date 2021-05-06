package com.midem.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.midem.models.rank.Rank;
import com.midem.models.rank.RankRequest;
import com.midem.service.RankService;

@RestController
@RequestMapping("/rank")
public class RankController {

	@Autowired
	RankService rankService;
	
	@PostMapping
	public void create(@RequestBody RankRequest request, HttpServletResponse response) {
		rankService.create(request);
		response.setStatus(HttpServletResponse.SC_CREATED);
	}
	
	@GetMapping
	public List<Rank> list(@RequestParam String level) {
		return rankService.list(level);
	}
	
}
