package com.pw2024.proyectomoviles.util

import android.util.Log
import org.json.JSONException
import org.json.JSONObject
import retrofit2.HttpException

class ErrorExtractor {
    companion object {
        fun extractErrorMessage(exception: HttpException): String? {
            val errorBody = exception.response()?.errorBody()?.string()?.trim()
            if (!errorBody.isNullOrEmpty()) {
                try {
                    val jsonObject = JSONObject(errorBody)
                    return jsonObject.getString("error")
                } catch (jsonException: JSONException) {
                    Log.e("error", "Error parsing JSON", jsonException)
                }
            } else {
                Log.d("error", "Error body is null or empty")
            }
            return null
        }
    }
}