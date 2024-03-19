package estudo.g5.ex2;

import estudo.g5.ex1.Date;

public class Calendario {
    private int year;
    private int weekDay;
    
    public Calendario(int year, int weekDay) {
        this.year = year;
        this.weekDay = weekDay;
    }

    public int getYear() {
        return this.year;
    }

    public int firstweekDay() {
        return this.weekDay;
    }
    
    public int firstweekDayOfMonth(int month){
        int firstweekDay = this.weekDay;
        for(int i=1; i < month; i++){
            firstweekDay += Date.monthDays(i, this.year);
        }
        return firstweekDay % 7 == 0 ? 7 : firstweekDay % 7;
    }
    
    // public void printMonth(int month){
    //     int firstweekDay = this.firstweekDay();
    //     int monthDays = Date.monthDays(month, this.year);
    //     String monthName = monthName(month);

        
    // }

    public String monthName(int month){
        switch(month){
            case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "";
        }
    }
}
