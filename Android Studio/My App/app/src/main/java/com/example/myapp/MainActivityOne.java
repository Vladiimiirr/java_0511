package com.example.myapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivityOne extends AppCompatActivity {
    private Button yes;
    private Button no;
    private TextView textView;
    private boolean [] bool = new boolean[7];
    private boolean boole;
    private Question [] questions =new Question[]{
            new Question(R.string.q1,true),
            new Question(R.string.q2,true),
            new Question(R.string.q3,true),
            new Question(R.string.q4,false),
            new Question(R.string.q5,false),
            new Question(R.string.q6,true),
            new Question(R.string.q7,false),
    };
    private int questionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);

        if(savedInstanceState != null){
            questionIndex = savedInstanceState.getInt("questionIndex");
        }

        getSupportActionBar().hide();
        getWindow (). getDecorView (). setSystemUiVisibility (View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        Intent intent =new Intent(MainActivityOne.this,MainActivityTwo.class);
        Bundle bundle = new Bundle();
        yes =findViewById(R.id.yesButton);
        textView =findViewById(R.id.textView);
        textView.setText(questions[questionIndex].getQuestionResId());
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questions[questionIndex].isAnswerTrue()){
                    boole= true;
                    Toast.makeText(MainActivityOne.this,R.string.correct,Toast.LENGTH_SHORT).show();}// уведомление
                else{
                    boole=false;
                    Toast.makeText(MainActivityOne.this,R.string.incorrect,Toast.LENGTH_SHORT).show();}

                if(questionIndex==6) startActivity(intent); // когда доходит до последнего вопроса, запускается другая активность

                bool[questionIndex]=boole;// сохранение ответов в массиве (true либо false)
                questionIndex =(questionIndex+1)%questions.length; //переход на следующтй вопрос
                textView.setText(questions[questionIndex].getQuestionResId());// установка из массива вопроса
                bundle.putBooleanArray("mas",bool); //после создание объекта bundle сохранем значение массива в этом объекте
                intent.putExtras(bundle);// передача объекта
            }
        });

        no = findViewById(R.id.noButton);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questions[questionIndex].isAnswerTrue()){
                    boole=false;
                    Toast.makeText(MainActivityOne.this,R.string.incorrect,Toast.LENGTH_SHORT).show();}
                else{
                    boole=true;
                    Toast.makeText(MainActivityOne.this,R.string.correct,Toast.LENGTH_SHORT).show();}

                if(questionIndex==6) startActivity(intent);

                bool[questionIndex]=boole;
                questionIndex =(questionIndex+1)%questions.length;
                textView.setText(questions[questionIndex].getQuestionResId());
                bundle.putBooleanArray("mas",bool);
                intent.putExtras(bundle);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("questionIndex",questionIndex);// зохраням значение после уничтожение активности
    }
}