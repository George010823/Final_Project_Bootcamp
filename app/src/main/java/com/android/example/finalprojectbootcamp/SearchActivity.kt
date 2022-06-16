package com.android.example.finalprojectbootcamp

import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest.newInstance
import android.net.wifi.p2p.nsd.WifiP2pServiceRequest.newInstance
import android.net.wifi.p2p.nsd.WifiP2pUpnpServiceRequest.newInstance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.android.example.finalprojectbootcamp.databinding.SearchBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.datepicker.MaterialCalendar.newInstance
import org.xmlpull.v1.XmlPullParserFactory.newInstance
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance
import javax.xml.parsers.DocumentBuilderFactory.newInstance

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: SearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = SearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val transactionSearch = supportFragmentManager.beginTransaction()
        transactionSearch.replace(R.id.myNavHostFragment, SearchFragment())
        transactionSearch.addToBackStack(null)
        transactionSearch.commit()

        binding.navigationView.setOnItemSelectedListener {
                menuItem ->
                        when(menuItem.itemId){
                            R.id.destination_home ->{
                                val fragment = HomeFragment()
                                openFragment(fragment)
                                true
                            }
                            R.id.destination_search ->{
                                val fragment = SearchFragment()
                                openFragment(fragment)
                                true
                            }
                            R.id.destination_play ->{
                                val fragment = PlayFragment()
                                openFragment(fragment)
                                true
                            }
                            R.id.destination_user ->{
                                val fragment = UserFragment()
                                openFragment(fragment)
                                true
                            }
                            else -> false
                        }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.myNavHostFragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
