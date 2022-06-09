package com.fasttrack;

import java.util.Objects;

public class Clock {
    private int hour;
    private int minute;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    int getHour() {
        return hour;
    }

    String getTime() {
        String minuteString = minute < 10 ? "0" + minute : "" + minute;
        return hour + ":" + minuteString;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return hour == clock.hour && minute == clock.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }
}
