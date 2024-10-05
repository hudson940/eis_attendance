package com.example.attendance.controllers;

import com.example.attendance.entity.Attendance;
import com.example.attendance.repositories.AttendanceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/attendance")
@RestController
public class AttendanceController {

    private final AttendanceRepository attendanceRepository;

    public AttendanceController(AttendanceRepository attendanceRepository){
        this.attendanceRepository = attendanceRepository;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Attendance attendance){
        try{

            final Attendance newAttendance = new Attendance();

            newAttendance.setTimeIn(attendance.getTimeIn());
            newAttendance.setTimeOut(attendance.getTimeOut());
            newAttendance.setCustomerId(attendance.getCustomerId());
            newAttendance.setEmployee_id(attendance.getEmployee_id());
            var saveAtt = attendanceRepository.save(newAttendance);
            return ResponseEntity.ok(saveAtt);
        }
        catch(Exception e){
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
