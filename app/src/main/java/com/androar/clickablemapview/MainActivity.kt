package com.androar.clickablemapview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import com.androar.clickablemapview.listener.InteractionListener
import com.richpath.RichPath
import kotlinx.android.synthetic.main.fragment_map.*

/**
 * Used to display an Indian map view in SVG and display what state was selected using
 * Rich Path Library
 *
 * @since July - 11 - 2020
 * @author goforbg
 */
class MainActivity : AppCompatActivity(), InteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickCountry(countryName: String) {
        val bundle = Bundle()
        bundle.putString(Constants.COUNTRY_NAME, countryName)

        findNavController(R.id.container).navigate(
            R.id.action_homeFragment_to_mapFragment, bundle
        )
    }

}