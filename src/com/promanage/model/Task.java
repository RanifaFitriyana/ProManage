/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.promanage.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Task implements Serializable {

    private int id;
    private String title;
    private String description;
    private String status;
    private Date deadline;
    private String attachmentPath;

    public Task(int id, String title, String description, String status, Date deadline, String attachmentPath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
        this.attachmentPath = attachmentPath;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }
}
