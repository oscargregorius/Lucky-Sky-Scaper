package com.company;

public class LuckySkyScraper {

    static public void floorList(int totalRealFloors){
        int fakeFloor = 1;
        for(int realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("RealFloorNo: " + realFloor + " fakeFloor: " + fakeFloor);
            do {
                fakeFloor++;
            }while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }
}
