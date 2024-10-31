package com.example.pul.ui.screens.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.pul.R
import com.example.pul.data.model.Recommendation
import com.example.pul.ui.screens.feed.RecommendationCard

@Composable
fun BaseCategoryScreen(
    recommendationList: List<Recommendation>,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    contentPadding: PaddingValues
) {
    LazyVerticalGrid(
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement
            .spacedBy(dimensionResource(id = R.dimen.padding_very_small)),
        verticalArrangement = Arrangement
            .spacedBy(dimensionResource(R.dimen.padding_small)),
        columns = GridCells.Fixed(2),
    ) {
        items(
            items = recommendationList,
            span = null
        ) {
            RecommendationCard(
                recommendation = it,
                onCardClick = { onRecommendationCardPressed(it) },
                modifier = Modifier.padding(
                    paddingValues = PaddingValues(
                        dimensionResource(id = R.dimen.padding_small)
                    )
                )
            )
        }
    }
}

