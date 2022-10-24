package com.bignerdranch.android.photogalleryactivity.api

import com.bignerdranch.android.photogalleryactivity.FlickrResponse
import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=6b55caca3a8277313e88b98d55461237" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>

}