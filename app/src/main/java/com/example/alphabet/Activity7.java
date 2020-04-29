package com.example.alphabet;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity7 extends Activity {

    MediaPlayer mediaPlayer;
    Intent intent7;
    boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter7);

        ImageButton button7 = this.findViewById(R.id.button7);
        Button buttonLetters7 = findViewById(R.id.buttonLetters7);
        Button buttonSyllables7 = findViewById(R.id.buttonSyllables7);
        ImageButton buttonNextLetter7 = findViewById(R.id.buttonNextLetter7);

        playSound1();

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent7 = new Intent(Activity7.this, Activity6.class);
                startActivity(intent7);

            }
        });
        buttonLetters7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent7 = new Intent(Activity7.this, MainActivity.class);
                startActivity(intent7);
            }
        });
        buttonSyllables7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent7 = new Intent(Activity7.this, ActivitySyllables.class);
                startActivity(intent7);
            }
        });
        buttonNextLetter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                intent7 = new Intent(Activity7.this, Activity8.class);
                startActivity(intent7);
            }
        });
    }

    void playSound1(){
        mediaPlayer = MediaPlayer.create(this, R.raw.letter7);
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
