package com.liquable.deco.analyze;

public class SentimentScore
{

    private final Sentiment sentiment;

    private final int score;

    public SentimentScore(final Sentiment sentiment, final int score)
    {
        this.sentiment = sentiment;
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public Sentiment getSentiment()
    {
        return sentiment;
    }

}
