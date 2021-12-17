package br.kodeout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button btn_sms = (Button) findViewById(R.id.btn_start);
        //Metodo OnClick do botão
        btn_sms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSms = new Intent(InicioActivity.this,MainActivity.class);
                startActivity(intentSms);
            }
        });
    }
}