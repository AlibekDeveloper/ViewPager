package com.example.viewpagerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerlearning.databinding.ActivityMainBinding
import com.example.viewpagerlearning.fragments.DeepFragment
import com.example.viewpagerlearning.fragments.OneFragment
import com.example.viewpagerlearning.fragments.TwoFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var pagerAdapter: PagerAdapter

    val fragList = listOf(
        OneFragment.newInstance(),
        TwoFragment.newInstance(),
        DeepFragment.newInstance()
    )
    val tList = listOf(
        "OneFragment",
        "TwoFragment",
        "DeepFragment"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun init() = with(binding) {
        val adapter = PagerAdapter(supportFragmentManager, fragList)
        vp.adapter = adapter
        TabLayoutMediator(tab, vp) {
                tab, pos ->tab.text = tList[pos]
        }
    }
}