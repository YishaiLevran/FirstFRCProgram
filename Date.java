import java.time.Month;

public class Date {
    private int day;
    private int month;
    private int year;

    public final int Max = 31, Min = 30,
            FMax = 29, FMin = 28,
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

        if (m == Jan || m == Mar || m == May || m == Jul || m == Aug || m == Oct || m == Dec && d == Max) {
            return true;
        } else if (m == Apr || m == Jun || m == Sep || m == Nov && d == Min) {
            return true;
        } else if (isLeapYear(y) == true) {
            if (m == Feb && d == FMax) {
                return true;
            }
        } else if (m == Feb && isLeapYear(y) == false && d == FMin) {
            toString();
            return true;

        }
        return false;
    }

    public String toString(int d, int m, int y) {
        this.month = m;
        this.day = d;
        this.year = y;
return d+"/"+m+"/"+y;
    }
}

