package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity3 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent3;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter3);

        ImageButton button3 = this.findViewById(R.id.button3);
        Button buttonLetters3 = findViewById(R.id.buttonLetters3);
        Button buttonSyllables3 = findViewById(R.id.buttonSyllables3);
        ImageButton buttonNextLetter3 = findViewById(R.id.buttonNextLetter3);

        playSound1();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent3 = new Intent(Activity3.this, Activity2.class);
                startActivity(intent3);
            }
        });
        buttonLetters3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent3 = new Intent(Activity3.this, MainActivity.class);
                startActivity(intent3);
            }
        });
        buttonSyllables3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent3 = new Intent(Activity3.this, ActivitySyllables.class);
                startActivity(intent3);
            }
        });
        buttonNextLetter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent3 = new Intent(Activity3.this, Activity4.class);
                startActivity(intent3);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter3);
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
