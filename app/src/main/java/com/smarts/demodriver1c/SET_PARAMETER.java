package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SET_PARAMETER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();

        //Имя (Name) STRING [IN] Имя параметра
        String Name = intent.getStringExtra("Name");
        //Значение (Value) VARIANT [IN] Значение параметра
        String Value = intent.getStringExtra("Value");

        // Действия с оборудованием
        //

        setResult(RESULT_OK);
        super.finish();
    }
}
