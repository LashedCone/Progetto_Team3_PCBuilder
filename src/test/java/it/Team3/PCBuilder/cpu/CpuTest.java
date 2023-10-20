package it.Team3.PCBuilder.cpu;

import it.Team3.PCBuilder.motherboard.Motherboard;
import it.Team3.PCBuilder.utilities.Component;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpuTest {

    @Test
    void isCompatibleWith() {
        Cpu i911900K = new Cpu(1, 0, "Intel", "Core i9-11900K",
                8, "3.5 GHz", "5.3 GHz", 125,
                "Core i9", "LGA 1200", "No", "128 GB");

        Motherboard gigabyteB460MDS3H = new Motherboard(10, 0, "GIGABYTE", "B460M DS3H", "LGA 1200",
                "Micro-ATX", "B460", 64, "DDR4", 4,
                "2933 MHz", 1, 1, 1, 1, 2,
                "1 x M.2", 6, "1 Gigabit Ethernet", "None");

        boolean isCompatibleWith = i911900K.isCompatibleWith(gigabyteB460MDS3H);

        Assertions.assertTrue(i911900K.isCompatibleWith(gigabyteB460MDS3H));

    }
}