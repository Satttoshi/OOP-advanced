package org.module;

public class ComputerScienceStudent extends Student implements Citizen {

    private int programmingSkill;

    public String getAddress() {
        return "Address";
    }

    public int getIdentityCardNumber() {
        return 123456789;
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
