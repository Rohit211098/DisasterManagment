package com.rrappstudio.disastermanagement.interfaces

import com.rrappstudio.disastermanagement.BuildConfig
import com.rrappstudio.disastermanagement.models.ResponseUSGS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface EarthquakeAPI {

    @GET(BuildConfig.BASE_API)
    suspend fun getEarthquakeData(
        @QueryMap query: HashMap<String,String>
    ): Response<ResponseUSGS>
//


}