package com.midem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midem.models.rank.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer> {}
