package org.module;

abstract class Student {

    public String name;
    public int identityCardNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }
    public String getName() {
        return name;
    }

    abstract void sayHello();

}

