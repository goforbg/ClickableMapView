package com.androar.clickablemapview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.androar.clickablemapview.Constants
import com.androar.clickablemapview.R
import com.richpath.RichPath
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment : Fragment() {

    private var mCountryName: String? = null

    companion object {
        const val TAG = "MapFragment"

        fun newInstance() = MapFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mCountryName = arguments?.getString(Constants.COUNTRY_NAME)

        initView()
    }

    private fun initView() {
        setCountryMap()
    }

    private fun setCountryMap() {
        val yellowColor = ContextCompat.getColor(requireContext(), R.color.yellow)

        when (mCountryName) {
            resources.getString(R.string.india) -> {
                rpv_map.setVectorDrawable(R.drawable.ic_india_map)
            }
            resources.getString(R.string.nepal) -> {
                rpv_map.setVectorDrawable(R.drawable.ic_nepal_map)
            }
        }

        rpv_map?.setOnPathClickListener { richPath ->
            unColorRest()
            richPath.fillColor = yellowColor
            onboarding_region.setTextColor(yellowColor)
            onboarding_region.text = richPath.name
        }

    }

    private fun unColorRest() {
        for (richPath: RichPath in rpv_map.findAllRichPaths()) {
            richPath.fillColor = ContextCompat.getColor(requireContext(), R.color.colorMap)
        }
    }
}