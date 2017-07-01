package com.example.jimmy.basicswedishphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

        switch (view.getId()) {

            case R.id.hello:
                phrase = MediaPlayer.create(this, R.raw.hello);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Hej",Toast.LENGTH_SHORT).show();
                break;

            case R.id.howareyou:
                phrase = MediaPlayer.create(this, R.raw.howareyou);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Hur är det?",Toast.LENGTH_SHORT).show();
                break;

            case R.id.name:
                phrase = MediaPlayer.create(this, R.raw.name);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Vad heter du?",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pleasedtomeetyou:
                phrase = MediaPlayer.create(this, R.raw.pleasedtomeetyou);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Trevligt att träffas",Toast.LENGTH_LONG).show();
                break;
            case R.id.mynameis:
                phrase = MediaPlayer.create(this, R.raw.mynameis);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Jag heter...",Toast.LENGTH_SHORT).show();
                break;
            case R.id.goodbye:
                phrase = MediaPlayer.create(this, R.raw.goodbye);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Hej då",Toast.LENGTH_SHORT).show();
                break;
            case R.id.goodmorning:
                phrase = MediaPlayer.create(this, R.raw.goodmorning);
                phrase.start();
                Toast.makeText(getApplicationContext(),"God morgon ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.goodevening:
                phrase = MediaPlayer.create(this, R.raw.goodevening);
                phrase.start();
                Toast.makeText(getApplicationContext(),"God kväll ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.excuseme:
                phrase = MediaPlayer.create(this, R.raw.excuseme);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Ursäkta",Toast.LENGTH_SHORT).show();
                break;
            case R.id.idontunderstand:
                phrase = MediaPlayer.create(this, R.raw.idontunderstand);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Jag förstår inte",Toast.LENGTH_LONG).show();
                break;
            case R.id.whereisthetoilet:
                phrase = MediaPlayer.create(this, R.raw.whereisthetoilet);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Var är toaletten?",Toast.LENGTH_LONG).show();
                break;
            case R.id.thanks:
                phrase = MediaPlayer.create(this, R.raw.thanks);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Tack",Toast.LENGTH_SHORT).show();
                break;
            case R.id.haveaniceday:
                phrase = MediaPlayer.create(this, R.raw.haveaniceday);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Ha en trevlig dag!",Toast.LENGTH_LONG).show();
                break;
            case R.id.sorry:
                phrase = MediaPlayer.create(this, R.raw.sorry);
                phrase.start();
                Toast.makeText(getApplicationContext(),"Förlåt",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }

}

