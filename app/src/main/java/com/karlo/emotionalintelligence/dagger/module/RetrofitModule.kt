package com.karlo.emotionalintelligence.dagger.module

import com.google.gson.GsonBuilder
import com.karlo.emotionalintelligence.BuildConfig
import com.karlo.emotionalintelligence.constants.DateConstants
import com.karlo.emotionalintelligence.repository.remote.service.IAppService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideIAppService(
        retrofit: Retrofit,
    ): IAppService {
        return retrofit.create(IAppService::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder().baseUrl(BuildConfig.EI_COMPANY_BASE_URL)
            .addConverterFactory(gsonConverterFactory).build()
    }

    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        val gson = GsonBuilder()
            .setDateFormat(DateConstants.DATE_ISO)
            .setLenient()
            .create()
        return GsonConverterFactory.create(gson)
    }

}