package com.example.newsapi

data class news(
    val articles: List<Any>,
    val status: String,
    val totalResults: Int
)