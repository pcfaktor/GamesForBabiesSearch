package com.pcfaktor.gamesforbabies

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity

const val HYPERTEXT_SCHEME = "https://"
const val MARKET_SCHEME = "market://"
private const val BASE_URL = "play.google.com/store/apps/category/FAMILY?age=AGE_RANGE1"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("$MARKET_SCHEME$BASE_URL")))
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("$HYPERTEXT_SCHEME$BASE_URL")
                )
            )

        } finally {
            finish()
        }
    }
}