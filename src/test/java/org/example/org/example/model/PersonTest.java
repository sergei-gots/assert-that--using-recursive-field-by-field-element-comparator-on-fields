package org.example.org.example.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {
    @Test
    public void  test() {
        List<Person> list1 = List.of(new Person("John", "Johnson", 1990));
        List<Person> list2 = List.of(new Person("John", "Johnson", 1990));
        List<Person> list3 = List.of(new Person("Not-a-John", "Johnson", 1990));

        assertThat(list1)
                .usingRecursiveFieldByFieldElementComparatorOnFields("name")
                .containsExactlyInAnyOrderElementsOf(list2);

        assertThat(list1)
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id", "name")
                .containsExactlyInAnyOrderElementsOf(list3);
    }


}