package enyity;

import org.springframework.stereotype.Component;

public class TestEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
