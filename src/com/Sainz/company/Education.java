package com.Sainz.company;

public class Education {
    public String degreeType;
    public String universityName;
    public String yearGraduated;

    @Override
    public String toString () {
        return "Degree type: " + degreeType + '\n' + "University name: " + universityName + '\n'
                + "Year graduated: " + yearGraduated;
    }


    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(String yearGraduated) {
        this.yearGraduated = yearGraduated;
    }
}
