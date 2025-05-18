public class Date {
    private int day;
    private int month;
    private int year;

    public final int Max = 31,
            Jan = 1, Feb = 2,
            Mar = 3, Apr = 4,
            May = 5, Jun = 6,
            Jul = 7, Aug = 8,
            Sep = 9, Oct = 10,
            Nov = 11, Dec = 12;

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true : false;
    }

    public boolean Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;

        if (month == Jan || month == Mar || month == May || month == Jul || month == Aug || month == Oct || month == Dec && d == 31) {
            return true;
        } else if (month == Apr || month == Jun || month == Sep || month == Nov && d == 30) {
            return true;
        } else if (isLeapYear(y) == true) {
            if (month == Feb && d == 29) {
                return true;
            }
        } else if (month == Feb && isLeapYear(y) == false && d == 28) {
            return true;
        }
        return false;
    }
}

