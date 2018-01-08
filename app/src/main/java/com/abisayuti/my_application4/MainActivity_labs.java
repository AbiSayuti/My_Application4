package com.abisayuti.my_application4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_labs extends AppCompatActivity {

    //tipe data
    String namaFirst =  "Abi";
    String namalast = "Sayuti";

    //deklarasi widget

    TextView txtWelcome;

    EditText etnama,  etsekolah;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_labs);

//        System.out.println("Full name : " + namaFirst + " " + namalast);

        //memanggil id dari textview
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etnama = (EditText)findViewById(R.id.etnama);
        etsekolah = (EditText)findViewById(R.id.etsekolah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //menambahkan aksi ketika btnSubmit di klik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil data dari etnama dan etsekolah
                String nNama = etnama.getText().toString();
                String nSekolah = etsekolah.getText().toString();

                //menampilkan hasil textview
                txtWelcome.setText("Hallo , " + nNama + " dari sekolah " + nSekolah);

            }
        });




        //menampilkan hasil teks ke widget textview

//        txtWelcome.setText("Hy , " +  namaFirst + " " + namalast);
    }


}
