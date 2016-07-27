package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GET_VERSION extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Создаем объект ответа intent
        Intent data = new Intent();
        //Версия (Version) STRING [OUT] Версия
        data.putExtra("Version", getResources().getString(R.string.driver_version));
        //Ревизия интерфейса (InterfaceRevision) STRING [OUT] Ревизия интерфейса
        data.putExtra("InterfaceRevision", getResources().getString(R.string.interface_version));

        // Действия с оборудованием
        //

        setResult(RESULT_OK, data);
        super.finish();
    }
}
