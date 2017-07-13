package com.cvamedios.reproductorprototipo2.gestionContenido;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v4.media.MediaBrowserServiceCompat.*;
import android.support.v4.media.session.MediaButtonReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.cvamedios.reproductorprototipo2.R;

import java.util.List;

public class VisualPlayer extends AppCompatActivity   {


    private TextView timeTotal;
    private TextView timeProgress;
    private SeekBar progresBar;
    private Button previus;
    private Button next;
    private Button play;

    MediaSessionCompat mMediaSessionCompat;// administrará metadatos y controles/estados de reproducción.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_player);

        timeTotal = (TextView)findViewById(R.id.timeTotal);
        timeProgress = (TextView)findViewById(R.id.timeProgress);

        progresBar  =(SeekBar)findViewById(R.id.progressBar);
        previus =(Button)findViewById(R.id.previus);
        next=(Button)findViewById(R.id.next);
        play =(Button) findViewById(R.id.play_stop);


    }


}
