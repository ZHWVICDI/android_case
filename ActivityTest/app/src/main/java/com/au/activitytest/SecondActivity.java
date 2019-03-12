package com.au.activitytest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        //Log.d(TAG, this.toString());
        Log.d(TAG, "TaskId is "+getTaskId());
        /*Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity", data);*/
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /*Intent intent=new Intent();
                intent.putExtra("data_return","Hello FirstActivity!");
                setResult(RESULT_OK,intent);
                finish();*/
                //Intent intent=new Intent(SecondActivity.this,FirstActivity.class);
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed(){
        Intent intent=new Intent();
        intent.putExtra("data_return","Hello FirstActivity!");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
    public static void actionStart(Context context,String data1,String data2){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
}
