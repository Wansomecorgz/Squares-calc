package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSquareOnLimit() {
        SQRService service = new SQRService();
        int expected = 5;
        int actual = service.calculate(200, 100);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSquareOutOfLimit() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(99, 0);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMaxSquare() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculate(9801, 100);

        assertEquals(expected, actual);

    }
}