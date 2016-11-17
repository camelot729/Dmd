package ru.kpfu.itis.entity.enums;

public enum Period {

    AM9_AM10("9:00 - 10:00"),
    AM10_AM11("10:00 - 11:00"),
    AM11_PM12("11:00 - 12:00");

    private String representation;

    Period(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
