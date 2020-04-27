package com.example.smarthomesimple;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        List<Entry> entries = new ArrayList<Entry>();

        ArrayList<Integer> list = (ArrayList<Integer>) getIntent().getSerializableExtra("DATA");

        LineChart chart = (LineChart) findViewById(R.id.chart);

        for (int i = 0; i < list.size(); i++) {
            entries.add(new Entry(i, list.get(i)));
        }

        LineDataSet dataSet = new LineDataSet(entries, "Label"); // add entries to dataset

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.invalidate();


    }
}

