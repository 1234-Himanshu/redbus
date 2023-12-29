package com.redbus.operator.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.redbus.operator.util.CustomDateDeserializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Table(name = "bus_operators")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        description = "this is the product entity"
)
public class BusOperator {

    @Id
    @Column(name="bus_id")
    private String busId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="bus_id")
    private TicketCost ticketCost;

    @Column(name="bus_number")
    private String busNumber;
    @Column(name="bus_operator_company_name")
    private String busOperatorCompanyName;
    @Column(name="bus_driver_name")
    private String driverName;
    @Column(name="support_staff")
    private String supportStaff;
    @Column(name="number_of_seats")
    private int numberSeats;
    @Column(name="departure_city")
    private String departureCity;
    @Column(name="arrival_city")
    private String arrivalCity;
  //  @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "departure_time")
    private LocalTime departureTime;

   // @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "arrival_time")
    private LocalTime arrivalTime;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @Temporal(TemporalType.DATE)
    @Column(name = "departure_date")
    private Date departureDate;
   @JsonFormat(pattern = "dd/MM/yyyy")
 //   @JsonDeserialize(using = CustomDateDeserializer.class)
   @Temporal(TemporalType.DATE)
    @Column(name = "arrival_date")
    private Date arrivalDate;


    @Column(name="total_travel_time")
    private double totalTravelTime;
    @Column(name="bus_type")
    private String busType;
    @Column(name="amenities")
    private String amenities;

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusOperatorCompanyName() {
        return busOperatorCompanyName;
    }

    public void setBusOperatorCompanyName(String busOperatorCompanyName) {
        this.busOperatorCompanyName = busOperatorCompanyName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSupportStaff() {
        return supportStaff;
    }

    public void setSupportStaff(String supportStaff) {
        this.supportStaff = supportStaff;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public double getTotalTravelTime() {
        return totalTravelTime;
    }

    public void setTotalTravelTime(double totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public TicketCost getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(TicketCost ticketCost) {
        this.ticketCost = ticketCost;
    }
}
