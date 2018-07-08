package com.example.pranayarora.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CheckBox c1,c2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == b1.getId())
        {

        }
        if(c1.isChecked() )
        {
            Toast.makeText(getApplicationContext(),"debit is checked ",Toast.LENGTH_LONG).show();


        }
        if(c2.isChecked())
        {
            Toast.makeText(getApplicationContext(),"credit is checked ",Toast.LENGTH_LONG).show();

        }
    }
}
