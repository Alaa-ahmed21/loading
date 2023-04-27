package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    ProgressBar pb_progress;
    TextView order_top,loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<drv_products> drv_productsList =new ArrayList<>();

        drv_products product1= new drv_products();
        product1.setProductimage(R.drawable.apple_watch);
        product1.setProductname("apple watch");
        product1.setQuantity("10");
        product1.setPrice("1000$");

        drv_products product2= new drv_products();
        product2.setProductimage(R.drawable.oppof19);
        product2.setProductname("oppo f19");
        product2.setQuantity("6");
        product2.setPrice("600$");

        drv_products product3= new drv_products();
        product3.setProductimage(R.drawable.earbudsm4);
        product3.setProductname("apple earbud");
        product3.setQuantity("30");
        product3.setPrice("1500$");

        drv_productsList.add(product1);
        drv_productsList.add(product2);
        drv_productsList.add(product3);

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_order);
        productAdapter adapter = new productAdapter(drv_productsList,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
        pb_progress =findViewById(R.id.prog_bar);
        order_top =findViewById(R.id.order_bar);
        loading =findViewById(R.id.text_View);
    }
}