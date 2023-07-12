package com.coki.initiative.repository;

import com.coki.initiative.domain.Initiative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("unused")
@Repository
public interface InitiativeRepository extends JpaRepository<Initiative, Long> {

}
