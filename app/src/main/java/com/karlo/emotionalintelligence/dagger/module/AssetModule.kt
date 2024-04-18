package com.karlo.emotionalintelligence.dagger.module

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.karlo.emotionalintelligence.repository.local.datastore.AppDataStore
import com.karlo.emotionalintelligence.util.assets.AssetJsonRetriever
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AssetModule {

    @Singleton
    @Provides
    fun provideAssetJsonRetriever(@ApplicationContext context: Context): AssetJsonRetriever {
        return AssetJsonRetriever(assetManager = context.assets)
    }

}