package org.module;

public class BiologyStudent extends Student implements Citizen{

        private int biologySkill;

        public String getAddress() {
            return "Biology Department";
        }

        public int getIdentityCardNumber() {
            return identityCardNumber;
        }

        public void setBiologySkill(int biologySkill) {

            this.biologySkill = biologySkill;
        }

        public int getBiologySkill() {
            return biologySkill;
        }

    @Override
    public void sayHello() {
        System.out.println("Hello I have a Biology Skill skill of " + biologySkill + "!");
    }

}
