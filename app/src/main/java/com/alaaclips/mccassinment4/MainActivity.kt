package com.alaaclips.mccassinment4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView

class MainActivity : AppCompatActivity() {

    lateinit var plyarView : PlayerView
    lateinit var player: SimpleExoPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var url : String? = intent.getStringExtra("button");


        plyarView = findViewById<PlayerView>(R.id.video_view)

        var smela =SimpleExoPlayer.Builder(this).build()
        plyarView.player = smela


        if(url != null ){
            val mediaItem: MediaItem = MediaItem.fromUri(url);
            smela.addMediaItem(mediaItem)
            smela.prepare()
        }



    }

}