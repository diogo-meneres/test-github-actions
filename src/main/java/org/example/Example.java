package org.example;

public class Example {
    private String id;
    private String name;
    private String description;
    private Integer number1;
    private Integer number2;

    public Example(String id, String name, String description, Integer number1, Integer number2) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.number1 = number1;
        this.number2 = number2;
    }

    public Integer getMixNumber() {
        return number1*number2;
    }
}
