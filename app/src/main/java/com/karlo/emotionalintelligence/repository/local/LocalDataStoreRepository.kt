package com.karlo.emotionalintelligence.repository.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocalDataStoreRepository @Inject constructor(
    private val appDataStore: DataStore<Preferences>
) {

    fun fetch(key: String): Flow<String> = appDataStore.data
        .map { preferences ->
            preferences[stringPreferencesKey(key)] ?: ""
        }

    suspend fun saveDataStore(key: String, value: String) {
        withContext(Dispatchers.IO) {
            appDataStore.edit { preferences ->
                preferences[stringPreferencesKey(key)] = value
            }
        }
    }
}