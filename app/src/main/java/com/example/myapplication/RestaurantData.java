package com.example.myapplication;

import java.sql.Array;
import java.util.ArrayList;

public class RestaurantData {
    private static String [] restaurantName = {
      "Restaurant a",
      "Restaurant b",
      "Restaurant c",
      "Restaurant d",
      "Restaurant e",
      "Restaurant f",
      "Restaurant g",
      "Restaurant h",
      "Restaurant i",
      "Restaurant j"
    };

    private static String [] restaurantInformation = {
      "Restaurant a dengan menu utamanya Bakpia",
      "Restaurant b memiliki nuansa alam liar",
      "Restaurant c dengan keunikan design ruangannya",
      "Restaurant d dengan menu utamanya ikan mentah",
      "Restaurant e memili ciri khas masakan padang",
      "Restaurant f selalu menjadi pilihan karena lokasinya yang strategis",
      "Restaurant g pelayanannya yang unik memiliki daya tarik tersendiri",
      "Restaurant h setiap minggu diskon besar - besaran",
      "Restaurant i makan sepuasnya",
      "Restaurant j memiliki menu andalan nasi goreng Mesir"
    };

    private static int[] restaurantImage = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
    };

    static ArrayList<Restourant> getListData(){
        ArrayList<Restourant> list = new ArrayList<>();
        for (int position = 0; position <restaurantName.length; position++) {
            Restourant restourant = new Restourant();
            restourant.setName(restaurantName[position]);
            restourant.setInformation(restaurantInformation[position]);
            restourant.setPhoto(restaurantImage[position]);
            list.add(restourant);
        }
        return list;
    }
}
