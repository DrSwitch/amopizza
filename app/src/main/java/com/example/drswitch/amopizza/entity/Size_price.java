package com.example.drswitch.amopizza.entity;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class Size_price {
    public String article;
    public String size;
    public String price;

    @Override
    public String toString() {
        if (size==null){
            return "Цена:" + price;

        }else{
            return "Размер:"+size + ", Цена:" + price;
        }
    }
}
