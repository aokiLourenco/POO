package estudo.g5.ex1;


public class Date {

    private int month, day, year;

   
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public static boolean validMonth(int month){
        if(month<1 && month>12){
            return false;
        } else{
            return true;
        }
    }

    public static int monthDays(int month, int year){
        if(month == 2){
            if(leapYear(year)){
                return 29;
            }
            return 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        } else{
            return 30;
        }
    }

    public static boolean leapYear(int year){
        if(year%4 == 0){
            return true;
        } else if(year%100 == 0){
            return false;
        }
        if(year%400 == 0){
            return true;
        } else{
            return false;
        }
    }

    public boolean valid(int year, int month, int day ){
        return validMonth(month) && day>=1 && day<=monthDays(month, year); 
    }

    public void increment(){
        if(this.day == monthDays(this.month, this.year)){
            this.day = 1;
            if(this.month == 12){
                this.year ++;
                this.month = 1;
            } else{
                this.month ++;
            }
        } else{
            this.day ++;
        }
    }

    public void decrement(){
        if(this.day == 1){
            this.day = monthDays(this.month, this.year);
            if(this.month == 1){
                this.year --;
                this.month = 12;
            } else{
                this.month --;
            }
        } else{
            this.day --;
        }
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
    }

    
}
