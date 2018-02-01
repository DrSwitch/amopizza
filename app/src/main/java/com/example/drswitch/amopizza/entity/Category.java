package com.example.drswitch.amopizza.entity;

import android.view.View;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class Category{
    private String gr_name;
    private Product[] products = new Product[]{};

    public String getGr_name() {
        return gr_name;
    }


    public Product[] getProducts() {
        return products;
    }

}
