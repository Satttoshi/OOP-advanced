package org.module;

public class ComputerScienceStudent extends Student implements Citizen{

    private int programmingSkill;
    private int identityCardNumber = 123456789;

    public String getAddress() {
        return "Computer Science Department";
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setProgrammingSkill(int programmingSkill) {

        this.programmingSkill = programmingSkill;
    }

    public int getProgrammingSkill() {
        return programmingSkill;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello I have a programming skill of " + programmingSkill + "!");
    }

}
