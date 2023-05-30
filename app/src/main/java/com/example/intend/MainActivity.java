package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText idIn; // поле имени
    private EditText placeIn; // поле адреса
    private EditText timeIn; // поле электронного адреса
    private EditText countIn;
    private Button button; // поле кнопки

    private String id; // поле хранения имени
    private String place; // поле хранения адреса
    private String time;// поле хранения электронного адреса
    private String count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        idIn = findViewById(R.id.idIn);
        placeIn = findViewById(R.id.placeIn);
        timeIn = findViewById(R.id.timeIn);
        countIn = findViewById(R.id.countIn);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            id = idIn.getText().toString();
            place = placeIn.getText().toString();
            time = timeIn.getText().toString();
            count = countIn.getText().toString();

            // создадим объект нашей сущности и через конструктор инициализируем его
            User user = new User(id, place, time, count);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(User.class.getSimpleName(), (CharSequence) user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);
        }
    };

    // обработка нажатия кнопки
    public void onClickA(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}