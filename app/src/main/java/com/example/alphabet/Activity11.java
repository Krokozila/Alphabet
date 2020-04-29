package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity11 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent11;
    boolean isActive = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter11);

        ImageButton button11 = this.findViewById(R.id.button11);
        Button buttonLetters11 = findViewById(R.id.buttonLetters11);
        Button buttonSyllables11 = findViewById(R.id.buttonSyllables11);
        ImageButton buttonNextLetter11 = findViewById(R.id.buttonNextLetter11);

        playSound1();

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                 intent11 = new Intent(Activity11.this, Activity10.class);
                startActivity(intent11);
            }
        });
        buttonLetters11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent11 = new Intent(Activity11.this, MainActivity.class);
                startActivity(intent11);
            }
        });
        buttonSyllables11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent11 = new Intent(Activity11.this, ActivitySyllables.class);
                startActivity(intent11);
            }
        });
        buttonNextLetter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent11 = new Intent(Activity11.this, Activity12.class);
                startActivity(intent11);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter11);
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
