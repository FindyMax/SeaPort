package com.example.seaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);

        income rent = new rent(1, "Аренда площадей порта", 170_000);
        income service = new service(2, "Обслуживание морских судов", 3_500, 125);

        output.setText(rent.allIncome() + service.allIncome() + " монет заработает морской порт за месяц");
    }
}