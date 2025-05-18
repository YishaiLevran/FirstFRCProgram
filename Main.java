public class Main {
    public static void main(String[] args) {


    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true : false;
    }

    public class Date {
        private int day;
        private int month;
        private int year;

        public Date(int d, int m, int y) {
            this.day = d;
            this.month = m;
            this.year = y;
            switch (m) {
                case 1:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 2:
                    if (isLeapYear(y) == true) {
                        if (d != 29 || y < 0) {
                            d = 1;
                            m = 1;
                            y = 2000;
                        }
                    } else if (d != 28 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 3:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 4:
                    if (d != 30 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 5:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 6:
                    if (d != 30 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 7:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 8:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 9:
                    if (d != 30 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 10:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 11:
                    if (d != 30 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
                case 12:
                    if (d != 31 || y < 0) {
                        d = 1;
                        m = 1;
                        y = 2000;
                    }
                    break;
            }
        }

    }
}