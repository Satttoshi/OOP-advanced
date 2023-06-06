package org.module;

abstract class Student {

    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract void sayHello();

}

