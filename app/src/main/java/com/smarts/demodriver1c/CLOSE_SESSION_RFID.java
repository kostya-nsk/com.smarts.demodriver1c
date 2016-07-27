package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CLOSE_SESSION_RFID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();

        //ИДУстройства (DeviceID) STRING [IN] Идентификатор устройства
        String DeviceID = intent.getStringExtra("DeviceID");

        // Действия с оборудованием
        //

        setResult(RESULT_OK);
        super.finish();
    }

}
