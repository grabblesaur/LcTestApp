package com.example.lctestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    var someSingletonManager: SomeSingletonManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someSingletonManager = SomeSingletonManager.getInstance(this)
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("FRANK", "onDestroy(): called")
        // FIXME: fix option 2: uncomment the following line to fix the leak
        //someSingletonManager.unregister(this);
    }
}
