package com.example.attendance.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id", nullable = false)
    private Integer id;

    @Column(name="employee_id")
    private Integer employee_id;

    @Column(name = "customer_id")
    private Integer customerId;


    @Column(name = "time_in")
    private Instant timeIn;

    @Column(name = "time_out")
    private Instant timeOut;

    @Column(name = "photo", length = Integer.MAX_VALUE)
    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Instant timeIn) {
        this.timeIn = timeIn;
    }

    public Instant getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Instant timeOut) {
        this.timeOut = timeOut;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}