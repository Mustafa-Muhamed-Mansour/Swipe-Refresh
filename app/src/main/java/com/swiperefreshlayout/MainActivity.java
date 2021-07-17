package com.swiperefreshlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    SwipeRefreshLayout swipeRefreshLayout;
    TextView textViewNumber;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        textViewNumber = findViewById(R.id.txt_number);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()
        {
            @Override
            public void onRefresh()
            {
                number++;
                textViewNumber.setText(number + "");
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }
}