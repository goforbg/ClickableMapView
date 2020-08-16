package com.androar.clickablemapview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.richpath.RichPath
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Used to display an Indian map view in SVG and display what state was selected using
 * Rich Path Library
 *
 * @since July - 11 - 2020
 * @author goforbg
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        val yellowColor = ContextCompat.getColor(baseContext, R.color.yellow)
        ic_india_map.setOnPathClickListener(RichPath.OnPathClickListener { richPath ->
            unColorRest()
            richPath.fillColor = yellowColor
            onboarding_region.setTextColor(yellowColor)
            when (richPath.name) {
                "Andhra Pradesh" -> {
                    onboarding_region.text = "Andhra Pradhesh"
                }
                "Tamil Nadu" -> {
                    onboarding_region.text = "Tamil Nadu"
                }
                "Rajasthan" -> {
                    onboarding_region.text = "Rajasthan"
                }
                "Andaman and Nicobar" -> {
                    onboarding_region.text = "Andaman and Nicobar"
                }
                "Arunachal Pradesh" -> {
                    onboarding_region.text = "Arunachal Pradesh"
                }
                "Assam" -> {
                    onboarding_region.text = "Assam"
                }
                "Bihar" -> {
                    onboarding_region.text = "Bihar"

                }
                "Chhattisgarh" -> {
                    onboarding_region.text = "Chhattisgarh"
                }
                "Goa" -> {
                    onboarding_region.text = "Goa"
                }
                "Gujarat" -> {
                    onboarding_region.text = "Gujarat"
                }
                "Himachal Pradesh" -> {
                    onboarding_region.text = "Himachal Pradesh"
                }
                "Haryana" -> {
                    onboarding_region.text = "Haryana"
                }
                "Jharkhand" -> {
                    onboarding_region.text = "Jharkhand"
                }
                "Jammu and Kashmir" -> {
                    onboarding_region.text = "Jammu and Kashmir"
                }
                "Karnataka" -> {
                    onboarding_region.text = "Karnataka"
                }
                "Kerala" -> {
                    onboarding_region.text = "Kerala"
                }
                "Maharashtra" -> {
                    onboarding_region.text = "Maharashtra"
                }
                "Meghalaya" -> {
                    onboarding_region.text = "Meghalaya"
                }
                "Manipur" -> {
                    onboarding_region.text = "Manipur"
                }
                "Madhya Pradesh" -> {
                    onboarding_region.text = "Madhya Pradesh"
                }
                "Mizoram" -> {
                    onboarding_region.text = "Mizoram"
                }
                "Odisha" -> {
                    onboarding_region.text = "Odisha"
                }
                "Punjab" -> {
                    onboarding_region.text = "Punjab"
                }
                "Sikkim" -> {
                    onboarding_region.text = "Sikkim"
                }
                "Telangana" -> {
                    onboarding_region.text = "Telangana"
                }
                "Tamil Nadu" -> {
                    onboarding_region.text = "Tamil Nadu"
                }
                "Tripura" -> {
                    onboarding_region.text = "Tripura"
                }
                "Uttar Pradesh" -> {
                    onboarding_region.text = "Uttar Pradesh"
                }
                "Uttarakhand" -> {
                    onboarding_region.text = "Uttarakhand"
                }
                "West Bengal" -> {
                    onboarding_region.text = "West Bengal"
                }
                "Nagaland" -> {
                    onboarding_region.text = "Nagaland"
                }
            }
        })
    }

    private fun unColorRest() {
        for (richPath: RichPath in ic_india_map.findAllRichPaths()) {
            richPath.fillColor = ContextCompat.getColor(baseContext, R.color.colorMap)
        }
    }

}