package com.Sainz.company;

//had to include both of the lines below
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Experience {
    private String title;
    private String employer;
    private String startDate;
    private String endDate;
    private String duties;

    @Override
    public String toString() {
        return "Employer: " + employer + '\n' + "Title: " + title + '\n' + "Start date: " + startDate +
                '\n' + "End date: " + endDate + '\n' + "Responsibilities: " + duties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        //added the below lines
        if(endDate.isEmpty() || endDate==null ) {
            endDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        }
        this.endDate = endDate;
    }
}