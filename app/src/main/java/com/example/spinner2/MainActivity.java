package com.example.spinner2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spin;
    TextView tv1,tv2,tv3;


    int[] dgalim ={0, R.drawable.italy,R.drawable.irleand,R.drawable.iran,R.drawable.brazil,R.drawable.aostralia,R.drawable.usa,R.drawable.uruguay};

    String [] countrys={"Choose city", "Italy","Irleand","Iran","Brazil","Aostralia", "Usa","Uruguay"};

    String [] capitalse={"", "Roma","Dublin","Tehran","Brasilia","Canbera", "Washington","Montevideo"};

    String [] populatio={"", "59,070,000","5,028,000","85,030,000","214,000,000","25,740,000", "331,900,000","3,485,000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        spin = findViewById(R.id.spin);

        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        spin.setOnItemSelectedListener(this);
        customAdapter customadp = new customAdapter(getApplicationContext(),
                countrys, dgalim, capitalse);
        spin.setAdapter(customadp);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i == 0)
        {
            tv1.setText("");
            tv2.setText("");
            tv3.setText("");

        }
        else {
            tv1.setText(capitalse[i]);
            tv2.setText(countrys[i]);
            tv3.setText(populatio[i]);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
    }
}