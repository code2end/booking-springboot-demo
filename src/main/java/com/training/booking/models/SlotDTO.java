package com.training.booking.models;

import com.training.booking.entities.enums.Day;
import com.training.booking.entities.enums.Level;
import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Sport;

public class SlotDTO {

	private Sport sport;
	private Slot slot;
	private Day day;
	private Level level;
	private int coachId;

	public Sport getSport() {
		return sport;
	}

	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

}