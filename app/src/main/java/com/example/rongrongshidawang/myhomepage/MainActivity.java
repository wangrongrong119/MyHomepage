package com.example.rongrongshidawang.myhomepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button but1=findViewById(R.id.phone);

        final TextView tv1=findViewById(R.id.tv1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("18810638392");

            }
        });

        Button but2=findViewById(R.id.email);

        final TextView tv2=findViewById(R.id.tv2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("2120171070@bit.edu.cn");


            }
        });

    }
}
