package com.example.calculatorappzheng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public double Calculate(String sign){
        String input = textView.getText().toString();
        Integer.parseInt(secondInt(input));
        if(sign.equals("+")){
            return firstVar+Integer.parseInt(secondInt(input));
        }
        if(sign.equals("-")){
            return firstVar-Integer.parseInt(secondInt(input));
        }
        if(sign.equals("/")){
            return (double) firstVar/Integer.parseInt(secondInt(input));
        }
        if(sign.equals("^")){
            return firstVar^Integer.parseInt(secondInt(input));
        }
        if(sign.equals("×")){
            return firstVar*Integer.parseInt(secondInt(input));
        }

        return 0;

    }

    public boolean CheckNum(String str){
        int num = str.length() - 1;
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

    public String secondInt(String str){
        if(str.indexOf('+') != -1){
            return str.substring(str.indexOf("+"));
        }
        if(str.indexOf('-') != -1){
            return str.substring(str.indexOf("-"));
        }
        if(str.indexOf('/') != -1){
            return str.substring(str.indexOf("/"));
        }
        if(str.indexOf('^') != -1){
            return str.substring(str.indexOf("^"));
        }
        if(str.indexOf('×') != -1){
            return str.substring(str.indexOf("×"));
        }

    }

    TextView textView;
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
    public int firstVar = 0;
    public String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.font);
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
                    firstVar = Integer.parseInt(input);
                    sign = "/";
                    textView.append("/");
                }
                else{
                    textView.setText("cannot calculate");
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
                    firstVar = Integer.parseInt(input);
                    sign = "×";
                    textView.append("×");
                }
                else{
                    textView.setText("cannot calculate");
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
                    firstVar = Integer.parseInt(input);
                    sign = "-";
                    textView.append("-");
                }
                else{
                    textView.setText("cannot calculate");
                }

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.append("0");

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
                if(!CheckNum(input)){
                    textView.append(".");
                }
                else{
                    textView.setText("cannot calculate");
                }

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Integer.parseInt(input);
                    sign = "+";
                    textView.append("+");
                }
                else{
                    textView.setText("cannot calculate");
                }


            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    textView.append("e");
                }
                else{
                    textView.setText("cannot calculate");
                }

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    textView.append("π");
                }
                else{
                    textView.setText("cannot calculate");
                }


            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                if(!CheckNum(input)){
                    firstVar = Integer.parseInt(input);
                    sign = "^";
                    textView.append("^");
                }
                else{
                    textView.setText("cannot calculate");
                }

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();


                textView.setText("");
                textView.append( String.valueOf(Calculate(sign)));

            }
        });


    }
}