package model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {

    private final OffsetDateTime dateTime;
    private Instant instant;
    private ZoneId zoneId;

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public Instant getInstant() {
        return instant;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public DateTime(OffsetDateTime offsetDateTime){
        this.zoneId = ZoneId.systemDefault();
        this.dateTime = OffsetDateTime.ofInstant(offsetDateTime.toInstant(),this.zoneId);
        this.instant = offsetDateTime.toInstant();
    }

    public DateTime(Instant instant){
        this.zoneId = ZoneId.systemDefault();
        this.instant = instant;
        this.dateTime = OffsetDateTime.ofInstant(instant,this.zoneId);

    }

    public static DateTime convertTimeZone(DateTime dateTime) {
        ZoneId Id = ZoneId.systemDefault();
        dateTime = new DateTime(OffsetDateTime.ofInstant(dateTime.getInstant(),Id));
        return dateTime;
    }


    @Override
    public String toString() {
        return DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(dateTime);
    }
}
