package com.coki.initiative.repository;

import com.coki.initiative.domain.Officer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface OfficerRepository extends JpaRepository<Officer,Long> {}
