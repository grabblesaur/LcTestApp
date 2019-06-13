package com.example.lctestapp

import android.annotation.SuppressLint
import android.content.Context

class SomeSingletonManager {

    companion object {
        @SuppressLint("StaticFieldLeak")
        private lateinit var context: Context

        fun getInstance(context: Context): SomeSingletonManager {
            this.context = context
            return SomeSingletonManager()
        }
    }

}
