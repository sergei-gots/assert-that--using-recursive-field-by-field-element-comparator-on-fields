package org.example.org.example.model;

import java.util.Objects;

public class Person {
    private static long lastPersonId;
    long id;

    public Person(String name, String surname, int birthYear) {
        this.id = 1;
        //this.id = lastPersonId++;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    String name;
    String surname;
    int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
