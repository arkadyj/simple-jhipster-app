package com.jhipster.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
//@AllArgsConstructor
@Table(name = "TASKS")
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NAME")
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    @Column(name = "dueDate")
    private String dueDate;
    @Column(name = "COMPLETED")
    private Boolean completed;

    public Task() {
    }

    public Task(Long id, String name, String dueDate, Boolean completed) {
        this.id=id;
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", completed=" + completed +
                '}';
    }
}
