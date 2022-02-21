package org.techtown.alertdialog2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Dialog id
    final int DIALOG_CHECK = 1;
    final int DIALOG_EDIT = 2;
    final int DIALOG_ALERT= 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCheck = findViewById(R.id.btn_check);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CustomAlertDialog(DIALOG_CHECK).show();
            }
        });

        Button btnEdit = findViewById(R.id.btn_edit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CustomAlertDialog(DIALOG_EDIT).show();
            }
        });

        Button btnAlert = findViewById(R.id.btn_alert);
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CustomAlertDialog(DIALOG_ALERT).show();
            }
        });
    }


    //CustomAlertDialog
    public AlertDialog CustomAlertDialog(int id) {
        // id 값에 따라 다이얼로그를 구분해서 띄워줌
        switch(id) {
            case DIALOG_CHECK:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Check type 입니다");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Check", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                return builder.create();

            case DIALOG_EDIT:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setMessage("Edit type 입니다");
                final EditText et = new EditText(this); //EditText 생성
                builder2.setView(et); //EditText 삽입
                builder2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String input = et.getText().toString();
                        Toast.makeText(getApplicationContext(), input, Toast.LENGTH_SHORT).show();
                    }
                });
                return builder2.create();

            case DIALOG_ALERT:
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                builder3.setMessage("Alert type 입니다");
                builder3.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Alert", Toast.LENGTH_SHORT).show();
                    }
                });
                return builder3.create();
        }
        return null;
    }
}