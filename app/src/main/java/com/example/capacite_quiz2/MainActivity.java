package com.example.capacite_quiz2;

package com.belmonte.exer2_belmonte;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.CheckBox;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity{
    CheckBox it205 ics115 itelec2 ics125 itelec3 itelec4 felec2 felec3;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etext1 = findViewById(R.id.it205);
        etext2 = findViewById(R.id.ics115);
        etext3 = findViewById(R.id.itelec2);
        etext4 = findViewById(R.id.ics125);
        etext5 = findViewById(R.id.itelec3);
        etext6 = findViewById(R.id.itelec4);
        etext7 = findViewById(R.id.felec2);
        etext8 = findViewById(R.id.felec3);
    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences ("data1",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        Set<String> set = new HashSet<>();

        set.add(etext1.getText().toString());
        set.add(etext2.getText().toString());
        set.add(etext3.getText().toString());
        set.add(etext4.getText().toString());
        set.add(etext5.getText().toString());
        set.add(etext6.getText().toString());
        set.add(etext7.getText().toString());
        set.add(etext8.getText().toString());
        editor.putStringSet("schoolSet", set);
        editor.commit();
        Toast.makeText(this,"data saved in data.xml", Toast.LENGTH_LONG).show();
    }


    public void nextVerify(View v){
        startActivity((new Intent(this, Main2Activity.class)));
    }
}
