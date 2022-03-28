package ru.netology.sqr;

public class SQRService {

    public int calculate(int upperRange, int underRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (underRange <= sqr && sqr <= upperRange) {
                counter++;
            }
        }
        return counter;
    }
}
