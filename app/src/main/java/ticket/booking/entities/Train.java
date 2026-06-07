package ticket.booking.entities;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private int trainNo;
    private Time deptTime;
    private Time arrivalTime;
    private List<List<Integer>> seatAvailable;
    Map<String, LocalDateTime> stationTimes;
    List<String> stations;
}