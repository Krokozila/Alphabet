package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity2 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent2;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter2);

        ImageButton button2 = this.findViewById(R.id.button2);
        Button buttonLetters2 = findViewById(R.id.buttonLetters2);
        Button buttonSyllables2 = findViewById(R.id.buttonSyllables2);
        ImageButton buttonNextLetter2 = findViewById(R.id.buttonNextLetter2);

        playSound1();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent2 = new Intent(Activity2.this, Activity1.class);
                startActivity(intent2);

            }
        });
        buttonLetters2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent2 = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent2);
            }
        });
        buttonSyllables2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent2 = new Intent(Activity2.this, ActivitySyllables.class);
                startActivity(intent2);
            }
        });
        buttonNextLetter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent2 = new Intent(Activity2.this, Activity3.class);
                startActivity(intent2);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter2);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }
}
