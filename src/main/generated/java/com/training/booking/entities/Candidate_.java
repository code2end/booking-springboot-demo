package com.training.booking.entities;

import com.training.booking.entities.enums.Level;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Candidate.class)
public abstract class Candidate_ extends com.training.booking.entities.User_ {

	public static volatile SingularAttribute<Candidate, Level> level;

	public static final String LEVEL = "level";

}

