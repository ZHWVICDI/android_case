package com.au.uiwidgettest;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.edit_text);
        imageView=(ImageView)findViewById(R.id.image_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*String inputText=editText.getText().toString();
                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.img_2);
                if(progressBar.getVisibility()==View.GONE)
                    progressBar.setVisibility(View.VISIBLE);
                else progressBar.setVisibility(View.GONE);
                int progress=progressBar.getProgress();
                progress+=10;
                progressBar.setProgress(progress);*/
               /* AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){

                    }
                });
                dialog.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){

                    }
                });
                dialog.show();*///ALERTDIALOG组件
                ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });
    }
}
