package com.ptp.phamtanphat.fragment0208;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnadda,btnaddb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();

//        btnadda.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentA fragmentA = new FragmentA();
//                fragmentTransaction.add(R.id.framelayout,fragmentA);
//                fragmentTransaction.commit();
//            }
//        });
//        btnaddb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentB fragmentB = new FragmentB();
//                fragmentTransaction.add(R.id.framelayout,fragmentB);
//                fragmentTransaction.commit();
//            }
//        });
    }
    public void AddFragment(View view){
        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;
        switch (view.getId()){
            //Dinh nghia lai cho fragment tren la gi
            case R.id.buttonAddA : fragment = new FragmentA();
                break;
            case R.id.buttonAddB : fragment = new FragmentB();
                break;
        }
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }

    private void anhxa() {
        btnadda = (Button) findViewById(R.id.buttonAddA);
        btnaddb = (Button) findViewById(R.id.buttonAddB);
    }

}
