package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      //  BarChart barChart = new BarChart("Task types report",new ArrayList());
        BarChart chart = BarChart.builder()
                .withFontColor("Black")
                .withFontName("Arial")
                .withHeight(12)
                .build();
        System.out.println(chart.toString());

    }

}
