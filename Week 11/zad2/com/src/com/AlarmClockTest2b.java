package com;

import events.AlarmActionEventHandler;
import events.AlarmEvent;

public class AlarmClockTest2b {
    private AlarmClock alarmClock;

    private class AlarmActionEventHandlerImpl implements AlarmActionEventHandler{

        @Override
        public void alarmActionPerformed(AlarmEvent args) {
            System.out.printf("Rings left: %d\n", args.getNrings());
        }
    }

    public AlarmClockTest2b() {
        this.alarmClock = new AlarmClock(new AlarmActionEventHandlerImpl(), 10);
    }

    public static void main(String[] args) {
        AlarmClockTest2b alarmClockTest = new AlarmClockTest2b();
        alarmClockTest.alarmClock.start();
    }
}
