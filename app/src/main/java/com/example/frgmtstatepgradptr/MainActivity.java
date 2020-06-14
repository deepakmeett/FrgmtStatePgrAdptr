package com.example.frgmtstatepgradptr;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    DemoFrag demoFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        viewPager = findViewById( R.id.viewPge );
        demoFrag = new DemoFrag( getSupportFragmentManager() );
        viewPager.setAdapter( demoFrag );
    }
}
