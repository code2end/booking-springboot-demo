package com.training.booking.entities;

/**
 * enums
 */
public class enums {

    public enum Status {
        INITIAL, PENDING, BOOKED, ONGOING, COMPLETED;
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