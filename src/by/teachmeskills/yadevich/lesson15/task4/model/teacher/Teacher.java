package by.teachmeskills.yadevich.lesson15.task4.model.teacher;

import by.teachmeskills.yadevich.lesson15.task4.model.Group;

import java.util.Objects;

public class Teacher extends Group {
    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
