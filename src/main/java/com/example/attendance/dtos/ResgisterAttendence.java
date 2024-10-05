package com.example.attendance.dtos;
import java.time.Instant;
public class ResgisterAttendence {

    private Integer customer_id;
    private Integer employee_id;
    private Instant time_in;
    private Instant time_out;

    public ResgisterAttendence(Integer customer_id, Integer employee_id, Instant time_in, Instant time_out) {
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.time_in = time_in;
        this.time_out = time_out;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Instant getTime_in() {
        return time_in;
    }

    public void setTime_in(Instant time_in) {
        this.time_in = time_in;
    }

    public Instant getTime_out() {
        return time_out;
    }

    public void setTime_out(Instant time_out) {
        this.time_out = time_out;
    }
}
