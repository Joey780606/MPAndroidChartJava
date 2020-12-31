package pcp.com.mympandroidcharttest.bar_chart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import pcp.com.mympandroidcharttest.R;

public class BarChartIntroActivity extends AppCompatActivity {
    Button mbtnBasic, mbtnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchart_intro);

        mbtnBasic = findViewById(R.id.btnBasic);

        mbtnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(BarChartIntroActivity.this, BarChartActivity.class);
                startActivity(i);
            }
        });

    }
}