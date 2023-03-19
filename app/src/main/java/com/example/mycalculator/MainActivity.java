package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private String sayi1 = "";
    private String sayi2 = "";
    private String islem = "";
    private double sonuc=0;
    private int sayac=0;

    private String temp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main);

        tasarim.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "1";
                }else{
                    sayi2 += "1";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"1");
            }
        });

        tasarim.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "2";
                }else{
                    sayi2 += "2";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"2");
            }
        });

        tasarim.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "3";
                }else{
                    sayi2 += "3";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"3");
            }
        });

        tasarim.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "4";
                }else{
                    sayi2 += "4";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"4");
            }
        });

        tasarim.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "5";
                }else{
                    sayi2 += "5";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"5");
            }
        });

        tasarim.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "6";
                }else{
                    sayi2 += "6";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"6");
            }
        });

        tasarim.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "7";
                }else{
                    sayi2 += "7";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"7");
            }
        });

        tasarim.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "8";
                }else{
                    sayi2 += "8";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"8");
            }
        });

        tasarim.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "9";
                }else{
                    sayi2 += "9";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"9");
            }
        });

        tasarim.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += "0";
                }else{
                    sayi2 += "0";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"0");
            }
        });

        tasarim.buttonvirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("")){
                    sayi1 += ".";
                }else{
                    sayi2 += ".";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+".");
            }
        });

        tasarim.buttonarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "+";
                if(sayi2.equals("")){
                    sayi2 = "0";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"+");
                sayi1 =  String.valueOf(Double.parseDouble(sayi1) + Double.parseDouble(sayi2));
                sayi2 = "";
            }
        });

        tasarim.buttoneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "-";
                if(sayi2.equals("")){
                    sayi2 = "0";
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText()+"-");
                sayi1 =  String.valueOf(Double.parseDouble(sayi1) - Double.parseDouble(sayi2));
                sayi2 = "";
            }
        });

        tasarim.buttoncarpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "x";
                if(sayac == 0 || sayi2.equals("")){
                    sayi2 = "1";
                    sayac = 1;
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText() + "x");
                sayi1 = String.valueOf(Double.parseDouble(sayi1) * Double.parseDouble(sayi2));
                sayi2 = "";
            }
        });
        tasarim.buttonbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "/";
                if(sayac == 0 || sayi2.equals("")){
                    sayi2 = "1";
                    sayac = 1;
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText() + "/");
                sayi1 = String.valueOf(Double.parseDouble(sayi1) / Double.parseDouble(sayi2));
                sayi2 = "";
            }
        });
        tasarim.buttonyuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "%";
                if(sayac == 0 || sayi2.equals("")){
                    sayi2 = "100";
                    sayac = 1;
                }
                tasarim.textViewIslem.setText(tasarim.textViewIslem.getText() + "%");
                sayi1 = String.valueOf((Double.parseDouble(sayi1) * Double.parseDouble(sayi2)) / 100);
                sayi2 = "";
            }
        });
        tasarim.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1 = "";
                sayi2 = "";
                tasarim.textViewIslem.setText("");
                tasarim.textViewSonuc.setText("");
                islem = "";

            }
        });

        tasarim.buttonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sayi1.equals("")){
                    sayi1 = "";
                    sayi2 = "";
                    tasarim.textViewIslem.setText("");
                    tasarim.textViewSonuc.setText("");
                    islem = "";
                }
                else if(islem.equals("")){
                    sayi1 = sayi1.substring(0,sayi1.length()-1);  // 724358
                    String text = tasarim.textViewIslem.getText().toString();
                    text = text.substring(0,text.length()-1);
                    tasarim.textViewIslem.setText(text);
                }
                else if(!islem.equals("") && (sayi2.equals("") || sayi2.equals("0"))){
                    String text = tasarim.textViewIslem.getText().toString();
                    text = text.substring(0,text.length()-1);
                    islem = "";
                    tasarim.textViewIslem.setText(text);
                }
                else{
                    sayi2 = sayi2.substring(0,sayi2.length()-1);
                    String text = tasarim.textViewIslem.getText().toString();
                    text = text.substring(0,text.length()-1);
                    tasarim.textViewIslem.setText(text);
                }
            }
        });



        tasarim.buttonesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("+")){
                    tasarim.textViewIslem.setText("");
                    sayi1 = String.valueOf(Double.parseDouble(sayi1) + Double.parseDouble(sayi2));
                    tasarim.textViewSonuc.setText(sayi1);
                    sayi2 = "";
                }
                else if(islem.equals("-")){
                    tasarim.textViewIslem.setText("");
                    sayi1 = String.valueOf(Double.parseDouble(sayi1) - Double.parseDouble(sayi2));
                    tasarim.textViewSonuc.setText(sayi1);
                    sayi2 = "";
                }
                else if(islem.equals("x")){
                    temp = sayi2;
                    tasarim.textViewIslem.setText("");
                    sayi1 = String.valueOf(Double.parseDouble(sayi1) * Double.parseDouble(temp));
                    tasarim.textViewSonuc.setText(sayi1);
                    sayi2 = "";
                }
                else if(islem.equals("/")){
                    temp = sayi2;
                    tasarim.textViewIslem.setText("");
                    sayi1 = String.valueOf(Double.parseDouble(sayi1) / Double.parseDouble(temp));
                    tasarim.textViewSonuc.setText(sayi1);
                    sayi2 = "";
                }
                else if(islem.equals("%")){
                    temp = sayi2;
                    tasarim.textViewIslem.setText("");
                    sayi1 = String.valueOf((Double.parseDouble(sayi1) * Double.parseDouble(temp)) / 100);
                    tasarim.textViewSonuc.setText(sayi1);
                    sayi2 = "";
                }

            }
        });




    }
}