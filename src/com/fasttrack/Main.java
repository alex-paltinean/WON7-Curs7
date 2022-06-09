package com.fasttrack;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        First second = new First();

        Clock clock1 = new Clock();
        clock1.setHour(18);
        clock1.setMinute(30);
        Clock clock2 = new Clock();
        clock2.setHour(21);
        clock2.setMinute(3);

        System.out.println(clock1.getTime());
        System.out.println(clock2.getTime());

        Door door1 = new Door(false, false);
        Door door2 = new Door(false, true);

        Door door3 = new Door(true);
        Door door4 = new Door("true");

        if (door1.isOpened()) {
            System.out.println("Door is opened!");
        } else {
            System.out.println("Door is not opened!");
        }

        Door door5 = new Door(true, true);

        Door door6 = new Door(true);
        door6.closeDoor();
        door6.closeDoor();
        door6.closeDoor();

        AccessModifiers accessModifiers = new AccessModifiers();


        System.out.println("Done!");
    }
}
