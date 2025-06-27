/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.promanage.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class GenericRepository<T> {
    private List<T> dataList = new ArrayList<>();

    public void add(T data) {
        dataList.add(data);
    }

    public List<T> getAll() {
        return dataList;
    }

    public void clear() {
        dataList.clear();
    }
}
