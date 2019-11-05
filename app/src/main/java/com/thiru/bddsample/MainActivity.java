package com.thiru.bddsample;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button convert;
    private EditText decimal;
    private EditText roman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        decimal = (EditText)findViewById(R.id.etDecimal);
        roman = (EditText)findViewById(R.id.etRoman);
        convert = findViewById(R.id.btnConvert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int decimalVal = Integer.valueOf(decimal.getText().toString());
                roman.setText(convertToRoman(decimalVal));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String convertToRoman(int decimal) {
        LinkedHashMap<Integer, String> romanList = new LinkedHashMap<>(5);
        romanList.put(100, "C");
        romanList.put(90, "XC");
        romanList.put(50, "L");
        romanList.put(40, "XL");
        romanList.put(10, "X");
        romanList.put(9, "IX");
        romanList.put(5, "V");
        romanList.put(4, "IV");
        romanList.put(1, "I");

        String roman = "";

        for (Map.Entry<Integer, String> entry : romanList.entrySet()) {
            while (decimal >= entry.getKey()) {
                roman += entry.getValue();
                decimal -= entry.getKey();
            }
        }
        return roman;
    }
}
