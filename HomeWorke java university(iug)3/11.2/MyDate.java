import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate() {
        this(System.currentTimeMillis());
    }

    MyDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    int gYear() {
        return this.year;
    }

    int gMonth() {
        return this.month;
    }

    int gDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", year, month, day);
    }
}