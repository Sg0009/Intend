package com.example.intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // создание полей
    private TextView dataMainActivity; // поле вывода информации из главной активити
    private Button button;
    private ImageButton imageButton; // кнопка переключения на главную активити

    private User user; // поле сущности пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка id к полю
        dataMainActivity = findViewById(R.id.dataUser);
        button = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton);


        // считывание данных из главной активити
        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) { // если в данном контейнере что-то есть, то

            // инициализация поля сущности пользователя
            user = (User) bundleIntent.getSerializable(User.class.getSimpleName());

            // вывод на экран данных из главной активити
            dataMainActivity.setText("Id " + user.getId() + "\n"
                    + "Место " + user.getPlace() + "\n"
                    + "Время " + user.getTime() + "\n" + "Стоимость " + user.getCount());
        }

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
        imageButton.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View view) {
            // переключение на другой экран
            Intent intent = new Intent(getApplicationContext(), MainActivity.class); // создание намерения переключения на другой экран
            startActivity(intent); // запуск дополнительной активити через намерение
        }
    };




        public void onClick (View  view) {
            Intent intent = new Intent(this, MainActivity.class);
            //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); // использование флага перемещения нужной активности на вершину стека
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // использование флага уничтожения всех активности кроме той которая требуется
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // использование флага перехода к нужной активности без перемещения данной активности в стеке
            startActivity(intent);
        }
    }


