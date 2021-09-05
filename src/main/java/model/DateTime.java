package model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {

    private final OffsetDateTime offsetDateTime;
    private final LocalDate localDate;
    private final LocalTime localTime;
    private final int hour;
    private final int minute;
    private final MeridiemIndicator meridiem;
    private final Instant instant;
    private final ZoneId zoneId;

    public DateTime(OffsetDateTime offsetDateTime){
        this(offsetDateTime.toInstant());
    }

    public DateTime(Instant instant){
        int tempHour;
        this.zoneId = ZoneId.systemDefault();
        this.instant = instant;
        this.offsetDateTime = OffsetDateTime.ofInstant(instant,this.zoneId);
        this.localDate = LocalDate.from(this.offsetDateTime);
        this.localTime = LocalTime.from(this.offsetDateTime);
        tempHour = this.localTime.getHour();
        this.minute = this.localTime.getMinute();
        if(localTime.isBefore(LocalTime.NOON)) this.meridiem = MeridiemIndicator.AM;
        else this.meridiem = MeridiemIndicator.PM;
        if(tempHour == 0) tempHour = 12;
        this.hour = tempHour;
    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public Instant getInstant() {
        return instant;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public MeridiemIndicator getMeridiem() {
        return meridiem;
    }

    public static DateTime convertTimeZone(DateTime dateTime) {
        ZoneId Id = ZoneId.systemDefault();
        dateTime = new DateTime(OffsetDateTime.ofInstant(dateTime.getInstant(),Id));
        return dateTime;
    }


    @Override
    public String toString() {
        return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(offsetDateTime);
    }
}
