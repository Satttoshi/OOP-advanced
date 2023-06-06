package org.module;

public class ComputerScienceStudent extends Student {

    private int programmingSkill;

    public void setName2(String name) {
        super.name = name;
    }

    public void setProgrammingSkill(int programmingSkill) {

        this.programmingSkill = programmingSkill;
    }

    public int getProgrammingSkill() {
        return programmingSkill;
    }

    public void sayPointsAmount() {
        System.out.println("Hello I have a programming skill of " + programmingSkill + "!");
    }

}
