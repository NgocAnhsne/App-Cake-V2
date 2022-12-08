package deso2.nhom10.appcake;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class ProductActivity extends AppCompatActivity{
    BottomNavigationView nav;
    NavigationView navigationView;

    Button btnIncrease;
    Button btnReduce;
    TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        //TODO: btnIncrease
        btnIncrease =findViewById(R.id.btnIncrease);
        btnReduce =findViewById(R.id.btnReduce);
        txtCount =findViewById(R.id.txtCount);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String increase = txtCount.getText().toString();
                int tang = Integer.parseInt(increase);

                int kq = tang + 1;
                txtCount.setText(String.valueOf(kq));
            }
        });
        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String reduce = txtCount.getText().toString();
                int giam = Integer.parseInt(reduce);

                if(giam > 1){
                    int kq = giam - 1;
                    txtCount.setText(String.valueOf(kq));
                }
            }
        });

    }
}