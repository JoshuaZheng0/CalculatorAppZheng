package com.example.calculatorappzheng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public double Calculate(String sign, String input){
        double num = Double.parseDouble(secondVar(input));
        if(sign.equals("+")){
            return firstVar+num;
        }
        if(sign.equals("-")){
            return firstVar-num;
        }
        if(sign.equals("/")){
            return (double)Math.round((double)firstVar/num * 100000d) / 100000d;
        }
        if(sign.equals("^")){
            return Math.pow(firstVar, num);
        }
        if(sign.equals("×")){
            return firstVar*num;
        }

        return 0;

    }

    public boolean CheckNum(String str){
        if(str.equals("")){
            return true;
        }
        if(!secondVar(str).equals("0")){
            return true;
        }
        if(str.substring(str.length()-1).equals("+")){
            return true;
        }
        if(str.substring(str.length()-1).equals("-")){
            return true;
        }
        if(str.substring(str.length()-1).equals("×")){
            return true;
        }
        if(str.substring(str.length()-1).equals("/")){
            return true;
        }
        if(str.substring(str.length()-1).equals(".")){
            return true;
        }
        if(str.substring(str.length()-1).equals("^")){
            return true;
        }
        if(str.substring(str.length()-1).equals("e")){
            return true;
        }
        if(str.substring(str.length()-1).equals("π")){
            return true;
        }
        return false;
    }

    public String secondVar(String str){
        if(str.indexOf('+') != -1){
            return str.substring(str.indexOf("+")+1);
        }
        if(str.indexOf('-') != -1){
            return str.substring(str.indexOf("-")+1);
        }
        if(str.indexOf('/') != -1){
            return str.substring(str.indexOf("/")+1);
        }
        if(str.indexOf('^') != -1){
            return str.substring(str.indexOf("^")+1);
        }
        if(str.indexOf('×') != -1){
            return str.substring(str.indexOf("×")+1);
        }
        return "0";
    }

    TextView textView;
    TextView subText;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;

    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b19;
    Button b20;
    public double firstVar = 0;
    public String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.font);
        subText = findViewById(R.id.subText);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
        b15 = findViewById(R.id.button15);
        b16 = findViewById(R.id.button16);
        b17 = findViewById(R.id.button17);
        b18 = findViewById(R.id.button18);
        b19 = findViewById(R.id.button19);
        b20 = findViewById(R.id.button20);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Double.parseDouble(input);
                    sign = "/";
                    textView.append("/");
                }
                else{
                    subText.setText("can't use ÷");
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("4");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("5");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("6");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Double.parseDouble(input);
                    sign = "×";
                    textView.append("×");
                }
                else{
                    subText.setText("can't use ×");
                }


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("7");

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("8");

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("9");

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Double.parseDouble(input);
                    sign = "-";
                    textView.append("-");
                }
                else{
                    subText.setText("can't use -");
                }

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView.getText().toString();
                if(!input.substring(input.length()-1).equals("0")){
                    textView.append("0");
                }
                else{
                    textView.setText("can't type 0");
                }


            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("");

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)&&(input.indexOf('.') == -1)){
                    textView.append(".");
                }
                else{
                    subText.setText("can't use .");
                }

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Double.parseDouble(input);
                    sign = "+";
                    textView.append("+");
                }
                else{
                    subText.setText("can't use +");
                }


            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(secondVar(input).equals("")) {
                    textView.append("2.71828");
                }
                if(input.equals("")){
                    textView.append("2.71828");
                }
                else{
                    subText.setText("can't click");
                }


            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView.getText().toString();
                if(secondVar(input).equals("")) {
                    textView.append("3.14159");
                }
                if(input.equals("")){
                    textView.append("3.14159");
                }
                else{
                    subText.setText("can't click");
                }

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Double.parseDouble(input);
                    sign = "^";
                    textView.append("^");
                }
                else{
                    subText.setText("can't use ^");
                }

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView.getText().toString();
                if(!input.equals("")){
                    subText.setText("");
                    subText.append(firstVar + " " + sign + " " + Double.parseDouble(secondVar(input)));

                    textView.setText("");
                    textView.append( String.valueOf(Calculate(sign, input)));
                }
                else{
                    subText.setText("can't use =");
                }


            }
        });


    }
}