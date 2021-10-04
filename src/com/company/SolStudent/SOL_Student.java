package com.company.SolStudent;

import com.company.Student;

public class SOL_Student extends Student {
    private double computerProgramming;
    private double intro_to_Eco;

    public SOL_Student(){

    }
    public SOL_Student(String sn,int sid, double eng, double m,double cp,double ite){
        super(sn, sid, eng, m);
        this.computerProgramming = cp;
        this.intro_to_Eco        = ite;
    }

    public double getComputerProgramming() {
        return computerProgramming;
    }

    public void setComputerProgramming(double computerProgramming) {
        this.computerProgramming = computerProgramming;
    }

    public double getIntro_to_Eco() {
        return intro_to_Eco;
    }

    public void setIntro_to_Eco(double intro_to_Eco) {
        this.intro_to_Eco = intro_to_Eco;
    }

    public double total_Score() {
        return this.computerProgramming +this.intro_to_Eco + super.total_Score();
    }

    public String toString()
    {
        return String.format("%f" +this.total_Score());
    }
}
