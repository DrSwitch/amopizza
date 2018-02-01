package com.example.drswitch.amopizza.entity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class Product {
    private int id;
    //название продукта
    private String name;
    //ссылка на фото
    private String img_url;
    //описание
    private String desc;

    private String label_text;

    private String label_color;

    //массив с размерами и ценами (может быть null)
    private Size_price[] size_price = new Size_price[]{};

    public String getName() {
        return name;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getDesc() {
        return desc;
    }

    public String getLabel_text() {
        return label_text;
    }

    public Size_price[] getSize_price() {
        return size_price;
    }

    @Override
    public String toString() {
        return name + '\n' + desc + '\n' + label_text;
    }
}
