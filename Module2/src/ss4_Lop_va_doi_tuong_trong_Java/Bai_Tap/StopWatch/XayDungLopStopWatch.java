package ss4_Lop_va_doi_tuong_trong_Java.Bai_Tap.StopWatch;

import java.time.LocalTime;

public class XayDungLopStopWatch {
    private LocalTime startTime, endTime ;

    public XayDungLopStopWatch(){
        startTime = LocalTime.now();
    };
    public XayDungLopStopWatch(LocalTime startTime ,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*100000);
        return  miliSecond;
    }
}
