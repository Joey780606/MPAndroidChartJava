package pcp.com.mympandroidcharttest.custom;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.DecimalFormat;

//public class MyAxisValueFormatter implements IAxisValueFormatter
public class MyAxisValueFormatter extends ValueFormatter   // Horse important, above is old, this is newest
{

    private final DecimalFormat mFormat;

    public MyAxisValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    //public String getFormattedValue(float value, AxisBase axis) {
    public String getAxisLabel(float value, AxisBase axis) {    // Horse important, above is old, this is newest
        return mFormat.format(value) + " $\n";
    }
}
