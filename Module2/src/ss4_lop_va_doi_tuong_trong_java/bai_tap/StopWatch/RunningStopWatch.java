package ss4_lop_va_doi_tuong_trong_java.bai_tap.StopWatch;

import java.time.LocalTime;

public class RunningStopWatch {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        LocalTime end = LocalTime.now();
        StopWatch st1 = new StopWatch(start , end);
        System.out.println(start);
        System.out.println(end);
        System.out.println(st1.getElapsedTime());

    }
}
