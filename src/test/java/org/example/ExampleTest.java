package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @org.junit.jupiter.api.Test
    void getMixNumber() {
        Example ex = new Example("id", "name", "description1", 4, 5);
        assertEquals(22, ex.getMixNumber());
    }
}