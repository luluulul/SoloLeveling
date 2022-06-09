package com.example.myfit;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FoodCalories  extends AppCompatActivity {
    private HashMap _$_findCachedViewById;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_food_calories);
        ListView listview = this.findViewById(R.id.listView);
        boolean var4 = false;
        List list = (List) (new ArrayList());
        TextView calorieText = this.findViewById(R.id.calorieText);
        Button reset = this.findViewById(R.id.reset);
        final TextView value = this.findViewById(R.id.valueCal);
        list.add(new model("Рис", "Варенный рис : 200 ккал", R.drawable.rice_bowl));
        list.add(new model("Пита", "2 Обычной питы : 100 ккал", R.drawable.roti_canai));
        list.add(new model("Суп", "Обычный суп : 50 ккал", R.drawable.dal2));
        list.add(new model("Салат", "Микс из овощей : 50 ккал", R.drawable.salad));
        list.add(new model("Лапша", "Лапша : 140 ккал", R.drawable.noodles));
        list.add(new model("Бургер", "Бургер: 200 ккал", R.drawable.hamburger));
        list.add(new model("Пицца", "Пицца : 250 ккал", R.drawable.pizza));
        list.add(new model("Г. напиток", "Газированный напиток :140 ккал", R.drawable.soft_drink));
        list.add(new model("Яблоко", "Яблоко : 114 ккал", R.drawable.apple));
        list.add(new model("Хлеб", "4 ломтика хлеба :65 ккал", R.drawable.baguette));
        list.add(new model("Торт", "1 кусок торта : 132 ккал", R.drawable.cake));
        list.add(new model("Маффин", "Маффин : 47 ккал", R.drawable.cupcake));
        list.add(new model("Морковь", "Морковь: 30 ккал", R.drawable.carrot));
        list.add(new model("Курица", "Курица : 220 ккал", R.drawable.chicken_leg));
        list.add(new model("Шоколад", "Плитка шоколада : 200 ккал", R.drawable.chocolate));
        list.add(new model("Пончик", "Пончик : 110 ккал", R.drawable.donut));
        list.add(new model("Кекс", "Кекс : 170  ккал", R.drawable.fazuelos));
        list.add(new model("Фри", "Средняя порция фри : 110 ккал", R.drawable.french_fries));
        list.add(new model("Апельсин", "Апельсин : 52 ккал", R.drawable.fruit));
        list.add(new model("Ход-дог", "Ход-дог : 95  ккал", R.drawable.hot_dog));
        list.add(new model("Роллы", "Роллы : 68 ккал", R.drawable.kebab));
        list.add(new model("Чипсы", "Чипсы : 155 ккал", R.drawable.potato_chips));
        list.add(new model("Пломбир", "Пломбир : 110 ккал", R.drawable.sundae));
        list.add(new model("Мороженое", "Мороженое : 100 ккал", R.drawable.parfait));
        list.add(new model("Клубника", "Клубника : 110 ккал", R.drawable.strawberry));
        list.add(new model("Мясо", "250 г. мясо : 300 ккал", R.drawable.meat));
        list.add(new model("Кхичди", "Кхичди : 70 ккал", R.drawable.vegan_food));

        listview.setAdapter(new food_adapter(this, R.layout.listview_row, list));
        ((ListView)this.findViewById(R.id.listView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(@NotNull AdapterView parent, @NotNull View view, int position, long id) {
                TextView var10000;
                TextView var10001;
                String var6;
                boolean var7;

                if (position == 0) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 1) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 2) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 3) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 50));
                }

                if (position == 4) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 5) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 6) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 250));
                }

                if (position == 7) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 140));
                }

                if (position == 8) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 9) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 10) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 114));
                }

                if (position == 11) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 65));
                }


                if (position == 12) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 132));
                }

                if (position == 13) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 47));
                }

                if (position == 14) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 30));
                }

                if (position == 15) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 220));
                }

                if (position == 16) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 200));
                }

                if (position == 17) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 18) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 170));
                }

                if (position == 19) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 20) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 52));
                }

                if (position == 21) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 95));
                }

                if (position == 22) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 68));
                }

                if (position == 23) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 115));
                }


                if (position == 24) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 25) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 100));
                }

                if (position == 26) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 110));
                }

                if (position == 27) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 300));
                }

                if (position == 28) {
                    var10000 = value;
                    var10001 = value;
                    var6 = var10001.getText().toString();
                    var7 = false;
                    var10000.setText(String.valueOf(Integer.parseInt(var6) + 70));
                }

            }

        });
        reset.setOnClickListener(new OnClickListener() {
            public final void onClick(View it) {
                value.setText("0");
            }
        });
    }

}