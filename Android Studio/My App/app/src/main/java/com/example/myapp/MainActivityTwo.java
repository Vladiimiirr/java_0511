package com.example.myapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private Button go;
    private boolean [] bol = new boolean[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        getSupportActionBar().hide();
        getWindow (). getDecorView (). setSystemUiVisibility (View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Intent intent =new Intent(MainActivityTwo.this,MainActivityOne.class);

        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView4);
        textView3 = findViewById(R.id.textView6);
        textView4 = findViewById(R.id.textView8);
        textView5 = findViewById(R.id.textView10);
        textView6 = findViewById(R.id.textView12);
        textView7 = findViewById(R.id.textView14);

        Bundle bundle = getIntent().getExtras(); // получаем значение, сохраняем в объекте
        if(bundle != null) { //проверка значения
            boolean b[] = bundle.getBooleanArray("mas"); // получаем массив значений из объекта bundle и сохрняем в массив b
            for(int i=0;i<=6;i++) {
                bol[i]=b[i];            //все значения записываем в новый массив
                view(textView1,bol[0]);// вызваем метод, пердаем id и значение из массива
                view(textView2,bol[1]);
                view(textView3,bol[2]);
                view(textView4,bol[3]);
                view(textView5,bol[4]);
                view(textView6,bol[5]);
                view(textView7,bol[6]);
            }
        }

        go =findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);//при нажатии на кнопку переходим на начальную активити
            }
        });
    }
    public TextView view(TextView view, boolean b){
        if (b==true){
            view.setText(R.string.correct);// установка значения из ресурсов
            view.setBackgroundResource(R.color.green);} // установка фона из ресурсов
        else {
            view.setText(R.string.incorrect);
            view.setBackgroundResource(R.color.red);}
    return view;}


}