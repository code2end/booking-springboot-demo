package com.training.booking.entities;

import com.training.booking.entities.enums.Day;
import com.training.booking.entities.enums.Level;
import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Sport;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CoachSlots.class)
public abstract class CoachSlots_ {

	public static volatile SingularAttribute<CoachSlots, Level> level;
	public static volatile SingularAttribute<CoachSlots, Integer> id;
	public static volatile SingularAttribute<CoachSlots, Slot> slot;
	public static volatile SingularAttribute<CoachSlots, Integer> coachId;
	public static volatile SingularAttribute<CoachSlots, Day> day;
	public static volatile SingularAttribute<CoachSlots, Sport> sport;

	public static final String LEVEL = "level";
	public static final String ID = "id";
	public static final String SLOT = "slot";
	public static final String COACH_ID = "coachId";
	public static final String DAY = "day";
	public static final String SPORT = "sport";

}

