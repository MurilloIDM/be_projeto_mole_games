package com.midem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.midem.models.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer> {}
