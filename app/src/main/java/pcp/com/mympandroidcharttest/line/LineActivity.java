package pcp.com.mympandroidcharttest.line;

import androidx.appcompat.app.AppCompatActivity;
import pcp.com.mympandroidcharttest.MainActivity;
import pcp.com.mympandroidcharttest.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LineActivity extends AppCompatActivity {
    Button mbtnBasic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);

        mbtnBasic = findViewById(R.id.btnBasic);

        mbtnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(LineActivity.this, LineChartActivity1.class);
                startActivity(i);
            }
        });
    }
}