package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GET_LAST_ERROR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Создаем объект ответа intent
        Intent data = new Intent();
        //Описание ошибки (ErrorText) STRING [OUT] Описание ошибки
        data.putExtra("ErrorText", getResources().getString(R.string.default_error_text));

        // Действия с оборудованием
        //

        setResult(RESULT_OK, data);
        super.finish();
    }
}
