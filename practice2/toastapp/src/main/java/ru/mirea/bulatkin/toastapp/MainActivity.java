package ru.mirea.bulatkin.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Тупой тост, не прожаренный",
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onClickAnotherToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Я съел ваш супер тост\n"+
                        "Банте",
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0, 0);

        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImage = new ImageView(getApplicationContext());
        catImage.setImageResource(R.drawable.bante);
        toastContainer.addView(catImage, 0);
        toast.show();
    }
}