package com.faintdream.record.test1;

import java.util.Arrays;

public record Member(Student[] students) {
    @Override
    public String toString() {
        return "Member{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
