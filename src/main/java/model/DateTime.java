package model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {

    private final OffsetDateTime offsetDateTime;
    private final LocalDateTime localDateTime;
    private Instant instant;
    private ZoneId zoneId;

    public DateTime(OffsetDateTime offsetDateTime){
        this.zoneId = ZoneId.systemDefault();
        this.instant = offsetDateTime.toInstant();
        this.offsetDateTime = OffsetDateTime.ofInstant(instant,this.zoneId);
        this.localDateTime = LocalDateTime.ofInstant(instant,this.zoneId);
    }

    public DateTime(Instant instant){
        this.zoneId = ZoneId.systemDefault();
        this.instant = instant;
        this.offsetDateTime = OffsetDateTime.ofInstant(instant,this.zoneId);
        this.localDateTime = LocalDateTime.ofInstant(instant,this.zoneId);

    }

    public OffsetDateTime getOffsetDateTime() {
        return offsetDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Instant getInstant() {
        return instant;
    }

    public ZoneId getZoneId() {
        return zoneId;
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
