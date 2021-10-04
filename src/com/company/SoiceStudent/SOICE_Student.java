package com.company.SoiceStudent;

import com.company.Student;

public class SOICE_Student extends Student {
    private  double oop1;
    private double intro_to_IT;

    public SOICE_Student(){

    }
    public  SOICE_Student( String sn, int sid,double eng,double m,double op1,double iti){
        super(sn,sid,eng,m);
        this.oop1         = op1;
        this.intro_to_IT  = iti;
    }

    public double getOop1() {
        return oop1;
    }

    public void setOop1(double oop1) {
        this.oop1 = oop1;
    }


    public double getIntro_to_IT() {
        return intro_to_IT;
    }

    public void setIntro_to_IT(double intro_to_IT) {
        this.intro_to_IT = intro_to_IT;
    }

    public double total_Score() {
        return this.oop1 + this.intro_to_IT + super.total_Score();
    }

    public String toString()
    {
        return String.format("%f" +this.total_Score());
    }

}
