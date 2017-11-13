package test.zjindu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyProgress pgsBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pgsBar = (MyProgress) findViewById(R.id.pgsBar);
        pgsBar.setMax(100);//设置最值
        pgsBar.setProgress(27);//设置已售数量
    }
}
