package com.example.pul.ui.viewmodel

import com.example.pul.data.DataSourceProvider
import com.example.pul.data.model.CategoryOptions
import com.example.pul.data.model.Recommendation

data class FesUiState(
    val recommendationLists: Map<CategoryOptions, List<Recommendation>> = emptyMap(),
    val currentSelectedCategory: CategoryOptions = CategoryOptions.LANDMARKS,
    val currentSelectedRecommendation: Recommendation = DataSourceProvider.defaultRecommendation,
    val isShowingFeed: Boolean = true,
    val selectedBottomNavItem: Int = 0
) {
    val currentRecommendationList: List<Recommendation> by lazy {
        recommendationLists[currentSelectedCategory]!!
    }
}