package com.Sainz.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person newPerson;
        Education newEducation;
        Experience newExperience;
        Skills newSkills;

        ArrayList<Person> persons = new ArrayList();

        for (int x=1; x<=1; x++)

        {
            newPerson = new Person();
            System.out.println("Enter details about yourself");
            System.out.println("Enter your first name:");
            newPerson.setFirstName(scan.nextLine());
            System.out.println("Enter your last name:");
            newPerson.setLastName(scan.nextLine());
            System.out.println("Enter your email address");
            newPerson.setEmailAddress(scan.nextLine());
            System.out.println("Enter your phone number");
            newPerson.setPhoneNumber(scan.nextLine());

            persons.add(newPerson);
        }

        boolean done= false;
        String answer;

        ArrayList<Education> background = new ArrayList();

        do {

            newEducation = new Education();
            System.out.println("Enter details about your education");
            System.out.println("Enter your degree type (bachelor's, master's, etc):");
            newEducation.setDegreeType(scan.nextLine());
            System.out.println("Enter your university name");
            newEducation.setUniversityName(scan.nextLine());
            System.out.println("Enter the year you graduated");
            newEducation.setYearGraduated(scan.nextLine());

            background.add(newEducation);

            System.out.println("Do you want to enter information for another degree?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }

        }while (done);

        ArrayList<Experience> history = new ArrayList();

        do {

            newExperience = new Experience();
            System.out.println("Enter details about your work experience");
            System.out.println("What is the name of a past or current employer?");
            newExperience.setEmployer(scan.nextLine());
            System.out.println("What was or is your title at that employer?");
            newExperience.setTitle(scan.nextLine());
            System.out.println("What date did you start working there?");
            newExperience.setStartDate(scan.nextLine());
            System.out.println("What date did you stop working there?");
            newExperience.setEndDate(scan.nextLine());
            System.out.println("What were or are your responsibilities there?");
            newExperience.setDuties(scan.nextLine());

            history.add(newExperience);

            System.out.println("Do you want to enter information for another employer?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }

        }while(done);

        ArrayList<Skills> talent = new ArrayList();

        do {
            newSkills = new Skills();
            System.out.println("Skills section");
            System.out.println("Enter a skill you have:");
            newSkills.setSkillName(scan.nextLine());
            System.out.println("Enter your proficiency in that skill (basic, advanced, etc):");
            newSkills.setSkillProficiency(scan.nextLine());

            talent.add(newSkills);

            System.out.println("Do you want to enter information for another skill?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                done = true;
            } else {
                done = false;
            }
        }while(done);


        System.out.println("==============");
        System.out.println("Contact Information");
        for (Person eachPerson: persons)

        {
            System.out.println('\n' + eachPerson.toString());
        }

        System.out.println("==============");
        System.out.println("Education Information");
        for (Education eachEducation: background)

        {
            System.out.println('\n' + eachEducation.toString());
        }

        System.out.println("=============");
        System.out.println("Work Experience");
        for (Experience eachExperience: history)

        {
            System.out.println('\n' + eachExperience.toString());
        }
        System.out.println("=============");
        System.out.println("Skills");
        for (Skills eachSkills: talent)

        {
            System.out.println('\n' + eachSkills.toString());
        }
    }
}
