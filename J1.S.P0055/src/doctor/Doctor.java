/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

/**
 *
 * @author phank
 */
public class Doctor {

    private String code;
    private String name;
    private String specialization;
    private int availability;

    public Doctor(String code, String name, String specialization, int availability) {
        if (name.matches(cst.recode)
                && code.matches(cst.recode)
                && specialization.matches(cst.respe)
                && availability >= 0) {
            this.code = code;
            this.name = name;
            this.specialization = specialization;
            this.availability = availability;
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws Exception {
        if (code.matches(cst.recode)) {
            this.code = code;
        } else {
            throw new Exception("Doctor ID is not valid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.matches(cst.rename)) {
            this.name = name;
        } else {
            throw new Exception("Doctor Name is not valid");
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) throws Exception {
        if (specialization.matches(cst.respe)) {
            this.specialization = specialization;
        } else {
            throw new Exception("Doctor Specialization is not valid");
        }
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) throws Exception {
        if (availability >= 0) {
            this.availability = availability;
        } else {
            throw new Exception("Doctor Availability is not valid");
        }
    }

    @Override
    public String toString() {
        return String.format("%5s %10s %10s %d\n", getCode(), getName(), getSpecialization(), getAvailability());
    }
}
