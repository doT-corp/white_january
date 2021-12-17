package br.kodeout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_info = (Button) findViewById(R.id.btn_info);
        //Metodo OnClick do botão
        btn_info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentEmail = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(intentEmail);
            }
        });

        Button btn_site = (Button) findViewById(R.id.btn_site);

        btn_site.setOnClickListener((View v) -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);

            intent.setData(Uri.parse("https://janeirobranco.com.br"));
            startActivity(intent);
        });

        Button btn_email = (Button) findViewById(R.id.btn_email);
        //Metodo OnClick do botão
        btn_email.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentEmail = new Intent(MainActivity.this,EmailActivity.class);
                startActivity(intentEmail);
            }
        });
    }
}