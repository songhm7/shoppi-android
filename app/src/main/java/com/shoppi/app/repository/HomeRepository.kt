package com.shoppi.app.repository

import com.shoppi.app.model.HomeData

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {

    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeDate()
    }
}