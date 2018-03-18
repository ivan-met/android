package com.ivan.exercise.data;

import java.util.Arrays;
import java.util.List;

public class ZooDatabase {

    public static List<Accessory> database;

    public static List<Accessory> getDatabase(){
        if (database == null){
            database = generateData();
        }
        return database;
    }

    private static List<Accessory> generateData() {
        return Arrays.asList(
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?resize=768%2C512&ssl=1"),
                new Accessory(
                        "Cat Bed",
                        "Greatest Cat Bed Ever.",
                        "http://www.chelseacats.co.uk/wp-content/uploads/2015/07/Luxury-Faux-Leather-Mila-Cat-Bed-Nougat-Caramel-2.jpg"
                )
        );
    }
}
