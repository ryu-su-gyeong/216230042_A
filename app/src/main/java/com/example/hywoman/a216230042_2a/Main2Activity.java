package com.example.hywoman.a216230042_2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=(EditText)findViewById(R.id.edit);
    }
    public void num(View v){
        switch (v.getId()){
            case R.id.b_num0:
                editText.append("0");
                break;
            case R.id.b_num1:
                editText.append("1");
                break;
            case R.id.b_num2:
                editText.append("2");
                break;
            case R.id.b_num3:
                editText.append("3");
                break;
            case R.id.b_num4:
                editText.append("4");
                break;
            case R.id.b_num5:
                editText.append("5");
                break;
            case R.id.b_num6:
                editText.append("6");
                break;
            case R.id.b_num7:
                editText.append("7");
                break;
            case R.id.b_num8:
                editText.append("8");
                break;
            case R.id.b_num9:
                editText.append("9");
                break;
        }
    }
}

