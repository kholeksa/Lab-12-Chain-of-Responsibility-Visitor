
package ua.edu.ucu.apps.task1;

import ua.edu.ucu.apps.task1.sections.*;

public class ATM {
    Section first;

    public ATM () {
        this.first = new Section_500();
        Section_200 section_200 = new Section_200();
        first.setNext(section_200);
        Section_100 section_100 = new Section_100();
        section_200.setNext(section_100);
        Section_50 section_50 = new Section_50();
        section_100.setNext(section_50);
        Section_20 section_20 = new Section_20();
        section_50.setNext(section_20);
        Section_10 section_10 = new Section_10();
        section_20.setNext(section_10);
        Section_5 section_5 = new Section_5();
        section_10.setNext(section_5);
        Section_2 section_2 = new Section_2();
        section_5.setNext(section_2);
        Section_1 section_1 = new Section_1();
        section_2.setNext(section_1);
        
    }
    public void getMeMoney(int amount) {
        first.process(amount);
    }
    
}