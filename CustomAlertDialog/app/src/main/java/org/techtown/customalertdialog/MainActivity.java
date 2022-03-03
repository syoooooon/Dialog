package org.techtown.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Dialog id
    final int DIALOG_CHECK = 1;
    final int DIALOG_EDIT = 2;
    final int DIALOG_ALERT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public CustomAlertDialog setType(int id) {

        //id 값으로 다이얼로그 구분
        switch(id) {
            case DIALOG_CHECK :
                CustomAlertDialog.Builder customBuilder = new CustomAlertDialog.Builder(MainActivity.this);
                customBuilder
                        .setTitle("CheckType")
                        .setMessage("Check type 입니다.")
                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Check", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });
                return customBuilder.create();

            case DIALOG_EDIT :
                CustomAlertDialog.Builder customBuilder2 = new CustomAlertDialog.Builder(MainActivity.this);
                customBuilder2
                        .setTitle("EditType")
                        .setMessage("Edit type 입니다.")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Edit", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });
                return customBuilder2.create();

            case DIALOG_ALERT :
                CustomAlertDialog.Builder customBuilder3 = new CustomAlertDialog.Builder(MainActivity.this);
                customBuilder3
                        .setTitle("AlertType")
                        .setMessage("Alert type 입니다.")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Alert", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });
                return customBuilder3.create();
        }
        return null;
    }


}


    //invisualization 사용하기
    //type별로 구분하기(if문 혹은 switch문)

