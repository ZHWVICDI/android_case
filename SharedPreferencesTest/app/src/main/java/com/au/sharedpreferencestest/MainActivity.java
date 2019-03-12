package com.au.sharedpreferencestest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private SharedPreferences pref;
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;
    private CheckBox rememberPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref=PreferenceManager.getDefaultSharedPreference(this);
        accountEdit=(EditView)findViewById(R.id.account);
        passwordEdit=(EditView)findViewById(R.id.password);
        rememberPass=(CheckBox)findViewById(R.id.remember_pass);
        login(Button)findViewById(R.id.login);
        boolean isRemember=pref.getBoolean("remember_password",false);
        if(isRemember){
            String account=pref.getString("account","");
            String password=pref.getString("password","");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rememberPass.setChecked(true);
        }
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /*SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                String name=editor.getString("name","");
                int age=editor.getInt("age",0);
                boolean married=editor.getBoolean("married",false);
                Log.d(TAG, "name is:"+name);
                Log.d(TAG, "age is: "+age);
                Log.d(TAG, "married is: "+married);*/
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                if(account.equals("admin")&&password.equals("123456")){
                    editor=pref.edit();
                    if(rememberPass.isChecked()){
                        editor.putBoolean("remember_password",true);
                        editor.putString("account",account);
                        editor.putString("password",password);
                    }else{
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent=new Intent(LoginActivity.this)
                }
            }
        });
        saveData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name","Tom");
                editor.putInt("age","28");
                editor.putBoolean("married",false);
                editor.apply();
            }
        });

    }
}
