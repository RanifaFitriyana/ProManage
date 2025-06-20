/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.promanage.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class Task implements Serializable {

    private String title;
    private String description;
    private String status; // TODO, IN_PROGRESS, DONE
    private LocalDate deadline;
    private String attachmentPath;

    public Task(String title, String description, String status, LocalDate deadline, String attachmentPath) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
        this.attachmentPath = attachmentPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

}
