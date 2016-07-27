package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GET_DATATAGS_RFID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();

        //ИДУстройства (DeviceID) STRING [IN] Идентификатор устройства
        String DeviceID = intent.getStringExtra("DeviceID");
        //ИДПакета (PackageID) STRING [IN] Идентификатор пакета данных
        String PackageID = intent.getStringExtra("PackageID");

        // Действия с оборудованием
        //

        // Создаем объект ответа intent
        Intent data = new Intent();
        //ТаблицаМеток (TagsTable) XML таблица STRING [OUT] Пакет с данными меток
        data.putExtra("TagsTable", "XML TagsTable");

        setResult(RESULT_OK, data);
        super.finish();
    }
}
