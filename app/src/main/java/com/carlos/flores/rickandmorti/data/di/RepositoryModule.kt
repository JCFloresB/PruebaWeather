package com.carlos.flores.rickandmorti.data.di

import com.carlos.flores.rickandmorti.data.remote.api.ApiService
import com.carlos.flores.rickandmorti.data.repository.WeatherRepositoryImpl
import com.carlos.flores.rickandmorti.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideWeatherRepository(
        api: ApiService
    ): WeatherRepository {
        return WeatherRepositoryImpl(api)
    }
}