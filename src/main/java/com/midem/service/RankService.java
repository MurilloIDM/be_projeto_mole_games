package com.midem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.midem.models.rank.Rank;
import com.midem.models.rank.RankRequest;
import com.midem.models.user.User;
import com.midem.repository.RankRepository;
import com.midem.repository.UserRepository;

@Service
public class RankService {
	
	@Autowired
	RankRepository rankRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public void create(RankRequest request) {
		Integer userId = request.getIdUser();
		Integer score = request.getScore();
		String level = request.getLevel();
		
		User user = userRepository.findById(userId).get();
		
		Rank oldRank = this.findRankByIdUser(userId, level);
		
		if (oldRank == null) {
			Rank rank = new Rank(score, level, user);
			rankRepository.save(rank);
			return;
		}
		
		if (score <= oldRank.getScore()) {
			throw new LowScoreException(oldRank.getScore());
		}
		
		oldRank.setScore(score);
		rankRepository.save(oldRank);
	}
	
	public Rank findRankByIdUser(Integer id, String level) {
		List<Rank> ranks = rankRepository.findAll();
		
		for (Rank rank : ranks) {			
			if (rank.getUser().getId() == id && rank.getLevel().equalsIgnoreCase(level)) {
				return rank;
			}
		}
		
		return null;
	}
	
	public List<Rank> list(String level) {
		List<Rank> ranks = new ArrayList<Rank>();
		List<Rank> returnQuery = rankRepository.findAll(Sort.by(Sort.Direction.DESC, "score"));
		
		for (Rank rank : returnQuery) {
			if (rank.getLevel().equalsIgnoreCase(level)) {
				ranks.add(rank);
			}
		}
		
		return ranks;
	}
}
