package work.beltran.rentaboat

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.NavGraphBuilder
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
