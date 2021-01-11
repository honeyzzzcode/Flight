package com.ZLATA;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class QuestionType extends Main{
    private String depatrureZone;
    private LocalDate departureDate;
    private LocalTime departureTime;

    private String arrivalZone;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;
    public String getDepatrureZone() {
        return depatrureZone;
    }

    public void setDepatrureZone(String depatrureZone) {
        this.depatrureZone = depatrureZone;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalZone() {
        return arrivalZone;
    }

    public void setArrivalZone(String arrivalZone) {
        this.arrivalZone = arrivalZone;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public void askData() {
        depatrureZone = InputUtils.askString("Enter departure zone");
        departureDate = InputUtils.askDate("Enter date of departure");
        departureTime = InputUtils.askTime("Enter departure time");
        arrivalZone = InputUtils.askString("Enter departure zone");

    }
}
