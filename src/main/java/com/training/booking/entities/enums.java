package com.training.booking.entities;

/**
 * enums
 */
public class enums {

    public enum UserType {
        CANDIDATE, COACH, ADMIN;
    }

    public enum Status {
        INITIAL, PENDING, BOOKED, ONGOING, COMPLETED;
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    
    public enum Level {
        AMATEUR, SEMI_PRO, PRO, WORLD_CLASS, LEGENDARY;
    }

    public enum Sport {
        BASKETBALL, CRICKET, FOOTBALL, TABLE_TENNIS, BADMINTON, TENNIS;
    }

    public enum Slot {
        MORNING, NOON, AFTERNOON, EVENING;
    
        public String getDateTime(){
            switch (this) {
                case MORNING:
                    return "7:00 - 9:00";            
                case NOON:
                    return "11:00 - 1:00";
                case AFTERNOON:
                    return "2:00 - 4:00";
                case EVENING:
                    return "5:00 - 7:00";
                default:
                    return null;
            }
        }
    }
    
}