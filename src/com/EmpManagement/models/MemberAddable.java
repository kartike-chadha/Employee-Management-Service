package com.EmpManagement.models;

import java.util.List;

interface MemberAddable<T> {
    default void addToList(List<T> list, T member) {
        list.add(member);
    }
}
