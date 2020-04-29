package com.example.alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class ActivitySyllables extends AppCompatActivity {

    public static MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    boolean isActive = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllables);

        // AudioManager audio settings for adjusting the volume
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        ImageButton imageButton33, imageButton34, imageButton35, imageButton36, imageButton37, imageButton38, imageButton39, imageButton40;

        Button buttonLetters;

        imageButton33 = findViewById(R.id.imageButtonMA);
        imageButton34 = findViewById(R.id.imageButtonFA);
        imageButton35 = findViewById(R.id.imageButtonNU);
        imageButton36 = findViewById(R.id.imageButtonHO);
        imageButton37 = findViewById(R.id.imageButtonLU);
        imageButton38 = findViewById(R.id.imageButtonTE);
        imageButton39 = findViewById(R.id.imageButtonBI);
        imageButton40 = findViewById(R.id.imageButtonKYA);
        buttonLetters = findViewById(R.id.buttonLetters);

        imageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound33();
            }
        });

        imageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound34();
            }
        });

        imageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound35();
            }
        });

        imageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();

                }
                playSound36();
            }
        });

        imageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound37();
            }
        });

        imageButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound38();
            }
        });

        imageButton39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound39();
            }
        });

        imageButton40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                playSound40();
            }
        });

        buttonLetters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isActive){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                Intent intent = new Intent(ActivitySyllables.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void playSound33( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.ma);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound34( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.fa);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound35( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.nu);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound36( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.ho);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound37( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.lu);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound38( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.te);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound39( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.bi);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }

    public void playSound40( )  {
        mediaPlayer = MediaPlayer.create(this, R.raw.kya);
        mediaPlayer.setLooping(false);
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
        {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //При готовности к проигрыванию запуск вывода звука:
                mp.start();
                isActive = true;
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                isActive = false;
            }
        });
    }
}

