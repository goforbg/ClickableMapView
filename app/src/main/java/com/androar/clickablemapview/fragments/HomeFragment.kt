package com.androar.clickablemapview.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.androar.clickablemapview.R
import com.androar.clickablemapview.listener.InteractionListener
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment() {

    private var interactionListener: InteractionListener? = null

    companion object {
        const val TAG = "HomeFragment"

        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_india.setOnClickListener {
            interactionListener?.onClickCountry(resources.getString(R.string.india))
        }

        tv_nepal.setOnClickListener {
            interactionListener?.onClickCountry(resources.getString(R.string.nepal))
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            interactionListener = context as InteractionListener
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onDetach() {
        super.onDetach()
        interactionListener = null
    }
}