package com.training.booking.services;

import java.util.List;

import com.training.booking.entities.CoachSlots;
import com.training.booking.models.SlotDTO;
import com.training.booking.repositories.CoachSlotsRepository;
import com.training.booking.services.specs.CoachSlotsSpecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * CoachSlotService
 */
@Service
public class CoachSlotService {

    @Autowired
    private CoachSlotsRepository coachSlotsRepository;

    public CoachSlots save(SlotDTO slot, int coachId) throws Exception {
        CoachSlots coachSlot = new CoachSlots(coachId, slot.getSlot(), slot.getDay(), slot.getSport(), slot.getLevel());
        return this.coachSlotsRepository.saveAndFlush(coachSlot);
    }

	public List<CoachSlots> getBookingSlots(SlotDTO slot) throws Exception {
        Specification<CoachSlots> spec = CoachSlotsSpecs.filterCoachSlots(slot);
        return spec != null ? this.coachSlotsRepository.findAll(spec) : this.coachSlotsRepository.findAll();
		
	}
    
}