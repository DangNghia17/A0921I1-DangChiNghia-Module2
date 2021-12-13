package ss4_Lop_va_doi_tuong_trong_Java.Bai_Tap.StopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.now();
        XayDungLopStopWatch stopwatch = new XayDungLopStopWatch(start, end);
        System.out.println("Start: " + stopwatch.getStartTime());
        System.out.println("End: " + stopwatch.getEndTime());
        System.out.println("Time: " + stopwatch.getElapsedTime());
    }

}
