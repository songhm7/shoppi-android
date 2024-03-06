package com.shoppi.app.repository

import com.google.gson.Gson
import com.shoppi.app.AssetLoader
import com.shoppi.app.model.HomeData

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {
    private val gson = Gson()

    override fun getHomeDate(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let{ homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}