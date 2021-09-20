package com.xxx.webview

import android.app.Activity
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.just.agentweb.AgentWeb

object XWebView {
    fun to(activity: Activity, viewGroup: ViewGroup, url: String): AgentWeb {
        return AgentWeb.with(activity)
            .setAgentWebParent(viewGroup, LinearLayout.LayoutParams(-1, -1))
            .useDefaultIndicator().createAgentWeb().go(url)
    }

    fun to(fragment: Fragment, viewGroup: ViewGroup, url: String): AgentWeb {
        return AgentWeb.with(fragment)
            .setAgentWebParent(viewGroup, LinearLayout.LayoutParams(-1, -1))
            .useDefaultIndicator().createAgentWeb().go(url)
    }
}