//package com.example.jarro.vega2017summer;
//
//import android.content.SharedPreferences;
//import android.support.v7.app.AppCompatActivity;
//import android.widget.EditText;
//
//import butterknife.BindView;
//
///**
// * Created by jarro on 6/28/2017.
// */
//
//public class SharedPreferenceActiviity extends AppCompatActivity {
//    private final String EMAIL;
//    private final String PASSWORD;
//    private final String USER;
//    @BindView(R.id.activity_sharedpreference_email)
//    EditText emailEditText;
//    @BindView(R.id.activity_sharedpreference_password)
//    EditText passwordEditText;
//    @Onclick(R.id.activity_sharedpreference_clear)
//    public void clear(View v){
//        String email = emailEditText.getText().toString();
//        String password = passwordEditText.getText().toString();
//        check(email,password);
//    }
//    @Onclick(R.id.activity_sharedpreference_login)
//    public void login(View v){
//        String email = emailEditText.getText().toString();
//        String password = passwordEditText.getText().toString();
//        check(email,password);
//    }
//    private void check(String email, String password){
//        //ignore the check
//        boolean passwordCorrect =true;
//        if(passwordCorrect){
//            SharedPreferences sp = getSharedPreferences("user",MODE_PRIVATE);
//            SharedPreferences.Editor editor = sp.edit();
//            editor.putString("email",email);
//            editor.putString("password",password);
//            editor.commit();
//        }
//
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_shared_preference);
//
//    }
//}
