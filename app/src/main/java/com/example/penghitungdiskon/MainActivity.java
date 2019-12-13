package com.example.penghitungdiskon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText eTprice, eTdiscount;
    private TextView result;
    private Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTprice = findViewById(R.id.price);
        eTdiscount = findViewById(R.id.discount);
        result = findViewById(R.id.result);
        count = findViewById(R.id.btnhitung);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer price = Integer.parseInt(eTprice.getText().toString());
                Integer disc = Integer.parseInt(eTdiscount.getText().toString());
                count.setText(String.valueOf(price * disc / 100));
            }
        });
    }
}
