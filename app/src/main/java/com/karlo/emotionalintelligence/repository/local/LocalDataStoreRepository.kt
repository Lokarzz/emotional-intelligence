package com.karlo.emotionalintelligence.repository.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LocalDataStoreRepository @Inject constructor(
    private val appDataStore: DataStore<Preferences>
) {

    fun fetch(key: String): Flow<String> = appDataStore.data
        .map { preferences ->
            preferences[stringPreferencesKey(key)] ?: ""
        }

    suspend fun saveDataStore(key: String, value: String) {
        appDataStore.edit { preferences ->
            preferences[stringPreferencesKey(key)] = value
        }
    }
}