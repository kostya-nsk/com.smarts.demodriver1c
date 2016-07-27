package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GET_PARAMETERS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем объект ответа intent
        Intent data = new Intent();
        //ТаблицаПараметров (TableParameters) XML таблица STRING [OUT] Список параметров
        data.putExtra("TableParameters", "TableParameters");

        setResult(RESULT_OK, data);
        super.finish();
    }

}
