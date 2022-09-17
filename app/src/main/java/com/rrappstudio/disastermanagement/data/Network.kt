package com.rrappstudio.disastermanagement.data

import com.google.gson.GsonBuilder
import com.rrappstudio.disastermanagement.BuildConfig.BASE_API
import com.rrappstudio.disastermanagement.interfaces.EarthquakeAPI
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object Network {

    private val gsonProvider = GsonBuilder().setLenient().create()
    private val gsonConverterFactory = GsonConverterFactory.create(gsonProvider)

    private val okHttpProvider = OkHttpClient().newBuilder()
        .readTimeout(15, TimeUnit.SECONDS)
        .connectTimeout(15, TimeUnit.SECONDS)
        .build()


    private val retrofitService = Retrofit.Builder().baseUrl(BASE_API).client(okHttpProvider).addConverterFactory(
        gsonConverterFactory).build()

    fun getEarthquakeAPI() : EarthquakeAPI{
        return retrofitService.create(EarthquakeAPI::class.java)
    }

}