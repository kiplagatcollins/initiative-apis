package com.coki.initiative.repository;

import com.coki.initiative.domain.Perspective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface PerspectiveRepository extends JpaRepository<Perspective, Long> {}