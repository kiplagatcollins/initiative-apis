package com.coki.initiative.repository;

import com.coki.initiative.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface SectionRepository extends JpaRepository<Section,Long> {
}
