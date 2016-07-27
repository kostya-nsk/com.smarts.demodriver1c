package com.smarts.demodriver1c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SAVE_DATATAG_RFID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Получаем сообщение из объекта intent
        Intent intent = getIntent();

        //ИДУстройства (DeviceID) STRING [IN] Идентификатор устройства
        String DeviceID = intent.getStringExtra("DeviceID");

        //TID (TID)	STRING [IN/OUT]	TID метки для записи
        String TID = intent.getStringExtra("TID");

        //EPC (EPC)	STRING [IN/OUT]	EPC метки для записи
        String EPC = intent.getStringExtra("EPC");

        //Данные (Data)	STRING [IN]	Данные для записи в банк памяти
        String Data = intent.getStringExtra("Data");

        //БанкПамяти (MemoryBank)	LONG [IN]	Банк памяти для записи.
        //Одно из следующих значений:
        //1 - EPC
        //2 – USER MEMORY
        String MemoryBank = intent.getStringExtra("MemoryBank");

        //Таймаут (Timeout)	LONG [IN]	Таймаут, по которому операция прерывается
        String Timeout = intent.getStringExtra("Timeout");

        // Действия с оборудованием
        //

        // Создаем объект ответа intent
        Intent data = new Intent();
        //TID (TID)	STRING [IN/OUT]	TID метки для записи
        data.putExtra("TID", "TID");
        //EPC (EPC)	STRING [IN/OUT]	EPC метки для записи
        data.putExtra("EPC", "EPC");

        setResult(RESULT_OK, data);
        super.finish();
    }
}
