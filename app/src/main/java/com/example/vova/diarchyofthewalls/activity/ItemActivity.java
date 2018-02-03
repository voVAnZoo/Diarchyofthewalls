package com.example.vova.diarchyofthewalls.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.example.vova.diarchyofthewalls.R;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        int ItemsRows = 5;
        int ItemsInRow = 5;

        final TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);

        for (int i = 0; i < ItemsRows; i++) {

            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT));
            tableRow.setBackgroundResource(R.drawable.test);

            for (int j = 0; j < ItemsInRow; j++) {
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.test);

                tableRow.addView(imageView, j);
            }

            tableLayout.addView(tableRow, i);
        }
    }
}
