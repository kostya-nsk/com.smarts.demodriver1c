package com.smarts.demodriver1c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class OPEN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем объект ответа intent
        Intent data = new Intent();
        //ИДУстройства (DeviceID)	STRING [OUT]	Идентификатор устройства
        data.putExtra("DeviceID", "DeviceID");

        // Действия с оборудованием
        //

        setResult(RESULT_OK, data);
        super.finish();
    }

}
