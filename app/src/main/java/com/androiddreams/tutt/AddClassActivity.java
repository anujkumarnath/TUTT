package com.androiddreams.tutt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class AddClassActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.layout_start_time).setOnClickListener(this);
        findViewById(R.id.layout_end_time).setOnClickListener(this);
    }

    private String getFormattedTime(int hourOfDay, int minute) {
        int formattedHour = hourOfDay;
        String postFix = " AM";
        if (hourOfDay > 12) {
            formattedHour = hourOfDay - 12;
            postFix = " PM";
        }


        return String.format("%02d:%02d %s", formattedHour, minute, postFix);//formattedHour + ":" + minute + postFix;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return false;
    }

    @Override
    public void onClick(final View v) {

        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        int currentMinute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(AddClassActivity.this, new TimePickerDialog.OnTimeSetListener() {
            private TextView textView;
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                switch (v.getId()) {
                    case R.id.layout_start_time:
                        textView = v.findViewById(R.id.tv_start_time);
                        break;
                    case R.id.layout_end_time:
                        textView = v.findViewById(R.id.tv_end_time);
                        break;
                }
                textView.setText(getFormattedTime(hourOfDay, minute));
            }
        }, currentHour, currentMinute, false);

        timePickerDialog.show();
    }
}
