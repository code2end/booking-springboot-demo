package com.training.booking.entities;

import com.training.booking.entities.enums.Slot;
import com.training.booking.entities.enums.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Booking.class)
public abstract class Booking_ {

	public static volatile SingularAttribute<Booking, Integer> id;
	public static volatile SingularAttribute<Booking, Slot> slot;
	public static volatile SingularAttribute<Booking, Integer> candidateId;
	public static volatile SingularAttribute<Booking, Integer> coachId;
	public static volatile SingularAttribute<Booking, String> desc;
	public static volatile SingularAttribute<Booking, Status> status;

	public static final String ID = "id";
	public static final String SLOT = "slot";
	public static final String CANDIDATE_ID = "candidateId";
	public static final String COACH_ID = "coachId";
	public static final String DESC = "desc";
	public static final String STATUS = "status";

}

