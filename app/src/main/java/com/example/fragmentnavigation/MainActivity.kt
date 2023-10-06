package com.example.fragmentnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.fragmentnavigation.ui.theme.FragmentNavigationTheme

/* dependencies:
*  implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
   implementation("androidx.navigation:navigation-ui-ktx:2.3.5")
   implementation("androidx.navigation:navigation-dynamic-features-fragment:2.3.5") */
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hostFrag = supportFragmentManager
            .findFragmentById(R.id.fragmentID) as NavHostFragment
        navController = hostFrag.navController



    }
}
