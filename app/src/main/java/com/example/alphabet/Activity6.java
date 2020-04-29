package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity6 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent6;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter6);

        ImageButton button6 = this.findViewById(R.id.button6);
        Button buttonLetters6 = findViewById(R.id.buttonLetters6);
        Button buttonSyllables6 = findViewById(R.id.buttonSyllables6);
        ImageButton buttonNextLetter6 = findViewById(R.id.buttonNextLetter6);

        playSound1();

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent6 = new Intent(Activity6.this, Activity5.class);
                startActivity(intent6);
            }
        });
        buttonLetters6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent6 = new Intent(Activity6.this, MainActivity.class);
                startActivity(intent6);
            }
        });
        buttonSyllables6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent6 = new Intent(Activity6.this, ActivitySyllables.class);
                startActivity(intent6);
            }
        });
        buttonNextLetter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent6 = new Intent(Activity6.this, Activity7.class);
                startActivity(intent6);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter6);
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
