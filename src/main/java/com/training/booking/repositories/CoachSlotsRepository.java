package com.training.booking.repositories;

import com.training.booking.entities.CoachSlots;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * CoachSlotsRepository
 */
@Repository("coachSlotsRepository")
public interface CoachSlotsRepository extends JpaRepository<CoachSlots, Integer>, JpaSpecificationExecutor<CoachSlots> {
}