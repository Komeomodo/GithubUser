package com.omodokome.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.omodokome.githubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private val navigator: Navigator = Navigator()
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController

    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        if (!NavigationUI.navigateUp(
                navController,
                appBarConfiguration
            ) || super.onSupportNavigateUp()
        ) {
            onBackPressed()
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
    }

}