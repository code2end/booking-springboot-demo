package com.training.booking.services.specs;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.training.booking.entities.CoachSlots;
import com.training.booking.entities.CoachSlots_;
import com.training.booking.entities.enums.*;
import com.training.booking.models.SlotDTO;

import org.springframework.data.jpa.domain.Specification;

/**
 * CoachSlotsSpecs
 */
public class CoachSlotsSpecs {

  public static Specification<CoachSlots> filterCoachSlots(SlotDTO slot) {
    Specification<CoachSlots> spec = null;
    if (slot.getCoachId() != 0){
      spec = Specification.where(hasCoachId(slot.getCoachId()));
    }
    if (slot.getDay() != null){
      spec = spec!=null ? spec.and(hasDay(slot.getDay())) : Specification.where(hasDay(slot.getDay()));
    }
    if (slot.getSlot() != null){
      spec = spec!=null ? spec.and(hasSlot(slot.getSlot())) : Specification.where(hasSlot(slot.getSlot()));
    }
    if (slot.getSport() != null){
      spec = spec!=null ? spec.and(hasSport(slot.getSport())) : Specification.where(hasSport(slot.getSport()));
    }
    if (slot.getLevel() != null){
      spec = spec!=null ? spec.and(hasLevel(slot.getLevel())) : Specification.where(hasLevel(slot.getLevel()));
    }

    return spec;
  }

  public static Specification<CoachSlots> hasLevel(Level level) {
    return new Specification<CoachSlots>() {
      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public Predicate toPredicate(Root<CoachSlots> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        return builder.equal(root.get(CoachSlots_.level), level);
      }
    };
  }

  public static Specification<CoachSlots> hasSport(Sport sport) {
    return new Specification<CoachSlots>() {
      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public Predicate toPredicate(Root<CoachSlots> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        return builder.equal(root.get(CoachSlots_.sport), sport);
      }
    };
  }

  public static Specification<CoachSlots> hasSlot(Slot slot) {
    return new Specification<CoachSlots>() {
      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public Predicate toPredicate(Root<CoachSlots> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        return builder.equal(root.get(CoachSlots_.slot), slot);
      }
    };
  }

  public static Specification<CoachSlots> hasCoachId(int coachId) {
    return new Specification<CoachSlots>() {
      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public Predicate toPredicate(Root<CoachSlots> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        return builder.equal(root.get(CoachSlots_.coachId), coachId);
      }
    };
  }

  public static Specification<CoachSlots> hasDay(Day day) {
    return new Specification<CoachSlots>() {
      /**
      *
      */
      private static final long serialVersionUID = 1L;

      public Predicate toPredicate(Root<CoachSlots> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        return builder.equal(root.get(CoachSlots_.day), day);
      }
    };
  }

}