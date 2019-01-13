package com.thedufresnegroup.adufres.metronome

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class WatchHomeScreen : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch_home_screen)

        // Enables Always-on
        setAmbientEnabled()
    }
}
