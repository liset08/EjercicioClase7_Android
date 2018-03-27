package pe.edu.tecsup.ejercicioclase7_android.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.ejercicioclase7_android.models.Food;

/**
 * Created by Alumno on 27/03/2018.
 */

public class FoodRepository {
    private static List<Food> food = new ArrayList<>();

    static{
        food.add(new Food(100, "Pizza Familiar",5,  "jsalazar", 15-30));
        food.add( new Food(200, "Hamburguesas",10,  "jsalazar", 15-30) );
        food.add( new Food(300, "Martha Prado",8,  "jsalazar", 15-30) );
        food.add( new Food(400, "Jaime Farfan", 7,  "jsalazar", 15-30) );
        food.add( new Food(500, "Javier Lizarraga",  15,  "jsalazar", 15-30) );


    }

    public static List<Food> getList(){
        return food;
    }

}


