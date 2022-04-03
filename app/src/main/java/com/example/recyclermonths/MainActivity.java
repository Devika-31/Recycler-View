//recycler view version 1

package com.example.recyclermonths;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rvMonths;
private ArrayList <String> monthsListDataSource;
private MonthsAdapter monthsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiUI();

    }

    private void intiUI() {

        monthsListDataSource =new ArrayList<>();
        for (int i=0;i<=100;i++){
        monthsListDataSource.add("January ");
        monthsListDataSource.add("February ");
        monthsListDataSource.add("March ");
        monthsListDataSource.add("April ");
        monthsListDataSource.add("May ");
        monthsListDataSource.add("June ");
        monthsListDataSource.add("July ");
        monthsListDataSource.add("August ");
        monthsListDataSource.add("September ");
        monthsListDataSource.add("October ");
        monthsListDataSource.add("November ");
        monthsListDataSource.add("December ");
        }
    rvMonths=findViewById(R.id.rvMonths);
    monthsAdapter=new MonthsAdapter(monthsListDataSource);
    rvMonths.setAdapter(monthsAdapter);
    rvMonths.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL
    ,false));
    }
}