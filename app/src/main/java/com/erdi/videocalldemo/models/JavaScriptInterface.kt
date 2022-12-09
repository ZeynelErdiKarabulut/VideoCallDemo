package com.erdi.videocalldemo.models

import android.util.Log
import android.webkit.JavascriptInterface

class JavaScriptInterface() {
    @JavascriptInterface
    fun onPeerConnected() {
        Log.i("onPeerConnected","true")
    }
}
