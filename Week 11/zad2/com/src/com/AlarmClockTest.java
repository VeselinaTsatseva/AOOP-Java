package com;

import events.AlarmActionEventHandler;
import events.AlarmEvent;

public class AlarmClockTest implements AlarmActionEventHandler {
    private AlarmClock alarmClock;

    public AlarmClockTest() {
        this.alarmClock = new AlarmClock(this, 10);
    }

    @Override
    public void alarmActionPerformed(AlarmEvent args) {
        System.out.printf("Rings left: %d\n", args.getNrings());
    }

    public static void main(String[] args) {
        AlarmClockTest alarmClockTest = new AlarmClockTest();
        alarmClockTest.alarmClock.start();
    }
}
