package com.asd.cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.text.DecimalFormat;


/**
 * Created by asd on 8/6/2015.
 */
public class CalculatorActivity extends Activity implements View.OnClickListener {
    float num1;
    float var;
    float num2;
    TextView tv;
    String op;
    TextView tv22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Button c = (Button) findViewById(R.id.btn1);
        c.setOnClickListener(this);
        Button x = (Button) findViewById(R.id.btn2);
        x.setOnClickListener(this);
        Button b1 = (Button) findViewById(R.id.btn3);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.btn4);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.btn5);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.btn6);
        b4.setOnClickListener(this);
        Button e = (Button) findViewById(R.id.btn7);
        e.setOnClickListener(this);

        final Button n1 = (Button) findViewById(R.id.button5);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.button6);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.button7);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.button8);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.button9);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.button10);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.button11);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.button12);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.button13);
        n9.setOnClickListener(this);
        final Button n0 = (Button) findViewById(R.id.button14);
        n0.setOnClickListener(this);
        final Button dot = (Button) findViewById(R.id.button15);
        dot.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.tv1);
        tv22 = (TextView) findViewById(R.id.tv2);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button5:
                tv.append("1");
                break;
            case R.id.button6:
                tv.append("2");
                break;
            case R.id.button7:
                tv.append("3");
                break;
            case R.id.button8:
                tv.append("4");
                break;
            case R.id.button9:
                tv.append("5");
                break;
            case R.id.button10:
                tv.append("6");
                break;
            case R.id.button11:
                tv.append("7");
                break;
            case R.id.button12:
                tv.append("8");
                break;
            case R.id.button13:
                tv.append("9");
                break;
            case R.id.button14:
                tv.append("0");
                break;
            case R.id.button15:
                tv.append(".");
                break;
            //Numbers have been set
            //operations to be performed
            case R.id.btn3:
                op = "+";
                num1 = Float.valueOf(tv.getText().toString());
                tv.setText("");
                break;
            case R.id.btn4:
                op = "-";
                num1 = Float.valueOf(tv.getText().toString());
                tv.setText("");
                break;
            case R.id.btn5:
                op = "*";
                num1 = Float.valueOf(tv.getText().toString());
                tv.setText("");
                break;
            case R.id.btn6:
                op = "/";
                num1 = Float.valueOf(tv.getText().toString());
                tv.setText("");
                break;
            // Equal to
            //Solution -> answer
            case R.id.btn7:
                num2 = Float.valueOf(tv.getText().toString());
                if (op == "+") {
                    var = num1 + num2;
                }
                if (op == "-") {
                    var = num1 - num2;
                }
                if (op == "*") {
                    var = num1 * num2;
                }
                if (op == "/") {
                    if (num2 == 0)
                        var = 0;
                    else
                        var = num1 / num2;
                }
                if (op == "") {
                    var = num1;
                }

                DecimalFormat decimalFormat = new DecimalFormat("#.#");

                tv22.setText(String.valueOf(decimalFormat.format(num1)) + " " + String.valueOf(op) + " " + String.valueOf(decimalFormat.format(num2)));
                tv.setText(String.valueOf(decimalFormat.format(var)));
                break;

            case R.id.btn1:
                op = "";
                num1 = 0;
                num2 = 0;
                tv.setText("");
                tv22.setText("");
                break;
            case R.id.btn2:
                String text = tv.getText().toString();
                tv.setText(text.substring(0, text.length() - 1));

                break;
        }

    }

}


