/*
 * Copyright 2021 Paul Rybitskyi, paul.rybitskyi.work@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paulrybitskyi.gamedge.feature.info.widgets.main

import androidx.compose.runtime.Immutable
import com.paulrybitskyi.gamedge.feature.info.widgets.companies.GameInfoCompanyModel
import com.paulrybitskyi.gamedge.feature.info.widgets.details.GameInfoDetailsModel
import com.paulrybitskyi.gamedge.feature.info.widgets.header.GameInfoHeaderModel
import com.paulrybitskyi.gamedge.feature.info.widgets.links.GameInfoLinkModel
import com.paulrybitskyi.gamedge.feature.info.widgets.relatedgames.GameInfoRelatedGamesModel
import com.paulrybitskyi.gamedge.feature.info.widgets.screenshots.GameInfoScreenshotModel
import com.paulrybitskyi.gamedge.feature.info.widgets.videos.GameInfoVideoModel

@Immutable
internal data class GameInfoModel(
    val id: Int,
    val headerModel: GameInfoHeaderModel,
    val videoModels: List<GameInfoVideoModel>,
    val screenshotModels: List<GameInfoScreenshotModel>,
    val summary: String?,
    val detailsModel: GameInfoDetailsModel?,
    val linkModels: List<GameInfoLinkModel>,
    val companyModels: List<GameInfoCompanyModel>,
    val otherCompanyGames: GameInfoRelatedGamesModel?,
    val similarGames: GameInfoRelatedGamesModel?
) {

    val hasVideoModels: Boolean
        get() = videoModels.isNotEmpty()

    val hasScreenshotModels: Boolean
        get() = screenshotModels.isNotEmpty()

    val hasSummary: Boolean
        get() = ((summary != null) && summary.isNotBlank())

    val hasDetailsModel: Boolean
        get() = (detailsModel != null)

    val hasLinkModels: Boolean
        get() = linkModels.isNotEmpty()

    val hasCompanyModels: Boolean
        get() = companyModels.isNotEmpty()

    val hasOtherCompanyGames: Boolean
        get() = ((otherCompanyGames != null) && otherCompanyGames.hasItems)

    val hasSimilarGames: Boolean
        get() = ((similarGames != null) && similarGames.hasItems)
}
