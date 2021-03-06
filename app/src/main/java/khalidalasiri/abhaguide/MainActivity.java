package khalidalasiri.abhaguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        MyFPAdapter fpAdapter = new MyFPAdapter(getSupportFragmentManager(),getApplicationContext());
        viewPager.setAdapter(fpAdapter);
    }

}